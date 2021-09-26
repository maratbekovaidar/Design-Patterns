package kz.maratbekovaidar;

public class Main {
    public static void main(String[] args) {
        Cafe salambro = new Cafe(10);

        Order bekzat = new Order("Bekzat");
        Order aidar = new Order("Aidar");
        Order kanat = new Order("Kanat");

        salambro.RegisterOrder(bekzat);
        salambro.RegisterOrder(aidar);
        salambro.RegisterOrder(kanat);

        salambro.UnregisterOrder(bekzat);

        Order ablay = new Order("Ablay");
        salambro.RegisterOrder(ablay);

    }
}
