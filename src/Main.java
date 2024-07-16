import Authentication.LoggedUser;
import estoqueIngredientes.Observer;
import estoqueIngredientes.ProductFactory;
import estoqueIngredientes.ProductManager;
import estoqueIngredientes.StorageObserver;
import Authentication.User;
import java.util.UUID;
public class Main {
    public static void main(String[] args) {

        //User user = new User(UUID.randomUUID(), "admin", "admin", "admin@admin");
        //LoggedUser usuario = user.login();

        //Fachada Usuário
        LoggedUser usuario = (new User(UUID.randomUUID(), "admin", "admin", "admin@admin")).login();
        //Produtos que não são queijo

        usuario.addProduct("Milk", "Mococa", 10, 20.0f);
        usuario.addProduct("Packaging", "Cheese Packaging", 100, 500.0f);
        usuario.addProduct("Yeast", "Fermento", 500, 5.0f);

        //Observer obs = new StorageObserver();
        //manager.attach(obs);

        usuario.removeProduct(0);
        usuario.removeProduct(1);
        usuario.listProducts();


    }
}