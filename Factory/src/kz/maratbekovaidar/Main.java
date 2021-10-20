package kz.maratbekovaidar;

public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Car toyota = factory.create("Toyota");
        toyota.drive();
        Car audi = factory.create("Audi");
        audi.drive();
        Car bmw = factory.create("BMW");
        bmw.drive();
        Car lada = factory.create("Lada");
        lada.drive();
    }
}
