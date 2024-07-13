package org.example.EstoqueIngredientes;

public class Milk implements Product{
    private int quantity;
    private float price;
    private String name;

    public Milk(int quantity, float price, String name) {
        this.quantity = quantity;
        this.price = price;
        this.name = name;
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
        return this.price * this.quantity;
    }

    @Override
    public String toString() {
        return "Milk{" +
                "quantity=" + quantity +
                ", price=" + price +
                ", name='" + name + '\'' +
                '}';
    }
}
