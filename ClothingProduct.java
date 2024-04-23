/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.e_commerce_system;
public class ClothingProduct extends product {
    
    private String size;
    private String fabric;

    public ClothingProduct(int productId, String name, float price,String size,String fabric) {
        super(productId, name, price);
        this.size=size;
        this.fabric=fabric;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getFabric() {
        return fabric;
    }

    public void setFabric(String fabric) {
        this.fabric = fabric;
    }
    
    
}
