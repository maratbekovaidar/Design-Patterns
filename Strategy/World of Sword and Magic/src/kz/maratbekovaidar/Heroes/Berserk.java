package kz.maratbekovaidar.Heroes;

import kz.maratbekovaidar.Hero;
import kz.maratbekovaidar.SkillBehavior;

public class Berserk extends Hero {
    public Berserk() {
        super.HP = 1000;
        super.magic_damage = 5;
        super.physical_damage = 100;
    }

    public Berserk(SkillBehavior skillBehavior) {
        super(skillBehavior);
    }

    public Berserk(int HP, int magic_damage, int physical_damage, String name) {
        super(HP, magic_damage, physical_damage, name);
    }

    @Override
    public void attack() {
        System.out.println("Rage!!!!");
    }
}
