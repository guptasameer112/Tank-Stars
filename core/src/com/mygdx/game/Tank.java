package com.mygdx.game;

public class Tank {
    private final String tankName;
    private final int healthCapacity;
    private final int moveSpeed;
    private int damageCapacity;

    private int currentHealth;
    private int health;

    public Tank(String tankName, int healthCapacity, int moveSpeed, int x, int y) {
        this.tankName = tankName;
        this.healthCapacity = healthCapacity;
        this.health = healthCapacity;
        this.moveSpeed = moveSpeed;
    }

    public String getTankName() {
        return tankName;
    }
    public int getHealthCapacity() {
        return healthCapacity;
    }
    public int getMoveSpeed() {
        return moveSpeed;
    }
    public int getDamageCapacity() {
        return damageCapacity;
    }
    public int getCurrentHealth() {
        return health;
    }
    public void reduceHealth(int damage) {
        if (damage > 0) {
            health -= damage;
        }
        if (health < 0) {
            health = 0;
        }
    }
}
