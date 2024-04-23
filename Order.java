/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.e_commerce_system;

public class Order {

    private int customerId;
    private int orderId;
    private product[] products;
    private float totalPrice;

    public Order(int customerId, int orderId, product[] products) {
        this.customerId = Math.abs(customerId);
        this.orderId = Math.abs(orderId);
        this.products = products;
        this.totalPrice = calculateTotalPrice();
    }

    private float calculateTotalPrice() {
        float totalPrice = 0;
        for (product product : products) {
            {
                totalPrice += product.getPrice();
            }
        }
        return totalPrice;
    }

    public void printOrderInfo() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer ID: " + customerId);
        System.out.println("Products:");
        float total = 0;

        for (product product : products) {
            {
                System.out.println(" * " + product.getName() + ": $" + product.getPrice());
                total += product.getPrice();

            }
        }
        System.out.println("Total Price: $" + total);
    }

}
