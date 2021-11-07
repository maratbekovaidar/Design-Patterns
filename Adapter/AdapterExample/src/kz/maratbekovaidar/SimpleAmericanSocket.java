package kz.maratbekovaidar;

public class SimpleAmericanSocket implements AmericanSocket {
    @Override
    public void getPower() {
        System.out.println("110 volt");
    }
}
