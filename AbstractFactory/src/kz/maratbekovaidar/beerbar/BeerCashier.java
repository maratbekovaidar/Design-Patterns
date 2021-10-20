package kz.maratbekovaidar.beerbar;

import kz.maratbekovaidar.Cashier;

public class BeerCashier implements Cashier {
    @Override
    public void toCountMoney() {
        System.out.println("Cashier beer per liter... ");
    }
}
