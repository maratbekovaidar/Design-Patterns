package kz.maratbekovaidar.Heroes;

import kz.maratbekovaidar.Hero;
import kz.maratbekovaidar.SkillBehavior;

public class Mage extends Hero {
    public Mage() {
        super.HP = 1000;
        super.magic_damage = 90;
        super.physical_damage = 15;
    }

    public Mage(SkillBehavior skillBehavior) {
        super(skillBehavior);
    }

    public Mage(int HP, int magic_damage, int physical_damage, String name) {
        super(HP, magic_damage, physical_damage, name);
    }

    @Override
    public void attack() {
        System.out.println("Magic!!");
    }
}
