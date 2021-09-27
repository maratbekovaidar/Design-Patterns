package kz.maratbekovaidar.techshopnotify;

public class Main {
    public static void main(String[] args) {
        TechShop tehnodom = new TechShop("TechnoDom");
        TechShop mechta = new TechShop("Mechta");

        User aidar = new User("Aidar");

        tehnodom.registerUser(aidar);

        tehnodom.addItem("IPhone 13");
        tehnodom.addItem("Samsung s21");
        mechta.addItem("IPhone 12 Pro");
        mechta.registerUser(aidar);
        tehnodom.removeItem("IPhone 13");
        mechta.addItem("RogPhone");
    }
}
