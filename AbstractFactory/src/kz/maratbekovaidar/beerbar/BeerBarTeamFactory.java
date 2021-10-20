package kz.maratbekovaidar.beerbar;

import kz.maratbekovaidar.*;

public class BeerBarTeamFactory implements FoodEstablishmentTeamFactory {
    @Override
    public Cashier getCashier() {
        return new BeerCashier();
    }

    @Override
    public Cook getCook() {
        return new SnacksCook();
    }

    @Override
    public Manager getManager() {
        return new KegManager();
    }

    @Override
    public Waiter getWaiter() {
        return new BeerPourer();
    }

    @Override
    public Cleaner getCleaner() {
        return new GlassCleaner();
    }
}
