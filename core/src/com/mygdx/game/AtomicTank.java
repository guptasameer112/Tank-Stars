package com.mygdx.game;

import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class AtomicTank extends Tank {
    public AtomicTank() {
        super("Atomic", 3000, 100, 100, 5000);
        this.textureRegion = new TextureRegion(battleScreenSprite, 86, 51, 88, 62);
    }

    @Override
    public void setTextureRegion() {
        this.textureRegion = new TextureRegion(battleScreenSprite, 86, 51, 88, 62);
    }
}
