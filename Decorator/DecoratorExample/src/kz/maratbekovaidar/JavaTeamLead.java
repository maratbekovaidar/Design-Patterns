/**
 Code written by Aidar Maratbekov 2.10.2021.  Copyright (c)
 */

package kz.maratbekovaidar;

public class JavaTeamLead extends DeveloperDecorator {
    public JavaTeamLead(Developer developer) {
        super(developer);
    }

    public String sendWeekReport() {
        return "making weekly report... ";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + sendWeekReport();
    }
}
