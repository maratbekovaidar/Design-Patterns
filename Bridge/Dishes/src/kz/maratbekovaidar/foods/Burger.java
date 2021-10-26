/**
 * @author Aidar Maratbekov SE-2004
 * GitHub: github.com/maratbekovaidar
 */

package kz.maratbekovaidar.foods;

import kz.maratbekovaidar.Meat;
import kz.maratbekovaidar.Dish;

public class Burger extends Dish {
    public Burger(Meat meat) {
        super(meat);
    }

    @Override
    public void getProduct() {
        System.out.print("Burger ");
        meat.getMeat();
    }
}
