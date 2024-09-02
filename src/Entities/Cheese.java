package Entities;

import java.util.Date;

public class Cheese implements Product {

    private int quantity;
    private float price;
    private String name;
    private final Date validade;

    public Cheese(int quantity, float price, String name, Date validade) {
        this.quantity = quantity;
        this.price = price;
        this.name = name;
        this.validade = validade;
    }

    @Override
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getQuantity() {
        return this.quantity;
    }

    @Override
    public float getPrice() {
        return this.price;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public float getTotal() {
        return Math.round(this.price * this.quantity * 100.0f) / 100.0f ;
    }

    @Override
    public String toString() {
        return "Cheese{" +
                "quantity=" + quantity +
                ", price=" + price +
                ", name='" + name + '\'' +
                '}';
    }
}
