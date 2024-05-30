package org.example.model;

public class Bread extends ProductForSale {

    private int weight;

    public Bread(String type, int price, String description) {
        super(type, price, description);
    }


    @Override
    public void showDetails() {
        System.out.println("The weight of bread is " + weight);
    }
}
