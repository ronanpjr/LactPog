package estoqueCompras;

public class ProductFactory {

    Product createMilk(int quantity, float price, String name) {
        return new Milk(quantity, price, name);
    }

    Product createPackaging(int quantity, float price, String name) {
        return new Packaging(quantity, price, name);
    }

    Product createYeast(int quantity, float price, String name) {
        return new Yeast(quantity, price, name);
    }
}


