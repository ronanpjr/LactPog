package estoqueIngredientes;

public class InsuficientStorageObserver implements Observer {

    public void update() {

        System.out.println("Estoque insuficiente para o pedido");

    }

}
