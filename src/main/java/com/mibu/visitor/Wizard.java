package com.mibu.visitor;

public class Wizard extends Character {

    public Wizard() {
    }

    @Override
    public void weaponize(WeaponSelector weaponSelector) {
        weaponSelector.setWeapon(this);
    }
}
