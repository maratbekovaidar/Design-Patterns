package kz.maratbekovaidar.techshopnotify;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class TechShop implements Observable {
    private String shopName;
    List<Observer> userList = new ArrayList<>();
    List<String> techList = new ArrayList<>();

    public TechShop(String shopName) {
        this.shopName = shopName;
    }

    public void addItem(String item) {
        this.techList.add(item);
        notifyUsers();
    }

    public void removeItem(String item) {
        this.techList.remove(item);
        notifyUsers();
    }

    @Override
    public void registerUser(Observer user) {
        userList.add(user);
    }

    @Override
    public void unregisterUser(Observer user) {
        userList.remove(user);
    }

    @Override
    public void notifyUsers() {
        for (Observer user: userList) {
            user.update(techList, this.shopName);
        }
    }
}
