package com.mibu.visitor;

public class Orc implements Weaponizable {
  private String weapon = "";

  public Orc() {}

  public String getWeapon() {
    return this.weapon;
  }

  public void setWeapon(String weapon) {
    this.weapon = weapon;
  }

  @Override
  public void weaponize(WeaponSelector character) {
    character.setWeapon(this);
  }
}
