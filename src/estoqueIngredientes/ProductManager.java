package estoqueIngredientes;

import Entities.Product;

import java.util.ArrayList;

public class ProductManager extends Subject {

    private static ProductManager instance = null;
    private ArrayList<Product> ProductList;

    private ProductManager() {
        ProductList = new ArrayList<Product>();
    }

    public static synchronized ProductManager getInstance() {
        if(instance == null) {
            instance = new ProductManager();
        }
        return instance;
    }


    public void addProducts(Product product) {
        ProductList.add(product);
    }

    public void removeProducts(int index) {
        ProductList.remove(index);
        if (ProductList.size() < 2) notifyObservers();
    }

    public void listProducts() {
        for (Product product: ProductList) {
            System.out.println(product.toString());
        }
    }



}