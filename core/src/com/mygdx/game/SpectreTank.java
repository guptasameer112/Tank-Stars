package com.mygdx.game;

import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class SpectreTank extends Tank {
    public SpectreTank() {
        super("Spectre", 1000, 800, 150, 5000);
        this.textureRegion = new TextureRegion(battleScreenSprite, 0, 51, 86, 56);
    }

    @Override
    public void setTextureRegion() {
        this.textureRegion = new TextureRegion(battleScreenSprite, 0, 51, 86, 56);
    }
}
