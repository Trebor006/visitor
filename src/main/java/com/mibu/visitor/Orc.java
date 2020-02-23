package com.mibu.visitor;

public class Orc extends Character {

    public Orc() {
    }

    @Override
    public void weaponize(WeaponSelector character) {
        character.setWeapon(this);
    }
}
