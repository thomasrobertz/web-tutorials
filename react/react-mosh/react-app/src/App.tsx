import Message from "./Message";

/*
with the App component that contains the Message component, we have a
  -Component Tree
  -a *Virtual DOM*:

    div
     |
     v
     h1

  It's a lightwheight, in-memory representation of our component tree.
  In this vDOM, each node represents a Component with its properties.
  When data in a node changes, React updates the vDOM to reflect the current state.

  Next, it compares this new vDOM with the previous version to find the nodes that should
  be updated (in the actual DOM). This is called reconciliation.

  The logic for this is implemented in the react-dom library.

*/

function App() {
  return <div><Message /></div>;
}

export default App;