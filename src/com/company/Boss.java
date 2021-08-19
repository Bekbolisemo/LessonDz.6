package com.company;

public class Boss extends GameEntity {
    Weapon weapon = new Weapon();

    public String infoBoss() {
        return super.infoBoss() + " | Type Weapon: " + weapon.getTypeWeapon() +
                " | Name Weapon: " + weapon.getNameWeapon();
    }
}
