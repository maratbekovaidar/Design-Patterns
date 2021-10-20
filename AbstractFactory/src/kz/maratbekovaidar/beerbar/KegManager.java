package kz.maratbekovaidar.beerbar;

import kz.maratbekovaidar.Manager;

public class KegManager implements Manager {
    @Override
    public void manage() {
        System.out.println("Managing transportation of beer kegs...");
    }
}
