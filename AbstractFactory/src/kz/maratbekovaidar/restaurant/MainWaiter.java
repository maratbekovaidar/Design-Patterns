package kz.maratbekovaidar.restaurant;

import kz.maratbekovaidar.Cashier;

public class MainWaiter implements Cashier {
    @Override
    public void toCountMoney() {
        System.out.println("Carrying a checks... ");
    }
}
