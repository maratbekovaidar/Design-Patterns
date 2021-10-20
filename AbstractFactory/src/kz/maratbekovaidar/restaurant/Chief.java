package kz.maratbekovaidar.restaurant;

import kz.maratbekovaidar.Cook;

public class Chief implements Cook {
    @Override
    public void toCook() {
        System.out.println("Making dishes... ");
    }
}
