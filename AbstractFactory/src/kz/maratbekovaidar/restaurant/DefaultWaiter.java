package kz.maratbekovaidar.restaurant;

import kz.maratbekovaidar.Waiter;

public class DefaultWaiter implements Waiter {
    @Override
    public void takeOrder() {
        System.out.println("Carrying foods... ");
    }
}
