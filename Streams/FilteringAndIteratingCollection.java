package com.company.Streams;

import java.util.*;
class ProductDetails{
    int id;
    String name;
    float price;
    public ProductDetails(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
public class FilteringAndIteratingCollection {
    public static void main(String[] args) {
        List<ProductDetails> productsList = new ArrayList<>();
        //Adding Products
        productsList.add(new ProductDetails(1,"HP Laptop",25000f));
        productsList.add(new ProductDetails(2,"Dell Laptop",30000f));
        productsList.add(new ProductDetails(3,"Lenevo Laptop",28000f));
        productsList.add(new ProductDetails(4,"Sony Laptop",28000f));
        productsList.add(new ProductDetails(5,"Apple Laptop",90000f));


        // This is more compact approach for filtering data
        productsList.stream()
                .filter(product -> product.price == 30000)
                .forEach(product -> System.out.println(product.name));
    }
}

