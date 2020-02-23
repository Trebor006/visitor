package com.mibu.visitor;

import java.util.List;

public interface WeaponSelector {
  void setWeapon(Wizard m);

  void setWeapon(Warrior g);

  void setWeapon(Orc orc);

  void setWeapon(List<Weaponizable> characters);
}
