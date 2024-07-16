package Entities;

import java.util.Date;

public class Cheese implements Product {

    private int quantity;
    private float price;
    private String name;
    private Date validade;

    public Cheese(int quantity, float price, String name, Date validade) {
        this.quantity = quantity;
        this.price = price;
        this.name = name;
        this.validade = validade;
    }

    @Override
    public void setQuantity(int quantity) {

    }

    @Override
    public void setPrice(float price) {

    }

    @Override
    public void setName(String name) {

    }

    @Override
    public int getQuantity() {
        return 0;
    }

    @Override
    public float getPrice() {
        return 0;
    }

    @Override
    public String getName() {
        return "";
    }

    @Override
    public float getTotal() {
        return 0;
    }

}
