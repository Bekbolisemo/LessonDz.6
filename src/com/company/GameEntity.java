package com.company;

public class GameEntity {
    private int heroHp;
    private int heroDamage;
    private int bossHp;
    private int bossDamage;
    private int skeletonHp;
    private int skeletonDamage;
    private int zombieHp;
    private int zombieDamage;

    public int getHeroHp() {
        return heroHp;
    }

    public void setHeroHp(int heroHp) {
        this.heroHp = heroHp;
    }

    public int getHeroDamage() {
        return heroDamage;
    }

    public void setHeroDamage(int heroDamage) {
        this.heroDamage = heroDamage;
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
        return skeletonHp;
    }

    public void setSkeletonHp(int skeletonHp) {
        this.skeletonHp = skeletonHp;
    }

    public int getSkeletonDamage() {
        return skeletonDamage;
    }

    public void setSkeletonDamage(int skeletonDamage) {
        this.skeletonDamage = skeletonDamage;
    }

    public int getZombieHp() {
        return zombieHp;
    }

    public void setZombieHp(int zombieHp) {
        this.zombieHp = zombieHp;
    }

    public int getZombieDamage() {
        return zombieDamage;
    }

    public void setZombieDamage(int zombieDamage) {
        this.zombieDamage = zombieDamage;
    }

    public String infoBoss() {
        return "| bossHp: " + getBossHp() + " | bossDamage: " + getBossDamage();
    }
    public String infoHero(){
        return  "| HeroHp: " + getHeroHp() + " | heroDamage: "+ getHeroDamage();
    }
}
