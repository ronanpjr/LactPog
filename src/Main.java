import estoqueIngredientes.ProductFactory;
import estoqueIngredientes.ProductManager;

public class Main {
    public static void main(String[] args) {
        ProductManager manager = ProductManager.getInstance();
        ProductFactory factory = new ProductFactory();
        manager.addProducts(factory.createMilk(10, 20.0f, "blablabla"));
        manager.addProducts(factory.createPackaging(100, 500.0f, "cheese packaging"));
        manager.addProducts(factory.createYeast(984938, 99999.999f, "fermento"));

        manager.listProducts();
    }
}