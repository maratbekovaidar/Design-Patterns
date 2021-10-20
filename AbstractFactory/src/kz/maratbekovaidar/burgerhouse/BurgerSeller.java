package kz.maratbekovaidar.burgerhouse;

import kz.maratbekovaidar.Cashier;

public class BurgerSeller implements Cashier {

    @Override
    public void toCountMoney() {
        System.out.println("Selling burgers... ");
    }
}
