package com.company;

public class HeroWarrior extends GameEntity{
    Weapon weapon = new Weapon();
    public String infoHero() {
        return super.infoHero() + " | Type Weapon: " + weapon.getTypeWeapon() +
                " | Name Weapon: " + weapon.getNameWeapon();
    }
}
