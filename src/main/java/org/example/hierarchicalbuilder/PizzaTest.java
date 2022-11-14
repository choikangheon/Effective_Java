package org.example.hierarchicalbuilder;

import static org.example.hierarchicalbuilder.NyPizza.Size.SMALL;
import static org.example.hierarchicalbuilder.Pizza.Topping.ONION;
import static org.example.hierarchicalbuilder.Pizza.Topping.SAUSAGE;

public class PizzaTest {
    public static void main(String[] args) {
        NyPizza pizza = new NyPizza.Builder(SMALL)
                .addTopping(SAUSAGE)
                .addTopping(ONION).build();
    }
}
