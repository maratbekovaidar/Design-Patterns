package kz.maratbekovaidar.beerbar;

import kz.maratbekovaidar.Waiter;

public class BeerPourer implements Waiter {
    @Override
    public void takeOrder() {
        System.out.println("Pouring and carrying beers... ");
    }
}
