package kz.maratbekovaidar.burgerhouse;

import kz.maratbekovaidar.Manager;

public class FoodManager implements Manager {

    @Override
    public void manage() {
        System.out.println("Manage food transportation... ");
    }
}
