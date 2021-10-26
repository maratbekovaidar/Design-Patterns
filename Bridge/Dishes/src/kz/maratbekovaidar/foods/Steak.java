/**
 * @author Aidar Maratbekov SE-2004
 * GitHub: github.com/maratbekovaidar
 */

package kz.maratbekovaidar.foods;

import kz.maratbekovaidar.Meat;
import kz.maratbekovaidar.Dish;

public class Steak extends Dish {
    public Steak(Meat meat) {
        super(meat);
    }

    @Override
    public void getProduct() {
        System.out.print("Steak ");
        meat.getMeat();
    }
}
