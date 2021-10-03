/**
 * Code written by Aidar Maratbekov 3.10.2021.  Copyright (c)
 */

package kz.maratbekovaidar;

public class CheeseBurger extends BurgerDecorator {
    CheeseBurger(Burger burger) {
        super(burger);
    }

    public int addCheesePrice() {
        return 30;
    }

    @Override
    public int getPrice() {
        return super.getPrice() + addCheesePrice();
    }
}
