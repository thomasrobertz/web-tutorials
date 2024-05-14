// Pascal casing in React: Message instead of message
function Message() {
    // Returning JSX (Javascript XML) - this is not HTML!
    // Will be transpiled to JS using babel (see babeljs.io/repl to try)

    // Dynamic content is easy in JSX:
    const name = "Thomas";
    return <h1>Hello {name}</h1>
}

export default Message;