package kz.maratbekovaidar.beerbar;

import kz.maratbekovaidar.Cleaner;

public class GlassCleaner implements Cleaner {
    @Override
    public void toClean() {
        System.out.println("Cleaning glass of beer... ");
    }
}
