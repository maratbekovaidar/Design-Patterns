package kz.maratbekovaidar;

public class Main {
    public static void main(String[] args) {
        King king = new King();
        king.setWeaponBehavior(new SwordBehavior());
        king.fight();
        king.performWeapon();
    }
}
