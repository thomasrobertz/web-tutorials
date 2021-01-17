Follow-along of the CodeXpert Etherum DApp Tutorial
https://www.youtube.com/watch?v=omJRDY6xJss&list=PLL5pYVd8AWtSx0Gd-0CultL8O67HqvhI4

1. Install Metamask plugin for Chrome.
2. npm install 
3. node index.js
4. Navigate to http://localhost:3000/

In index.html: Metamask supplies a window.etherum object.
Then attempts to connect to Metamask and runs the DApp, using the web3 API.

Create an owner account and a couple of voter accounts, switch to a test network (Goerli worked for me) and get some ether:

https://goerli-faucet.slock.it/
https://app.mycrypto.com/add-account
https://faucet.metamask.io/

Then connect the owner to remix and deploy Voting.sol as "Injected web3" from remix.
After a while on the bottom of the deploy bar, the interactive contract API should show up (in remix).