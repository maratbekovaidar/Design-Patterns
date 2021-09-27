package kz.maratbekovaidar.techshopnotify;

import java.util.List;

public interface Observable {
    void registerUser(Observer user);
    void unregisterUser(Observer user);
    void notifyUsers();
}
