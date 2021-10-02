/**
 Code written by Aidar Maratbekov 2.10.2021.  Copyright (c)
 */

package kz.maratbekovaidar;

public class MiddleJavaDeveloper extends DeveloperDecorator {
    public MiddleJavaDeveloper(Developer developer) {
        super(developer);
    }

    public String makingArchitecture() {
        return "making architecture of program... ";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + makingArchitecture();
    }
}
