package kz.maratbekovaidar;

public class BankingSystem extends Program {

    protected BankingSystem(Developer developer) {
        super(developer);
    }

    @Override
    public void develop() {
        System.out.println("Developing banking system... ");
        developer.writeCode();
    }
}
