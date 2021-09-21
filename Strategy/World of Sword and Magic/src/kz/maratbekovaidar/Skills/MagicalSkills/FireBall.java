package kz.maratbekovaidar.Skills.MagicalSkills;

import kz.maratbekovaidar.Skills.MagicSkill;

public class FireBall extends MagicSkill {
    @Override
    public void attackSkill(int HP, double magical_damage) {
        System.out.println("Fire aspect damage: " + super.magical_damage * 1.3);
    }
}
