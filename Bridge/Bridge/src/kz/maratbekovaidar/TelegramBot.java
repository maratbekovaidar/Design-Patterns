package kz.maratbekovaidar;

public class TelegramBot extends Program {
    protected TelegramBot(Developer developer) {
        super(developer);
    }

    @Override
    public void develop() {
        System.out.println("Developing telegram bot... ");
        developer.writeCode();
    }
}
