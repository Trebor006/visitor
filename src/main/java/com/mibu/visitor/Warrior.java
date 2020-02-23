package com.mibu.visitor;

public class Warrior extends Character {

    public Warrior() {
    }

    @Override
    public void weaponize(WeaponSelector weaponSelector) {
        weaponSelector.setWeapon(this);
    }

}
