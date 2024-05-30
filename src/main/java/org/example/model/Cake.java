package org.example.model;

public class Cake extends ProductForSale {

    private double sugarPercent;

    public Cake(String type, int price, String description) {
        super(type, price, description);
    }


    @Override
    public void showDetails() {
        System.out.println("The cake has " + sugarPercent +" sugar");
    }
}
