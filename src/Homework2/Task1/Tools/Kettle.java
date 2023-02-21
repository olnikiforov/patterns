package Homework2.Task1.Tools;

import Homework2.Task1.Drinks.Drink;
import Homework2.Task1.Drinks.FilterCoffe;
import Homework2.Task1.Drinks.Tea;

import javax.lang.model.type.UnknownTypeException;

public class Kettle implements  Tool{
    @Override
    public Drink makeDrink(DrinksType drinkType, double sugar) {
        Drink drink;
        if(drinkType==KettleDrinks.TEA) {
            drink = new Tea(sugar);
            System.out.println("Tea is ready,"+ drink.getSellingPrice() +" hryvnias from you");
            return drink;
        } else if (drinkType==KettleDrinks.FILTERCOFFE) {
            drink = new FilterCoffe(sugar);
            System.out.println("Filter coffee is ready,"+ drink.getSellingPrice() +" hryvnias from you");
            return drink;
        }else {
            throw new IllegalStateException("Unknown drink");
        }
    }
}
