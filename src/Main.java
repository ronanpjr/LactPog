import Authentication.Facade;
import Authentication.User;

import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Bem Vindo a:\n\n");
        System.out.println(".____                   __    __________              ");
        System.out.println("|    |   _____    _____/  |_  \\______   \\____   ____  ");
        System.out.println("|    |   \\__  \\ _/ ___\\   __\\  |     ___/  _ \\ / ___\\ ");
        System.out.println("|    |___ / __ \\\\  \\___|  |    |    |  (  <_> ) /_/  >");
        System.out.println("|_______ (____  /\\___  >__|    |____|   \\____/\\___  / ");
        System.out.println("        \\/    \\/     \\/                      /_____/  ");
        System.out.print("\n\n");

        Scanner scanner = new Scanner(System.in);
        int ambiente = 0;
        int input = 0;
        User usuario = null;
        String username = null;
        String password = null;
        String email = null;
        Facade fachada = null;
        while(ambiente != -1){
            if(ambiente == 0){
                System.out.println("[0] Realizar Login\n");
                System.out.println("[1] Sair");
                input = scanner.nextInt();

                if(input == 0){
                    System.out.println("Digite seu nome:");
                    username = scanner.nextLine();
                    System.out.println("Digite sua senha:");
                    password = scanner.nextLine();
                    System.out.println("Digite seu email:");
                    email = scanner.nextLine();
                    ambiente = 1;
                }
                else if(input == 1){
                    ambiente = -1;
                }
            }
            if (ambiente == 1){
                usuario = new User(UUID.randomUUID(), username, password, email);
                try {
                    fachada = usuario.login();
                    ambiente = 2;
                } catch (Exception e) {
                    //throw new RuntimeException(e);
                    System.err.println(e.getMessage());
                    ambiente = 0;
                }
            }

        }
        /*
        //tentativa falha de login
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
        //fachada.listarIngredientes();
        fachada.removerIngrediente(0);
        fachada.removerIngrediente(1);


        fachada.adicionarQueijos(10, 44.0f, "Minas", new Date(2024, 07, 16));
        //fachada.listarQueijos();
        */
    }
}
