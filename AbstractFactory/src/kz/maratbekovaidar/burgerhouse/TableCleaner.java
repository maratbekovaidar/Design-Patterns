package kz.maratbekovaidar.burgerhouse;

import kz.maratbekovaidar.Cleaner;

public class TableCleaner implements Cleaner {
    @Override
    public void toClean() {
        System.out.println("Cleaning tables... ");
    }
}
