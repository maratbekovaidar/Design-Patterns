/**
 Code written by Aidar Maratbekov 2.10.2021.  Copyright (c)
 */

package kz.maratbekovaidar;

public class DeveloperDecorator implements Developer {
    Developer developer;

    public DeveloperDecorator(Developer developer) {
        this.developer = developer;
    }

    @Override
    public String makeJob() {
        return developer.makeJob();
    }
}
