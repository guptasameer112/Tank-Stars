package com.mygdx.game;

import com.badlogic.gdx.physics.box2d.Body;

public abstract class Tank {
    private final String tankName;
    private final int healthCapacity;
    private int currentHealth;
    private final int moveSpeed;
    private final int damagePerShot;
    private Body body;

    public Tank(String tankName, int healthCapacity, int moveSpeed, int dps) {
        this.tankName = tankName;
        this.healthCapacity = healthCapacity;
        this.currentHealth = healthCapacity;
        this.moveSpeed = moveSpeed;
        this.damagePerShot = dps;
    }

    public String getTankName() {
        return tankName;
    }
    public int getHealthCapacity() {
        return healthCapacity;
    }
    public int getCurrentHealth() {
        return currentHealth;
    }
    public int getMoveSpeed() {
        return moveSpeed;
    }
    public int getDPS() {
        return damagePerShot;
    }
    public Body getBody() {
        return body;
    }
    public void setBody(Body body) {
        this.body = body;
    }

    public void reduceHealth(int damage) {
        if (damage > 0) {
            currentHealth -= damage;
        }
        if (currentHealth < 0) {
            currentHealth = 0;
        }
    }
}
