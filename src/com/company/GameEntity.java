package com.company;

public class GameEntity {
    private int HeroHp;
    private int HeroDamage;
    private int bossHp;
    private int bossDamage;
    private int SkeletonHp;
    private int SkeletonDamage;

    public int getHeroHp() {
        return HeroHp;
    }

    public void setHeroHp(int heroHp) {
        HeroHp = heroHp;
    }

    public int getHeroDamage() {
        return HeroDamage;
    }

    public void setHeroDamage(int heroDamage) {
        HeroDamage = heroDamage;
    }

    public int getBossHp() {
        return bossHp;
    }

    public void setBossHp(int bossHp) {
        this.bossHp = bossHp;
    }

    public int getBossDamage() {
        return bossDamage;
    }

    public void setBossDamage(int bossDamage) {
        this.bossDamage = bossDamage;
    }

    public int getSkeletonHp() {
        return SkeletonHp;
    }

    public void setSkeletonHp(int skeletonHp) {
        SkeletonHp = skeletonHp;
    }

    public int getSkeletonDamage() {
        return SkeletonDamage;
    }

    public void setSkeletonDamage(int skeletonDamage) {
        SkeletonDamage = skeletonDamage;
    }

    public String info() {
        return "| bossHp: " + bossHp + " | bossDamage: " + bossDamage;
    }
}
