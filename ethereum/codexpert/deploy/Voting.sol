pragma solidity ^0.6.6;

contract Election {

    struct Candidate {
        uint id;
        string name;
        uint voteCount;
    }
    
    /*
    Mapping types are declared as mapping(_KeyType => _ValueType). 
    _KeyType can be almost any type except for a mapping, a dynamically sized array, a contract, an enum and a struct. 
    _ValueType can actually be any type, including mappings.
    
    So this mapping will map the id to a Candidate struct.
    */
    mapping (uint => Candidate) public candidates;
    
    // This uint will serve as an id for each candidate that will be stored in a map below.
    // The id will simply be incremented for each candidate.
    uint public candidateIdIncrement;
    
    // We will store true if the the voter at the address has already voted, fals otherwise.
    mapping (address => bool) public voter;

    event eventVote(
        uint indexed _candidateId 
    );

    constructor() public {
        // Constructor is once executed when this smart contract is deployed to the blockchain. 
        // Here we use it to add candidates to the candidates mapping.
        addCandidate("Alice");
        addCandidate("Bob");
        
        // Note that the way this contract is built, the list of candidates can't be modified after deployment!
        // (We could add functionality for that later)
    }
    
    // Add a candidate
    function addCandidate(string memory _name) private {
        // Increment the candidate id.
        candidateIdIncrement++;
        // Store a new Candiate struct instance in the candidates mapping.
        candidates[candidateIdIncrement] = Candidate(candidateIdIncrement, _name, 0);
    }
    
    function vote(uint _candidateId) public {
        
        // Constraint 1: Voter can not yet have voted already.
        // Here msg.sender is the address of the voter, which we have registered to a boolean in our voter mapping.
        require(!voter[msg.sender]);
        // Constraint 2: _candidateId must be valid.
        require(_candidateId > 0 && _candidateId <= candidateIdIncrement);
        
        // Mark the voter as having performed a vote.
        voter[msg.sender] = true;
        // Increase the vote count of the candidate.
        candidates[_candidateId].voteCount++;
        
        emit eventVote(_candidateId);
    }
}