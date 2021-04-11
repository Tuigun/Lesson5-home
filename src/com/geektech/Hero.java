package com.geektech;

public class Hero {
    private int health;
    private int hit;
    private String superStrike;


    public Hero(int health, int hit, String superStrike) {
        this.health = health;
        this.hit = hit;
        this.superStrike = superStrike;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHit() {
        return hit;
    }

    public void setHit(int hit) {
        this.hit = hit;
    }

    public String getSuperStrike() {
        return superStrike;
    }

    public void setSuperStrike(String superStrike) {
        this.superStrike = superStrike;
    }
}
