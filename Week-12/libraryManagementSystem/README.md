# Library Management System REST API

This project provides a REST API capable of performing CRUD (Create, Read, Update, Delete) operations for a library
management system.

## Technologies

- Java
- Spring Boot
- Spring Data JPA
- PostgresSQL
- Lombok
- Model Mapper
- Swagger

## Installation

1. **Clone this repository**

```
git clone https://github.com/furkangelensoy/patikaPlus/tree/master/Week-12/libraryManagementSystem
```

2. **Database Setup**

    1. Create a PostgreSQL database.
    2. Set your database connection details in `application.properties` file.


3. **Run the Application**

   Navigate to the project directory and run the following command:

    ```
    mvn spring-boot:run
    ```

4. **API Endpoints**

   | HTTP Method | Endpoint            | Description                                 |
   |-------------|---------------------|---------------------------------------------|
   | GET         | /books              | List all books                              |
   | GET         | /books/{id}         | Get a specific book                         |
   | POST        | /books              | Add a new book                              |
   | PUT         | /books/{id}         | Update a specific book                      |
   | DELETE      | /books/{id}         | Delete a specific book                      |
   | GET         | /categories         | List all categories                         |
   | GET         | /categories/{id}    | Get a specific category                     |
   | POST        | /categories         | Add a new category                          |
   | PUT         | /categories/{id}    | Update a specific category                  |
   | DELETE      | /categories/{id}    | Delete a specific category                  |
   | GET         | /publishers         | List all publishers                         |
   | GET         | /publishers/{id}    | Get a specific publisher                    |
   | POST        | /publishers         | Add a new publisher                         |
   | PUT         | /publishers/{id}    | Update a specific publisher                 |
   | DELETE      | /publishers/{id}    | Delete a specific publisher                 |


## UML Diagram
![uml](https://github.com/furkangelensoy/patikaPlus/assets/134130366/2a726654-246d-491b-b099-44e4e325ea9b)
