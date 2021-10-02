/**
 Code written by Aidar Maratbekov 2.10.2021.  Copyright (c)
 */

package kz.maratbekovaidar;

public class SeniorJavaDeveloper extends DeveloperDecorator {
    public SeniorJavaDeveloper(Developer developer) {
        super(developer);
    }

    public String makeCodeReview() {
        return "making code review... ";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + makeCodeReview();
    }
}
