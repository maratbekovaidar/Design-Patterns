package kz.maratbekovaidar;

public abstract class Character {

    WeaponBehavior weaponBehavior;

    public Character() {

    }

    public Character(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }

    public void performWeapon() {
        weaponBehavior.useWeapon();
    }

    public abstract void fight();

}
