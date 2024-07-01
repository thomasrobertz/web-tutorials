# Run

`docker run -p 5432:5432 --name postgres-local-dev -e POSTGRES_PASSWORD=mysecretpassword -d postgres`

# Data

Tried to use Flyway, it doesn't support PostGres 16.3.
So added table by hand:

```postgres-psql
CREATE TABLE student(
    id SERIAL NOT NULL PRIMARY KEY,
    firstname VARCHAR(250),
    lastname VARCHAR(250),  
    age INTEGER           
)
```

Then uncomment `init()` to insert test data on first run.