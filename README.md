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

# Implementation Flow
Below is the step-by-step flow followed to build this microservices application

<img width="784" height="585" alt="Screenshot 2026-04-21 133214" src="https://github.com/user-attachments/assets/8e492fb9-6587-4c9a-a887-24ca3d83c093" />
<img width="783" height="581" alt="image" src="https://github.com/user-attachments/assets/d4d46ca0-8a31-420f-b3d9-165425f041d4" />




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

# Blog 
For a detailed step-by-step explanation, check out my Medium article 
👉 [Microservices using Spring Boot](https://medium.com/@praveenabaskar123/microservices-using-springboot-08e07ff31d40)
