package estoqueIngredientes;

public class ProductFactory {

    public Product createMilk(int quantity, float price, String name) {
        return new Milk(quantity, price, name);
    }

    public Product createPackaging(int quantity, float price, String name) {
        return new Packaging(quantity, price, name);
    }

    public Product createYeast(int quantity, float price, String name) {
        return new Yeast(quantity, price, name);
    }
}


