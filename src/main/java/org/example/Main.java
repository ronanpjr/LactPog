package org.example;

import org.example.EstoqueIngredientes.ProductFactory;
import org.example.EstoqueIngredientes.ProductManager;

public class Main {
    public static void main(String[] args) {

        ProductManager manager = ProductManager.getInstance();

        manager.addProduct(ProductFactory.createMilk(10, 2, "LEITE"));
        manager.addProduct(ProductFactory.createPackaging(5, 3, "PACOTE"));
        manager.addProduct(ProductFactory.createYeast(5, 4, "FERMENTO"));

        manager.addProduct(ProductFactory.createMilk(10, 2, "LEITE2"));
        manager.addProduct(ProductFactory.createPackaging(5, 3, "PACOTE2"));
        manager.addProduct(ProductFactory.createYeast(5, 4, "FERMENTO2"));

        manager.listProducts();
    }
}