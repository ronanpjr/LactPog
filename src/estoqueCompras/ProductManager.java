package estoqueCompras;

import java.util.ArrayList;

public class ProductManager {

    private static ProductManager instance = null;
    ArrayList<Product> ProductList;

    private ProductManager() {
        
    }

    public static synchronized ProductManager getInstance() {
        if(instance == null) {
            instance = new ProductManager();
        }
        return instance;
    }

    public static void AddProducts(Product product) {


    }

    public static void RemoveProducts(Product product) {

    }

    public static void ListProducts() {

    }


}
