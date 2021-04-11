package com.geektech;

public class Boss {
    private int health;
    private int hit;
    private String shield;


    public Boss(int health, int hit, String shield) {
        this.health = health;
        this.hit = hit;
        this.shield = shield;
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

    public String getShield() {
        return shield;
    }

    public void setShield(String shield) {
        this.shield = shield;
    }
}
