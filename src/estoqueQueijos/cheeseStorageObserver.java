package estoqueQueijos;

import estoqueIngredientes.Observer;

public class cheeseStorageObserver implements Observer {


    public void update() {
        System.out.println("Estoque de queijos baixo");
    }

}
