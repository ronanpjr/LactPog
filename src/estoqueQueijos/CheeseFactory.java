package estoqueQueijos;

import Entities.*;

import java.util.Date;

public class CheeseFactory {

    public Product createCheese(int quantity, float price, String name, Date validade) {
        return new Cheese(quantity, price, name, validade);
    }

}


