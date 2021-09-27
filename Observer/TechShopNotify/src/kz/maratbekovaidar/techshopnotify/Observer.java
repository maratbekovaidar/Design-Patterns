package kz.maratbekovaidar.techshopnotify;

import java.util.List;

public interface Observer {
    void update(List<String> techList, String shopName);
}
