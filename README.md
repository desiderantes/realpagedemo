## How to run:

```shell script
./gradlew bootRun
```

DB migrations are performed with Flyway, check the [documentation](https://flywaydb.org/documentation/gradle/) for instructions on performing the migration

Runs by default on port `8080`
You can override the Spring Datasource properties to change the db connection info.

Migration scripts are located in `src/main/resources/db/migration`


## Structure:

`config` contains the system configs.

`model` contains the JPA Entities with the relationships expressed as annotations.

`repository` contains a set of interfaces that Spring will pickup and use to generate repositories that access the data.

This project uses HAL and HATEOAS for the REST interface.

The available endpoints are 

* `/api/v1/users` : Operations on User (GET, POST PUT, DELETE)