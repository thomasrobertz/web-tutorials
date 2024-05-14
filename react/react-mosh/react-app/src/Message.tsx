// Pascal casing in React: Message instead of message
function Message() {
    // Returning JSX (Javascript XML) - this is not HTML!
    // Will be transpiled to JS using babel (see babeljs.io/repl to try)

    // Dynamic content is easy in JSX:
    return <h1>Hello {getName()}</h1>
}

function getName() {
    return "Thomas";
}

export default Message;