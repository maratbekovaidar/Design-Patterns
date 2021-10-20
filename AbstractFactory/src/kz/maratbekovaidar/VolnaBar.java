package kz.maratbekovaidar;

import kz.maratbekovaidar.beerbar.BeerBarTeamFactory;

public class VolnaBar {
    public static void main(String[] args) {

        FoodEstablishmentTeamFactory foodEstablishmentTeamFactory = new BeerBarTeamFactory();
        Cashier cashier = foodEstablishmentTeamFactory.getCashier();
        Cleaner cleaner = foodEstablishmentTeamFactory.getCleaner();
        Cook cook = foodEstablishmentTeamFactory.getCook();
        Manager manager = foodEstablishmentTeamFactory.getManager();
        Waiter waiter = foodEstablishmentTeamFactory.getWaiter();


        System.out.println("Opening Volna Beer Bar... ");
        cashier.toCountMoney();
        cleaner.toClean();
        cook.toCook();
        manager.manage();
        waiter.takeOrder();
    }
}
