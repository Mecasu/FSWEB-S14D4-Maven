package org.example.model;

public abstract class ProductForSale {


    private String type;
    private int price;
    private String description;

    public int getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

    public ProductForSale(String type, int price, String description) {
        this.price = price;
        this.type = type;
        this.description = description;
    }

    public int getSalesPrice(int quantity){
        return price * quantity;
    }
    public abstract void showDetails();

}
