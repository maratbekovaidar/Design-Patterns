/**
 * Code written by Aidar Maratbekov 3.10.2021.  Copyright (c)
 */

package kz.maratbekovaidar;

public class SpicyBurger extends BurgerDecorator {
    SpicyBurger(Burger burger) {
        super(burger);
    }

    public int addSpicySousePrice() {
        return 20;
    }

    @Override
    public int getPrice() {
        return super.getPrice() + addSpicySousePrice();
    }
}
