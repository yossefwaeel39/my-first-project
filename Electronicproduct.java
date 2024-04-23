/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.e_commerce_system;

public class Electronicproduct extends product {

    private String brand;
    private int warrantyPeriod;

    
  public Electronicproduct(int productId, String name, float price, String brand, int warrantyPeriod) {

         super(productId, name, price);
        this.brand = brand;
        this.warrantyPeriod = warrantyPeriod;
    }

    
    
    public void setbrand(String brand) {
        this.brand = brand;
    }

    public String getbrand() {
        return brand;
    }

    public void setwarrantyPeriod(int warrantyPeriod) {
   
         
            this.warrantyPeriod =  Math.abs(warrantyPeriod);
      
    }

    public int getwarrantyPeriod() {
        return warrantyPeriod;
    }
}
