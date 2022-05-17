# Spring Books - Hello GraphQL

This is a demo project that will introduce you to [https://spring.io/projects/spring-graphql](Spring for GraphQL). 
The Spring Boot application uses Spring for GraphQL and creates a single endpoint at `/graphql` for all GraphQL queries.
If you want to test out the application you can use the GraphiQL UI located at http://localhost:8080/graphiql

If you want to learn more you can check out my Intro to Spring for GraphQL article + video over on my blog: 

TODO: Add Blog Post Here

## Development 

- Run the Spring Boot application which will run on port 8080
- Run the Vue application (/src/frontend) with the command `npm run dev` and it will start up on port 3000

## Packaging 

When you run `mvn clean package` command the frontend Vue application will be built into the `/dist` directory. 
The Maven plugin maven-resources-plugin will copy the contents of the build directory into `/target/static/classes`. 
Once the artifact has been created you can run the application using the following command: 

` java -jar target/spring-books-0.0.1-SNAPSHOT.jar`