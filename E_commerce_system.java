/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.e_commerce_system;

import java.util.Scanner;

public class E_commerce_system {

    public static void main(String[] args) {
 Scanner in = new Scanner(System.in);
        Electronicproduct electronic = new Electronicproduct(1, "smartphone", 599.99f, "Samsung", 1);
        ClothingProduct clothingProduct = new ClothingProduct(2, "T-shirt", 19.99f, "Medium", "Cotton");
        BookProduct bookProduct = new BookProduct(3, "OOP", 39.99f, "O’Reilly", "X Publications");

        System.out.println("Welcome to the E-Commerce System! ");
        System.out.print("Enter your customer ID:");
        int customerId = in.nextInt();
        in.nextLine();
        System.out.print("Enter your name: ");
        String name = in.nextLine();
        System.out.print("Enter your address:");
        String address = in.nextLine();
        Customer customer = new Customer(customerId, name, address);

        System.out.print("How many products do you want to order?==> ");
        int numberofProduct = in.nextInt();
        in.nextLine();

        product[] selectedProducts = new product[numberofProduct];

        for (int i = 0; i < numberofProduct; i++) {
            System.out.println("Which product would you like to add? 1==>smartphone  2==>T-shirt  3==>OOP ");
            int which = in.nextInt();
            in.nextLine();

            // Create the product based on user input
            switch (which) {
                case 1:
                    selectedProducts[i] = electronic;
                    break;
                case 2:
                    selectedProducts[i] = clothingProduct;
                    break;
                case 3:
                    selectedProducts[i] = bookProduct;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    i--; // Decrement i to re-prompt the user for the current index
                    break;
            }
        }

        Cart cart = new Cart(customerId, numberofProduct);

        System.out.println("would you like to place the order? 1==>yes   2==>No");
        int respond = in.nextInt();
        if (cart.placeOrder(respond) == true) {
            Order order = new Order(customerId, 1, selectedProducts);
            order.printOrderInfo();
        } else {
            System.out.println("Order not placed.");
        }

    }
}
