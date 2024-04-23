/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.e_commerce_system;

public class product {

    protected int productId;
    protected String name;
    protected float price;

    public product(int productId, String name, float price) {
        this.productId = Math.abs(productId);
        this.name = name;
        this.price = Math.abs(price);
    }

    public void setproductId(int proID) {

        /*to check it's positive*/
        this.productId = Math.abs(proID);

    }

    public int getproductId() {
        return productId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    /*to check it's positive*/
    public void setPrice(float price) {

        this.price = Math.abs(price);

    }

}
