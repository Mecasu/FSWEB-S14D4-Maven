package org.example.model;

public class Coke extends ProductForSale {

    private final double sugarPercent = 0.03;

    public Coke(String type, int price, String description) {
        super(type, price, description);
    }


    @Override
    public void showDetails() {
        System.out.println("The coke has " + sugarPercent +" sugar");
    }
}
