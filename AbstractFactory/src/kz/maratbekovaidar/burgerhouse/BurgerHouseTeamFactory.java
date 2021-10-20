package kz.maratbekovaidar.burgerhouse;

import kz.maratbekovaidar.*;

public class BurgerHouseTeamFactory implements FoodEstablishmentTeamFactory {
    @Override
    public Cashier getCashier() {
        return new BurgerSeller();
    }

    @Override
    public Cook getCook() {
        return new MeetCook();
    }

    @Override
    public Manager getManager() {
        return new FoodManager();
    }

    @Override
    public Waiter getWaiter() {
        return new BurgerMaker();
    }

    @Override
    public Cleaner getCleaner() {
        return new TableCleaner();
    }
}
