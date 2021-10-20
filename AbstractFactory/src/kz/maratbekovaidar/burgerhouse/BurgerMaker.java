package kz.maratbekovaidar.burgerhouse;

import kz.maratbekovaidar.Waiter;

public class BurgerMaker implements Waiter {
    @Override
    public void takeOrder() {
        System.out.println("Making burger... ");
    }
}
