# Introduction

The My Store Application is an e-commerce platform that allows users to browse and purchase products online. This design document outlines the links to the external documents, Architecture, and ApI Endpoints of the application. The project will be hosted on GitHub for collaborative development and version control.

### ER diagarams are in below path:

https://github.com/WSUCEG-7140/mystore-teamDelta/blob/main/ER%20diagaram.txt

### Design

This design documents illustrate how the Team-Delta Students implemented the Mystore application by following @ref Requirements.

@section Project Project Overview

Mystore Application developed using HTML, CSS, Java and MySQL. This application helps user to register, login, search products and place orders.

## Features
1. Register: Create a new account by providing your username, password, mobilenumber and email.
2. Login: Login to your account using your credentials. If the credentials are not match it will show the error message.
3. Inventory: Monitor the stock levels of the store by tracking both incoming orders and available products.
4. Orders: Capture and oversee customer purchase requests, encompassing order specifics, quantities, and costs.stores order details (id, user_id, total_amount, order_date, etc.).
5. Products: Manage product details, including product names, prices, and stock availability.stores product details (id, name, price, description, etc.).
6. users: stores user information (id, username, email, password, etc.)
7. cart_items: stores items added to the user's shopping cart (id, user_id, product_id, quantity, etc.)
8. order_items: stores individual items within an order (id, order_id, product_id, quantity, etc.)

@section ModelViewController Model View Controller

This design applies the [Model View Controller](https://en.wikipedia.org/wiki/Model–view–controller) Design Pattern.

## Model

The Model consists of the following components:

@anchor R30_0 https://github.com/WSUCEG-7140/mystore-teamDelta/tree/main/server/src/main/java/com/backend/server/Model/Payment.java>

@anchor R6_0 https://github.com/WSUCEG-7140/mystore-teamDelta/tree/main/server/src/main/java/com/backend/server/Model/User.java

@anchor R11_0 https:https://github.com/WSUCEG-7140/mystore-teamDelta/tree/main/server/src/main/java/com/backend/server/Model/Inventory.java


## View
<br>
<br>

## Controller

The Controller consists of the following component:

@anchor R11_0 https:https://github.com/WSUCEG-7140/mystore-teamDelta/tree/main/server/src/main/java/com/backend/server/controller/InventoryApis.java

@anchor R12_0 https:https://github.com/WSUCEG-7140/mystore-teamDelta/tree/main/server/src/main/java/com/backend/server/controller/UserApis.java

### API Endpoints
The backend will expose the following API endpoints:

/api/auth/signup - User registration

/api/auth/login - User login and authentication

/api/products - Retrieve all products

/api/products/{id} - Retrieve a specific product by ID

/api/cart - Retrieve the shopping cart for the authenticated user

/api/cart/add - Add an item to the shopping cart

/api/cart/remove - Remove an item from the shopping cart

/api/orders - Retrieve order history for the authenticated user

/api/orders/{id} - Retrieve a specific order by ID

/api/orders/place - Place a new order

