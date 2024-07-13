package org.example.EstoqueIngredientes;

public class ProductFactory {

    public static Product createMilk(int quantity, float price, String name) {
        return new Milk(quantity, price, name);
    }

    public static Product createPackaging(int quantity, float price, String name) {
        return new Packaging(quantity, price, name);
    }

    public static Product createYeast(int quantity, float price, String name) {
        return new Yeast(quantity, price, name);
    }
}
