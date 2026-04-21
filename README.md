# E-Commerce Microservices Application

# Project Overview
This project is a microservices-based e-commerce application built using Spring Boot.
It demonstrates how multiple independent services communicate using Eureka Server, Feign Client, and API Gateway.

# Technologies Used
- Java 21
- Spring boot
- Spring Data JPA
- PostgreSQL
- Maven
- Spring Cloud (Eureka, OpenFeign, Gateway)
- Postman

# Microservices Details
## User Service 
- create user
- get user details
## Product Service
- create product
- get product details
## Order Service
- place order
- fetch user and product using feign client
## Service Communication
- Eureka Server -> Service registry
- Feign client -> Inter-service Communication
- API Gateway -> Routing

# Project Structure 
Each service follows a similar structure 
```
src/main/java/com/microservices
│
├── controller   -> Handles API requests 
├── service      -> Contains Business Logic
├── repository   -> Database operations
├── entity       -> Database Entities
├── dto          -> Data Transfer Objects
|── feign        -> Feign client interfaces

src/main/resources
│
├── application.properties ->Configuration (DB, Eureka, Port)

```

# Running the Application
Start Services in the following order
1. Eureka Server
2. User Service
3. Product Service
4. Order Service
5. API Gateway

# Service URL's
- Eureka Server -> http://localhost/8761
- API Gateway   -> http://localhost/8080

# API Endpoints

| Service | Method | Endpoint                               | Description       |
| ------- | ------ | ------------------                     | ----------------- |
|  User   | POST   | /users/adduser                         | Create User       |
|         | GET    | /users/getuser/{id}                    | Get User by ID    |
|         | GET    | /users/getallusers                     | Get all Users     |
| Product | POST   | /products/addproduct                   | Create Product    |
|         | GET    | /products/getproduct/{id}              | Get Product by ID |
|         | GET    | /users/getallproducts                  | Get all Products  |
| Order   | POST   | /orders/placeorder                     | Create Order      |
|         | GET    | /orders/getorder                       | Get all orders    |
