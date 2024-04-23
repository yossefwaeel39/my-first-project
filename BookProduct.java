/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.e_commerce_system;

public class BookProduct extends product {

    private String author;
    private String publisher;
    
    public BookProduct(int productId, String name, float price,String author,String publisher){
        super(productId, name, price);
        this.author=author;
        this.publisher=publisher;
        
    }

    public void setauthor(String author) {
        this.author = author;
    }

    public String getauthor() {
        return author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPublisher() {
        return publisher;
    }
}
