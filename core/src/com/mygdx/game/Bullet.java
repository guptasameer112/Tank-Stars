package com.mygdx.game;

import com.badlogic.gdx.physics.box2d.Body;

public class Bullet {
    //    private int direction;
    private final Tank ownerTank;
    private Body body;
    private final float damage;
    private final int speed;
    private final int width = 20;
    private final int height = 20;

    public Bullet(float damage, int speed, Tank ownerTank) {
//        this.body = body;
        this.damage = damage;
        this.speed = speed;
        this.ownerTank = ownerTank;
//        this.direction = direction;
//        this.x = x;
//        this.y = y;
    }
    public Body getBody() {
        return body;
    }
    public void setBody(Body body) {
        this.body = body;
    }
    public float getDamage() {
        return damage;
    }
    public int getSpeed() {
        return speed;
    }
    public Tank getTank() {
        return ownerTank;
    }
    public int getWidth() {
        return width;
    }
    public int getHeight() {
        return height;
    }
}
