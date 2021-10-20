package kz.maratbekovaidar.restaurant;

import kz.maratbekovaidar.*;
import kz.maratbekovaidar.burgerhouse.TableCleaner;

public class RestaurantTeamFactory implements FoodEstablishmentTeamFactory {

    @Override
    public Cashier getCashier() {
        return new MainWaiter();
    }

    @Override
    public Cook getCook() {
        return new Chief();
    }

    @Override
    public Manager getManager() {
        return new DesignManager();
    }

    @Override
    public Waiter getWaiter() {
        return new DefaultWaiter();
    }

    @Override
    public Cleaner getCleaner() {
        return new DishesCleaner();
    }
}
