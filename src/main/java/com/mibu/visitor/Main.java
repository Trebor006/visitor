package com.mibu.visitor;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    Warrior g1 = new Warrior();
    Warrior g2 = new Warrior();
    Wizard w1 = new Wizard();
    Wizard w2 = new Wizard();
    Orc orc1 = new Orc();

    // Crear una lista para guardar los elementos
    List<Weaponizable> characters = new ArrayList<>();

    // Agregar los elementos a una lista
    characters.add(g1);
    characters.add(g2);
    characters.add(w1);
    characters.add(w2);
    characters.add(orc1);

    // Creamos el Visitor y le pasamos la lista
    WeaponSelector weaponSelector = new EquipWeapon();
    weaponSelector.setWeapon(characters);

    // Comprobar el resultado:
    System.out.println("Arma del guerrero g1: " + g1.getWeapon());
    System.out.println("Arma del guerrero g2: " + g2.getWeapon());
    System.out.println("Arma del mago w1: " + w1.getWeapon());
    System.out.println("Arma del mago w1: " + w2.getWeapon());
    System.out.println("Arma del Orco orc1: " + orc1.getWeapon());
  }
}
