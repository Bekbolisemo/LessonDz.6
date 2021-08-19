package com.company;

public class Zombie extends Boss {

    public String infoZombie() {

        return "| zombie Hp: " + super.getZombieHp() +
                "| zombie Damage: " + super.getZombieDamage() +
                "| Typ Weapon: " + weapon.getTypeWeapon() +
                "| Name Weapon: " + weapon.getNameWeapon();

    }

}
