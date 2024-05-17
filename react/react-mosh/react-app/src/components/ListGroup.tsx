import App from "../App";
import { MouseEvent } from "react";

function ListGroup() {
  let items = ["NYC", "Toronto", "Tokyo", "Paris", "Berlin"];
  //items = [];

  // Event handler
  const handleClick = (e: MouseEvent) => console.log(e.target);

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
            <li className="list-group-item" onClick={handleClick} key={k}>
              {i}
            </li>
          ))
        }
      </ul>
    </>
  );
}

export default ListGroup;
