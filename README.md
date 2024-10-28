# DUMBO
Design a REST based API to do user-defined-task. This is for experimental purposes. Do not try this software if under legal age. If you cant buy beer, then might as well not use DUMBO.

Contents:
- [DUMBO](#dumbo)
- [Documentation](#documentation)
- [Setup](#setup)
- [Links](#links)

# Documentation

DUMBO is primarily designed to tackle the problem of `user-desired-task`. 
This is much different then a `user-defined-task`. one difference is that the former is dynamic 
while the other is static. 

We want to design an API that can dynamically solve an issue of arbitrary complexity and 
wide range of issues. These can range from communication channels, send a picture, make a joke, 
write an excuse etc. DUMBO is basically a servant ready to serve the user --master. 
The old fashioned master-slave architecture can be applied. 
Though the nomencalture of `user-deisred-task` is new but the idea is old as time.

More than anything DUMBO is a test app, ready to take a request and perform an event. 

The purpose of this exercise is primarily to test the functionality of the backend and frontend. 
The exercise will expand as the levels are completed. The final look or feel of the API is to be 
a service based app. It will perform the required task as the user specify.

API (Application Programming Interface) is a software that accepts a user request and provides a 
response accordingly. For instance: To search or read an ID from a table. It can be designed to handle
complicated request and business logic. The standard architecture of an API consist simply of DB. Third
component can be a container (though seems an overkill) but it is considered extra. (an open question).

Any standard API has the following parts:

1. CRUD: the first challenge of an API is to perform data management. In this context it will be to add,
   read or delete data. 
2. Auth: certain data is considered private. It can be a set of sophisticated data, such as: government
   docs. A task can be to require authentication before a deleted operation.
3. Association: when multiple tables are present, a relation or association is required. this can be 
   advancement on the data manipulation theme.


The following are the open task:

[] Hello World in Spring framework.

[] Create a GET HTTP method which sends back a funny response.

[] Send a message and take a response accordingly.


------------------------------
------------------------------

There is further development. We will serve `DUMBO` as to be the Spring basic project. The simplest exercise to perform is a 
fully operational CRUD functionality in Spring framework. This will require:

- Set up the Spring project. It will be called `DUMBO-api`.
- Create a local database interface. 
- Setup an ORM functionality.
- Connect the api with the db through the ORM feature.
- Create the controller, service, repository etc.
- Check the pom file.
- Test the HTTP methods (GET,POST,DELETE).

# Setup

Q. How to setup the Spring Project?

1. Go to the website (`https://spring.io/guides/gs/spring-boot/`) and download a zip folder from Building an Application with Spring Boot.
2. Unzip the folder.
3. Specify the src folder (mark the directory). Then mark the pom file. This will fix the Spring Annotation errors.
4. Get into the correct directory and run `./mvnw install`.
5. Run the server: `./mvnw spring-boot:run`
6. Do curl command on the specified port. Output be displayed.

## Contents

 - database connection and management. Able to load, download and create text data []
 - route handling []
 - third-party service integration []
 - Bussiness Logic []
 - Infrastructure Operations []

## Report-Notes

- (01/05/2023) - I pull the master branch. but the src folder is not found
                 in the IntelliJ. It exists in the folder. how to retrieve it?
                 the solution is to delete the `.idea` folder. 
- (01/05/2023) - the command `./mvnw` does not run. the `java-home` is not
                 found. though the java compiler works in the cmd test. currently
                 not sure?

## Links

- https://olly.bot/

