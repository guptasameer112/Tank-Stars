package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.physics.box2d.Body;
import org.w3c.dom.Text;

import java.io.Serializable;

public abstract class Tank implements Serializable {
    // Make the class serializable
    private static final long serialVersionUID = 1L;
    private final String tankName;
    private final int healthCapacity;
    private int currentHealth;
    private final int moveSpeed;
//    private final int damagePerShot;
    private final Bullet bullet;
    private transient Body body;
    protected transient TextureRegion textureRegion;
    protected transient Texture battleScreenSprite = new Texture("BattleScreen/BattleScreenSprite.png");

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
    public void setHealth(int health) {
        this.currentHealth = health;
        if (currentHealth > healthCapacity) {
            currentHealth = healthCapacity;
        }
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
    public TextureRegion getTextureRegion() {
        return textureRegion;
    }

    public abstract void setTextureRegion();

    public void reduceHealth(int damage) {
        if (damage > 0) {
            currentHealth -= damage;
        }
        if (currentHealth < 0) {
            currentHealth = 0;
        }
    }
}
