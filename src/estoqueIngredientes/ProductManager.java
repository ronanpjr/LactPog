package estoqueIngredientes;

import java.util.ArrayList;

public class ProductManager {

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

    public void removeProducts(Product product) {
        ProductList.remove(product);
    }

    public void listProducts() {
        for (Product product: ProductList) {
            System.out.println(product.toString());
        }
    }


}
