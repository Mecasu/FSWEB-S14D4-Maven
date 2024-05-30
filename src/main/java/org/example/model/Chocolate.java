package org.example.model;

public class Chocolate extends ProductForSale {

    private boolean dark;

    public Chocolate(String type, int price, String description) {
        super(type, price, description);
    }


    @Override
    public void showDetails() {
        if(dark){
        System.out.println("The chocolate is bitter");
        }else {
            System.out.println("The chocolate is not bitter");
        }

    }
}
