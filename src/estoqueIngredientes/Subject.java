package estoqueIngredientes;

import java.util.ArrayList;

public class Subject {

    ArrayList<Observer> observers = new ArrayList<Observer>();

    public void attach(Observer o) {
        observers.add(o);
    }

    public void detach(Observer o){
        observers.remove(o);
    }

    public void notifyObservers() {
        for(Observer o : observers) {

            o.update();

        }
    }


}
