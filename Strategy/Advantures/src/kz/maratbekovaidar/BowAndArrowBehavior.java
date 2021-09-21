package kz.maratbekovaidar;

import java.util.Random;

public class BowAndArrowBehavior implements WeaponBehavior {

    Random rand = new Random();
    String[] phrases = {"Headshot!", "}}------>", "Вуухх", "Пиууу"};

    @Override
    public void useWeapon() {
        System.out.println(phrases[rand.nextInt(phrases.length)]);
    }
}
