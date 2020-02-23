package com.mibu.visitor;

import java.util.List;

public class EquipWeapon implements WeaponSelector {

  @Override
  public void setWeapon(Wizard wizard) {
    wizard.setWeapon("Varita Mágica");
  }

  @Override
  public void setWeapon(Warrior warrior) {
    warrior.setWeapon("Espada");
  }

  @Override
  public void setWeapon(Orc orc) {
    orc.setWeapon("Mazo de Madera");
  }

  @Override
  public void setWeapon(List<Weaponizable> characters) {
    for (Weaponizable p : characters) {
      p.weaponize(this);
    }
  }
}
