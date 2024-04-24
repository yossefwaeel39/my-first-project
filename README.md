# my-first-project
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
