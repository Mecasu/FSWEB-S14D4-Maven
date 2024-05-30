package org.example.model;

public class Store {
    public static void main(String[] args) {
        ProductForSale[] products = {
                new Bread("Dark", 10, "Delicious"),
                new Chocolate("Milky", 20, "MakesYouHappy"),
                new Cake("Fluffy", 50, "MadeWithLove")
        };

        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        for (int i = 0; i < products.length; i++) {
            products[i].showDetails();
        }
    }
}