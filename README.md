# mystore-teamDelta
Front end repository for my store from Team Delta

Welcome to My Store Application! This Java-based application is designed to provide an interactive shopping experience. Customers can browse through a wide range of products, add items to their cart, and place orders seamlessly. The application is built with simplicity and efficiency in mind, making it an ideal solution for both customers and store administrators.

## Features

1.    Display of products with detailed information (name, price, description, etc.)
2.    Easy product search and filtering options
3.    Shopping cart functionality to add, remove, and update items
4.    Secure user authentication and registration
5.    Administrator functionalities for managing products, users, and orders

## Prerequisites
Before running the My Store Application, ensure you have the following prerequisites installed on your system:
1.    Java Development Kit (JDK) version 11 or higher
2.    MySQL Server (or any compatible relational database) for data storage

## Installation
1.    Clone the repository to your local machine:
-    git clone https://github.com/yourusername/my-store-application.git
    
2.    Navigate to the project directory:
-    cd my-store-application
     
3.    Import the project into your preferred Java IDE.
    
4.    Set up the MySQL database with the provided SQL schema and populate it with sample data (if available).
    
5.    Configure the database connection in the application. Locate the application.properties file and update the following:
-    spring.datasource.url=jdbc:mysql://your_database_host:your_database_port/your_database_name
-    spring.datasource.username=your_database_username
-     ing.datasource.password=your_database_password
    
6.    Build the application using your IDE or Gradle:
-    ./gradlew build

## Usage
1.    Run the application from your IDE or using the command:
-    ./gradlew bootRun
     
2.    Access the application via your web browser:
-    http://localhost:8080
     
3.    Create an account or log in to start shopping.
    
4.    Explore the product catalog, add items to your cart, and proceed to checkout.

5.    As an administrator, log in with appropriate credentials to manage products, users, and orders.

## Technologies used:

1.    Frontend: HTML, CSS, JavaScript, React
2.    Backend: Java, Spring Boot
3.    Database: MySQL

## License
This project is licensed under the MIT License.
