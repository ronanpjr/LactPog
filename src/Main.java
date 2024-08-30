import Authentication.Facade;
import Authentication.User;

import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        User usuariofalho = new User (UUID.randomUUID(), "notadmin",
                "notadmin", "ulisflavio@gmail.com");

        Facade teste = usuariofalho.login();

        User usuario = new User(UUID.randomUUID(),
                "admin", "admin", "felipekenji@ifood.com");

        //  Fachada é retornada pelo método login
        Facade fachada = usuario.login();

        fachada.adicionarIngrediente("Milk", "Mococa", 10, 20.0f);
        fachada.adicionarIngrediente("Packaging", "Cheese Packaging", 100, 500.0f);
        fachada.adicionarIngrediente("Yeast", "Fermento", 500, 5.0f);
        fachada.listarIngredientes();
        fachada.removerIngrediente(0);
        fachada.removerIngrediente(1);


        fachada.adicionarQueijos(10, 44.0f, "Minas", new Date(2024, 07, 16));
        fachada.listarQueijos();

    }
}
