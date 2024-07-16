import estoqueIngredientes.Observer;
import estoqueIngredientes.ProductFactory;
import estoqueIngredientes.ProductManager;
import estoqueIngredientes.StorageObserver;

public class Main {
    public static void main(String[] args) {
        ProductManager manager = ProductManager.getInstance();
        ProductFactory factory = new ProductFactory();
        manager.addProducts(factory.createMilk(10, 20.0f, "blablabla"));
        manager.addProducts(factory.createPackaging(100, 500.0f, "cheese packaging"));
        manager.addProducts(factory.createYeast(984938, 99999.999f, "fermento"));

        Observer obs = new StorageObserver();
        manager.attach(obs);

        manager.removeProducts(0);
        manager.removeProducts(1);
        manager.listProducts();

    }
}