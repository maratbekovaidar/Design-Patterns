/**
 * Code written by Aidar Maratbekov 3.10.2021.  Copyright (c)
 */

package kz.maratbekovaidar;

public class BurgerDecorator implements Burger {

    Burger burger;

    BurgerDecorator(Burger burger) {
        this.burger = burger;
    }

    @Override
    public int getPrice() {
        return burger.getPrice();
    }
}
