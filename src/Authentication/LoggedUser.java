package Authentication;

import Entities.Packaging;
import Entities.Product;
import estoqueIngredientes.ProductFactory;
import estoqueIngredientes.ProductManager;
import estoqueIngredientes.StorageObserver;
import estoqueIngredientes.Observer;
import java.util.UUID;

public class LoggedUser extends User{

    //fachada lida com criação de manager e factory
    ProductManager manager = ProductManager.getInstance();
    ProductFactory factory = new ProductFactory();

    //fnao sei o que está errado
    //Observer obs = new StorageObserver();
    //manager.attach(obs);

    public LoggedUser(UUID id, String username, String password, String email) {
        super(id, username, password, email);
    }

    public void adicionarProduto(String tipo, String nome, int quantity, float price){
        switch (tipo){
            case "Milk":
                manager.addProducts(factory.createMilk(quantity, price, nome));
                break;
            case "Packaging":
                manager.addProducts(factory.createPackaging(quantity, price, nome));
                break;
            case "Yeast":
                manager.addProducts(factory.createYeast(quantity, price, nome));
        }
    }
    public void removerProduto(int index){
        manager.removeProducts(index);
    }

    public void listarProdutos(){
        manager.listProducts();
        float total = 0;
        for(Product product: manager.getListRaw()){
            total += product.getTotal();
        }
        System.out.println(total);
    }


}
