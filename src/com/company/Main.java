package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        Skeleton skeleton = new Skeleton();
        boss.setBossHp(200);
        boss.setBossDamage(50);
        boss.weapon.setTypeWeapon("Steel arms");
        boss.weapon.setNameWeapon("Sledgehammer");
        skeleton.setSkeletonHp(15);
        skeleton.setSkeletonDamage(20);
        skeleton.setArrows(50);
        System.out.println("Boss info- " + boss.info());

        System.out.println("Skeleton1- " + skeleton.infoSk());
        skeleton.setSkeletonHp(10);
        skeleton.setSkeletonDamage(20);
        skeleton.setArrows(33);

        System.out.println("Skeleton2- " + skeleton.infoSk());


    }
}