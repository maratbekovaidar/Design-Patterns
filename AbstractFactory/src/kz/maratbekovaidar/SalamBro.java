package kz.maratbekovaidar;

import kz.maratbekovaidar.beerbar.BeerCashier;
import kz.maratbekovaidar.burgerhouse.*;
import kz.maratbekovaidar.restaurant.MainWaiter;

public class SalamBro {
    public static void main(String[] args) {
        FoodEstablishmentTeamFactory foodEstablishmentTeamFactory = new BurgerHouseTeamFactory();
        Cashier cashier = new BeerCashier();
        Cleaner cleaner = new TableCleaner();
        Cook cook = new MeetCook();
        Manager manager = new FoodManager();
        Waiter waiter = new BurgerMaker();

        System.out.println("Opening SalamBro burger house... ");
        cashier.toCountMoney();
        cleaner.toClean();
        cook.toCook();
        manager.manage();
        waiter.takeOrder();
    }
}
