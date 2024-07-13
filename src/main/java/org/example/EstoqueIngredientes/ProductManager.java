package org.example.EstoqueIngredientes;

import java.util.ArrayList;

public class ProductManager {

    private static ProductManager instance = null;
    ArrayList<Product> productList;

    public ProductManager() {
        productList = new ArrayList<>();
    }

    public static synchronized ProductManager getInstance() {
        if (instance == null) {
            instance = new ProductManager();
        }
        return instance;
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public void removeProduct(Product product) {
        productList.remove(product);
    }

    public void listProducts() {
        if (productList.isEmpty()) {
            System.out.println("No products available.");
        } else {
            for (Product product : productList) {
                System.out.println(product.getName());
            }
        }
    }
}
