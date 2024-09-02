package estoqueIngredientes;

import Entities.Product;

import java.nio.file.PathMatcher;
import java.util.ArrayList;
import java.util.HashMap;

public class ProductManager extends Subject {

    private static ProductManager instance = null;
    private final HashMap<String, Product> ProductHashMap;

    private ProductManager() {
        ProductHashMap = new HashMap<>();
    }

    public static synchronized ProductManager getInstance() {
        if(instance == null) {
            instance = new ProductManager();
        }
        return instance;
    }


    public void addProducts(Product product) {
        if(ProductHashMap.containsKey(product.getName())) {
            Product productAuxiliar = ProductHashMap.get(product.getName());
            float oldTotalPrice = productAuxiliar.getTotal();
            productAuxiliar.setQuantity(productAuxiliar.getQuantity() + product.getQuantity());
            productAuxiliar.setPrice(Math.round((oldTotalPrice + product.getTotal()) / productAuxiliar.getQuantity() * 100.0f) / 100.0f);
        } else {
            ProductHashMap.put(product.getName(), product);
        }
    }

    public void removeProducts(String name, int quantity) {
        if(ProductHashMap.containsKey(name)) {
            Product productAuxiliar = ProductHashMap.get(name);
            if(productAuxiliar.getQuantity() - quantity < 0){
                notifyObservers(1);
            }
            else{
                int newQuantity = productAuxiliar.getQuantity() - quantity;
                if(newQuantity < 10) notifyObservers(0);
                productAuxiliar.setQuantity(newQuantity);
            }
        }
    }

    public void listProducts() {
        for (HashMap.Entry<String, Product> entry : ProductHashMap.entrySet()) {
            Product product = entry.getValue();
            System.out.println(product.toString());
        }
    }

    public HashMap<String, Product> getHashRaw(){
        return ProductHashMap;
    }

}
