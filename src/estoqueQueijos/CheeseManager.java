package estoqueQueijos;

import Entities.Cheese;
import Entities.Product;
import estoqueIngredientes.Subject;

import java.util.ArrayList;

public class CheeseManager extends Subject {

    private static CheeseManager instance = null;
    private ArrayList<Product> CheeseList;

    private CheeseManager() {
        CheeseList = new ArrayList<Product>();
    }

    public static synchronized CheeseManager getInstance() {
        if(instance == null) {
            instance = new CheeseManager();
        }
        return instance;
    }

    public void addCheese(Product cheese) {
        CheeseList.add(cheese);

    }

    public void removeCheese(int index) {
        CheeseList.remove(index);
        if (CheeseList.size() < 2) notifyObservers(0);
    }

    public void listCheeses() {
        for (Product product: CheeseList) {
            System.out.println(product.toString());
        }
    }



}
