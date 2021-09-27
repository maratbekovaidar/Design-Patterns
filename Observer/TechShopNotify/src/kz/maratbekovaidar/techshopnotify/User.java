package kz.maratbekovaidar.techshopnotify;

import java.util.List;

public class User implements Observer {
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(List<String> techList, String shopName) {
        System.out.println("Dear " + name + "! New arrivals of techs from " + shopName + "! List: " + techList);
    }
}
