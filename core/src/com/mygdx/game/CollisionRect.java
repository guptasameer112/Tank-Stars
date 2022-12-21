package com.mygdx.game;

public class CollisionRect {
    public int x, y, width, height;
    public CollisionRect(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    public boolean collidesWith(CollisionRect rect) {
        return ( (x < rect.x + rect.width) && (x + width > rect.x) ) &&
            ( (y < rect.y + rect.height) && (y + height > rect.y)
        );
    }
}
