package kz.maratbekovaidar;

public class KnifeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Sharpness attack!");
    }
}
