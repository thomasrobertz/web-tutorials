import App from "../App";

function ListGroup() {
  let items = ["NYC", "Toronto", "Tokyo", "Paris", "Berlin"];
  //items = [];

  return (
    <>
      <h1>List</h1>
      {
        // true && "value" will render "value"
        // false && "value" will render nothing
        items.length === 0 && <p>No items found</p>
      }
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
