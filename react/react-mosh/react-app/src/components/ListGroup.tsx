import App from "../App";

function ListGroup() {
  const items = ["NYC", "Toronto", "Tokyo", "Paris", "Berlin"];

  return (
    <>
      <h1>List</h1>
      <ul className="list-group">
        {
          // In JSX use curly braces to break into JS
          items.map((i, k) => (
            /* The following is JSX again.
                We also see how we give each element it's key.
            */
            <li key={k}>{i}</li>
          ))
        }
      </ul>
    </>
  );
}

export default ListGroup;
