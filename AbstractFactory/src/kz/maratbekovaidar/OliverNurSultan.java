package kz.maratbekovaidar;

import kz.maratbekovaidar.restaurant.RestaurantTeamFactory;

public class OliverNurSultan {
    public static void main(String[] args) {
        FoodEstablishmentTeamFactory foodEstablishmentTeamFactory = new RestaurantTeamFactory();
        Cashier cashier = foodEstablishmentTeamFactory.getCashier();
        Cleaner cleaner = foodEstablishmentTeamFactory.getCleaner();
        Cook cook = foodEstablishmentTeamFactory.getCook();
        Manager manager = foodEstablishmentTeamFactory.getManager();
        Waiter waiter = foodEstablishmentTeamFactory.getWaiter();

        System.out.println("Opening Oliver Nur-Sultan restaurant... ");
        cashier.toCountMoney();
        cleaner.toClean();
        cook.toCook();
        manager.manage();
        waiter.takeOrder();
    }
}
