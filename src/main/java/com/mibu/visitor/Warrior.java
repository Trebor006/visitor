package com.mibu.visitor;

public class Warrior implements Weaponizable {

  private String weapon = "";

  public Warrior() {}

  public String getWeapon() {
    return this.weapon;
  }

  public void setWeapon(String weapon) {
    this.weapon = weapon;
  }

  @Override
  public void weaponize(WeaponSelector weaponSelector) {
    weaponSelector.setWeapon(this);
  }

}
