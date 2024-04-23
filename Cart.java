/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.e_commerce_system;

public class Cart {

    private int customerId;
    private int nproducts;
    private product[] products;

    public Cart(int customerId, int nProducts) {
        this.customerId = Math.abs(customerId); // Take absolute value to ensure positive
        this.nproducts = Math.abs(nProducts);   // Take absolute value to ensure positive
        this.products = new product[nproducts]; // Initialize the array with the given size
    }

    public product[] getProducts() {
        return products;
    }

    public void setProducts(product[] products) {
        this.products = products;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = Math.abs(customerId);
    }

    public int getNproducts() {
        return nproducts;
    }

    public void setNproducts(int nproducts) {
        this.nproducts = Math.abs(nproducts);
    }

    public void addProduct(product[] products) {
        if (nproducts < products.length) { 
            for (int i = 0; i < products.length; i++) {
                products[nproducts] = products[i];
                nproducts++;
            }

        } else {
            System.out.println("Cart is full. Cannot add more products.");
        }
    }

    public void removeProductFromArray(product[] selectedProducts, int productIndex, int numberofProduct) {
        if (productIndex >= 0 && productIndex < numberofProduct) {
            // Shift the remaining products to the left
            for (int i = productIndex; i < numberofProduct - 1; i++) {
                selectedProducts[i] = selectedProducts[i + 1];
            }
            // Set the last element to null
            selectedProducts[numberofProduct - 1] = null;
        } else {
            System.out.println("Invalid product index.");
        }
    }

    public float calculatePrice() {
        float totalPrice = 0;
        for (int i = 0; i < nproducts; i++) {
            totalPrice += products[i].getPrice();
        }
        return totalPrice;
    }

    public boolean placeOrder(int flag) {
        boolean f = true;
        if (flag == 1) {
            f = true;
        } else if (flag == 2) {
            f = false;
        }
        return f;
        // Implementation to place the order goes here
        // You can use this method to finalize the order, send it to the server, etc.
    }
}
