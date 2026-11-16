ProductApi
Description
ProductApi is a RESTful web service developed using Spring Boot as part of Exercise 16.

The application provides full CRUD (Create, Read, Update, Delete) functionality for managing products and includes:

Spring Boot REST API
Swagger/OpenAPI documentation
Spring Data JPA
H2 Database integration
Exception handling
Product management endpoints
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

Example:

404 Not Found
Product not found
Swagger Documentation
Swagger UI is available at:

http://localhost:8080/swagger-ui/index.html
OpenAPI JSON definition:

http://localhost:8080/v3/api-docs
Screenshots
Swagger UI
Screenshot showing the generated OpenAPI documentation and available endpoints.

Create Product (POST)
Screenshot showing successful product creation.

Get All Products
Screenshot showing all products returned by the API.

Get Product By ID
Screenshot showing retrieval of a specific product.

Update Product (PUT)
Screenshot showing successful product update.

Delete Product
Screenshot showing successful product deletion.

Product Not Found (404)
Screenshot showing the custom exception handling response.

Author
Claris Ropafadzo Muchono

Exercise 16 - Spring Boot REST API Project
