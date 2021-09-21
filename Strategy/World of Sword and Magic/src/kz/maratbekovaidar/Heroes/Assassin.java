package kz.maratbekovaidar.Heroes;

import kz.maratbekovaidar.Hero;
import kz.maratbekovaidar.SkillBehavior;

public class Assassin extends Hero {
    public Assassin() {
        super.HP = 1000;
        super.magic_damage = 5;
        super.physical_damage = 100;
    }

    public Assassin(SkillBehavior skillBehavior) {
        super(skillBehavior);
    }

    public Assassin(int HP, int magic_damage, int physical_damage, String name) {
        super(HP, magic_damage, physical_damage, name);
    }

    @Override
    public void attack() {
        System.out.println("I'll be the last thing you'll ever see!");
    }
}
