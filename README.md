 # Superheroes
 
## Development
This is a simple project created using `Angular` and `Spring Boot` . Data for the project was
stored in `Postgres` and caching was implemented using `Redis`. Authentication was implemented using
`Json Web Token` and state management using `NgRx`. An api was built to help the frontend communicate with 
the backend The frontend was tested using `Cypress` and the backend  used `Mockito`.

## Deployment
Both the frontend backend were bundled together using the `frontend-maven-plugin` with some configurations
made to the `package.json`  and the backend ends `pom.xml`. The commands `mvn clean` and `mvn -Dmaven.test.skip package`
was used to create a jar file. The code was published on [Render](https://render.com) in a  `docker` container  and can be accessed using
this link [superheroes](https://superheroes-qn46.onrender.com)