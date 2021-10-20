package kz.maratbekovaidar.restaurant;

import kz.maratbekovaidar.Cleaner;

public class DishesCleaner implements Cleaner {
    @Override
    public void toClean() {
        System.out.println("Cleaning dishes... ");
    }
}
