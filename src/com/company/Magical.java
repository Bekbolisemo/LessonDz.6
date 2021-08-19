package com.company;

public class Magical extends HeroWarrior {
    public String infoMagical(){
        return super.infoHero() + " | Type Weapon: " +  weapon.getTypeWeapon() + " | Name Weapon: " + weapon.getNameWeapon();
    }
}
