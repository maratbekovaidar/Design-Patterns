package kz.maratbekovaidar;

import kz.maratbekovaidar.Heroes.Assassin;
import kz.maratbekovaidar.Skills.MagicalSkills.FireBall;
import kz.maratbekovaidar.Skills.MagicalSkills.PoisonSkill;

public class Main {
    public static void main(String[] args) {
        Assassin helcurt = new Assassin();


        helcurt.performSkill(new FireBall());
        helcurt.performSkill(new PoisonSkill());
        helcurt.attack();

    }
}
