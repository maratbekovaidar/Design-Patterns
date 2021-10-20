package kz.maratbekovaidar;

public interface FoodEstablishmentTeamFactory {
    Cashier getCashier();
    Cook getCook();
    Manager getManager();
    Waiter getWaiter();
    Cleaner getCleaner();

}
