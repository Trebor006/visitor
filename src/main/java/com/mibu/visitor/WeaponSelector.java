package com.mibu.visitor;

import java.util.List;

public interface WeaponSelector {
  void setWeapon(Wizard wizard);

  void setWeapon(Warrior warrior);

  void setWeapon(Orc orc);

  void setWeapon(List<Weaponizable> characters);
}
