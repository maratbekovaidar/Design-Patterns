/**
 * Code written by Aidar Maratbekov 3.10.2021.  Copyright (c)
 */

package kz.maratbekovaidar;

public class LargeBurger extends BurgerDecorator {
    LargeBurger(Burger burger) {
        super(burger);
    }

    public int addCutletPrice() {
        return 60;
    }

    @Override
    public int getPrice() {
        return super.getPrice() + addCutletPrice();
    }
}
