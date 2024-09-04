package estoqueIngredientes;

import Entities.Milk;
import Entities.Packaging;
import Entities.Product;
import Entities.Yeast;

public class ProductFactory {

    public Product getProduct(int quantity, float price, String name, String tipo) {
        if(tipo.equals("Milk"))
            return new Milk(quantity, price, name);
        if(tipo.equals("Packaging"))
            return new Packaging(quantity, price, name);
        if(tipo.equals("Yeast"))
            return new Yeast(quantity, price, name);

        throw new IllegalArgumentException("Tipo de produto desconhecido: " + tipo);

    }
}


