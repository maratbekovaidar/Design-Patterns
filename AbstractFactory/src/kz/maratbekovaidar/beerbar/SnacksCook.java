package kz.maratbekovaidar.beerbar;

import kz.maratbekovaidar.Cook;

public class SnacksCook implements Cook {
    @Override
    public void toCook() {
        System.out.println("Cooking snacks... ");
    }
}
