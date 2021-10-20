package kz.maratbekovaidar.burgerhouse;

import kz.maratbekovaidar.Cook;

public class MeetCook implements Cook {
    @Override
    public void toCook() {
        System.out.println("Cooking cutlet... ");
    }
}
