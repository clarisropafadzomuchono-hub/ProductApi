ProductApi
Description
ProductApi is a RESTful web service developed using Spring Boot as part of Exercise 16.

The application provides complete CRUD (Create, Read, Update, Delete) functionality for managing products and demonstrates the use of modern Spring Boot technologies, including Swagger/OpenAPI documentation, Spring Data JPA, and H2 Database integration.

Features
Create Product (POST)
Get Product By ID (GET)
Get All Products (GET)
Update Product (PUT)
Delete Product (DELETE)
Exception Handling
Swagger/OpenAPI Documentation
H2 Database Integration
Spring Data JPA
Technologies Used
Java 21
Spring Boot
Maven
Spring Data JPA
H2 Database
Swagger / OpenAPI
IntelliJ IDEA
API Endpoints
Create Product
POST

/api/v1/products
Example Request:

{
  "name": "Product A"
}
Get Product By ID
GET

/api/v1/products/{id}
Example:

/api/v1/products/1
Get All Products
GET

/api/v1/products
Update Product
PUT

/api/v1/products/{id}
Example Request:

{
  "name": "Updated Product"
}
Delete Product
DELETE

/api/v1/products/{id}
Example:

/api/v1/products/1
Exception Handling
The application handles invalid requests and returns appropriate HTTP responses.

Example response:

404 Not Found
Product not found
Swagger Documentation
Swagger UI:

http://localhost:8080/swagger-ui/index.html
OpenAPI JSON:

http://localhost:8080/v3/api-docs
Screenshots
Swagger UI
API documentation generated automatically using Swagger/OpenAPI.

Create Product (POST)
Successful creation of a new product.

Get All Products
Retrieving all products stored in the database.

Get Product By ID
Retrieving a single product using its ID.

Update Product (PUT)
Updating an existing product.

Delete Product
Successfully deleting a product.

Product Not Found (404)
Example of custom exception handling for non-existing products.

Author
Claris Ropafadzo Muchono

Exercise 16 - Spring Boot REST API Project
