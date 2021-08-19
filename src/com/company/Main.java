package com.company;

public class Main {

    public static void main(String[] args) {

        ////////////////////////////////////////////////////////////
        HeroWarrior heroWarrior = new HeroWarrior();
        Magical magical = new Magical();
        Zombie zombie = new Zombie();
        Boss boss = new Boss();
        Skeleton skeleton = new Skeleton();
       /////////////////////////////////////////////////////////////--------- вывод и реализация класса Boss
        boss.setBossHp(200);
        boss.setBossDamage(50);
        boss.weapon.setTypeWeapon("Steel arms");
        boss.weapon.setNameWeapon("Sledgehammer");
        System.out.println("Boss info- " + boss.infoBoss());
       ////////////////////////////////////////////////////////////--------- вывод и реализация класса Skeleton-1
        skeleton.setSkeletonHp(15);
        skeleton.setSkeletonDamage(20);
        skeleton.setArrows(50);
        System.out.println("info Skeleton1- " + skeleton.infoSkeleton());
        ///////////////////////////////////////////////////////////---------- вывод и реализация класса Skeleton-2
        skeleton.setSkeletonHp(10);
        skeleton.setSkeletonDamage(20);
        skeleton.setArrows(33);
        System.out.println("info Skeleton2- " + skeleton.infoSkeleton());
        //////////////////////////////////////////////////////////////------ вывод и реализация класса Zombie
        zombie.setZombieHp(50);
        zombie.setZombieDamage(15);
        zombie.weapon.setTypeWeapon("iron sword");
        zombie.weapon.setNameWeapon("sword");
        System.out.println("info Zombie- " + zombie.infoZombie());
        //////////////////////////////////////////////////////////////
        heroWarrior.setHeroHp(70);
        heroWarrior.setHeroDamage(35);
        heroWarrior.weapon.setTypeWeapon("indestructible sword");
        heroWarrior.weapon.setNameWeapon("sword");
        System.out.println("info Warrior- " + heroWarrior.infoHero());
        //////////////////////////////////////////////////////////////
        magical.setHeroHp(30);
        magical.setHeroDamage(40);
        magical.weapon.setTypeWeapon("magic wand");
        magical.weapon.setNameWeapon("stick");
        System.out.println("info Magical- " + magical.infoMagical());



    }
}