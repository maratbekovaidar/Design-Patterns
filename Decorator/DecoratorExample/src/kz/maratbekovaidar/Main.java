/**
 *
 Code written by Aidar Maratbekov 2.10.2021.  Copyright (c)
 */

package kz.maratbekovaidar;

public class Main {
    public static void main(String[] args) {
        Developer TeamLeadDeveloper = new JavaTeamLead(new SeniorJavaDeveloper(new MiddleJavaDeveloper(new JavaDeveloper())));




        System.out.println(TeamLeadDeveloper.makeJob());
    }
}
