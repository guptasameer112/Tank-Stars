package com.mygdx.game;

import com.badlogic.gdx.physics.box2d.Body;

public abstract class Tank {
    private final String tankName;
    private final int healthCapacity;
    private int currentHealth;
    private final int moveSpeed;
//    private final int damagePerShot;
    private final Bullet bullet;
    private Body body;

    public Tank(String tankName, int healthCapacity, int moveSpeed, float dps, int bulletSpeed) {
        this.tankName = tankName;
        this.healthCapacity = healthCapacity;
        this.currentHealth = healthCapacity;
        this.moveSpeed = moveSpeed;
        this.bullet = new Bullet(dps, bulletSpeed, this);
//        this.damagePerShot = dps;
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
    public float getDPS() {
        return bullet.getDamage();
    }
    public Bullet getBulletType() {
        return bullet;
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
