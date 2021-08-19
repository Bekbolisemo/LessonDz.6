package com.company;

public class Skeleton extends Boss {
    private int arrows;



    public void setArrows(int arrows) {
        this.arrows = arrows;
    }

    public String infoSkeleton() {
        return "| Skeleton Hp: " + super.getSkeletonHp() +
                "| Skeleton Damage: " + super.getSkeletonDamage() +
                " | arrows:" + arrows;
    }
}
