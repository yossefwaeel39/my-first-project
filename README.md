# E_commerce_project
 I Wrote it in  22/4/2024
"This is my first project on GitHub."
it's an E-commerce_project it's very simple 

1. Electronicproduct, ClothingProduct, BookProduct: These classes represent the different types of products available in the e-commerce system.
2.Customer: This class represents the customer with their information (ID, name, and address).
3.Cart: This class represents the shopping cart that contains an array of products.
4.Order: This class represents the order which includes details about the ordered products and total price.


E_commerce_system Class (Main Class)

Purpose: This main class serves as the entry point to run the e-commerce system.
Steps:
Collect customer information (ID, name, and address).
Ask the user how many products they would like to order.
Create an array (selectedProducts) to store the chosen products.
Prompt the user to add products to the cart by entering the corresponding numbers for each product.
Create a Cart instance and add the selected products to the cart.
Allow the user to remove products from the cart using a loop to ask for the product index to remove.
Ask the user if they would like to place the order.
If the user chooses to place the order, create an Order instance and print the order information.
#############################################################################################
= E-Commerce System Project

This project is an e-commerce system that allows users to order various products and manage their orders. The system provides a basic simulation of an online shopping experience and is implemented in Java. Below are details about the project structure and its main components.

== Project Structure

The project is organized into several classes that represent different aspects of the e-commerce system:

=== `Customer`
The `Customer` class represents a customer in the e-commerce system. It contains the customer's ID, name, and address.

- **Fields:**
  - `int customerId`: The unique ID of the customer.
  - `String name`: The name of the customer.
  - `String address`: The address of the customer.

=== `Product`
The `Product` class is an abstract base class representing a product in the system. Subclasses include specific product types such as electronic products, clothing products, and book products.

- **Fields:**
  - `int productId`: The unique ID of the product.
  - `String name`: The name of the product.
  - `float price`: The price of the product.

=== `ElectronicProduct`
The `ElectronicProduct` class extends `Product` and represents electronic products such as smartphones.

- **Fields:**
  - `String brand`: The brand of the electronic product.
  - `int warranty`: The warranty period of the product.

=== `ClothingProduct`
The `ClothingProduct` class extends `Product` and represents clothing products such as T-shirts.

- **Fields:**
  - `String size`: The size of the clothing product.
  - `String material`: The material of the clothing product.

=== `BookProduct`
The `BookProduct` class extends `Product` and represents book products such as novels.

- **Fields:**
  - `String author`: The author of the book.
  - `String publisher`: The publisher of the book.

=== `Cart`
The `Cart` class represents a shopping cart for the customer.

- **Fields:**
  - `int customerId`: The ID of the customer owning the cart.
  - `Product[] products`: The array of products in the cart.

- **Methods:**
  - `void addProduct(Product product)`: Adds a product to the cart.
  - `void removeProduct(int index)`: Removes a product from the cart by its index.

=== `Order`
The `Order` class represents an order placed by a customer.

- **Fields:**
  - `int customerId`: The ID of the customer placing the order.
  - `int orderId`: The ID of the order.
  - `Product[] products`: The array of products in the order.
  - `float totalPrice`: The total price of the order.

- **Methods:**
  - `void printOrderInfo()`: Prints the order information including the list of products and the total price.


