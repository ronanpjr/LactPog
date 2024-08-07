package Authentication;

import Entities.Product;
import estoqueIngredientes.ProductFactory;
import estoqueIngredientes.ProductManager;
import estoqueIngredientes.StorageObserver;
import estoqueIngredientes.Observer;
import estoqueQueijos.*;

import java.util.Date;

public class Facade {


    /* Funcionamento da Facade:
    * A partir da ideia do padrao facade, implementamos uma interface
    * para acessar os Controllers dos Estoques de maneira centralizada
    * A fachada fica disponivel como retorno do login em caso de sucesso
    * */

    ProductManager ingredientManager = ProductManager.getInstance();
    CheeseManager cheeseManager = CheeseManager.getInstance();
    ProductFactory ingredientsFactory = new ProductFactory();
    CheeseFactory  cheeseFactory = new CheeseFactory();
    Observer ingredientsO = new StorageObserver();
    Observer cheeses0 = new cheeseStorageObserver();

    public Facade() {
        ingredientManager.attach(ingredientsO);
        cheeseManager.attach(cheeses0);
    }

    public void adicionarIngrediente(String tipo, String nome, int quantity, float price){
        switch (tipo){
            case "Milk":
                ingredientManager.addProducts(ingredientsFactory.createMilk(quantity, price, nome));
                break;
            case "Packaging":
                ingredientManager.addProducts(ingredientsFactory.createPackaging(quantity, price, nome));
                break;
            case "Yeast":
                ingredientManager.addProducts(ingredientsFactory.createYeast(quantity, price, nome));
        }
    }
    public void removerIngrediente(int index){
        ingredientManager.removeProducts(index);
    }

    public void listarIngredientes(){
        ingredientManager.listProducts();
        float total = 0;
        for(Product product: ingredientManager.getListRaw()){
            total += product.getTotal();
        }
        System.out.println(total);
    }

    public void adicionarQueijos(int quantity, float price, String name, Date validade) {
        cheeseManager.addCheese(cheeseFactory.createCheese(quantity, price, name, validade));
    }

    public void removerQueijos(int index) {
        cheeseManager.removeCheese(index);
    }

    public void listarQueijos() {
        cheeseManager.listCheeses();
    }
}
