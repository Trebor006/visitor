package com.mibu.visitor;

public abstract class Character implements Weaponizable {

    private String weapon = "";

    public String getWeapon() {
        return this.weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

}
