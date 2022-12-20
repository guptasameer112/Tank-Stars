package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class BuratinoTank extends Tank {
    public BuratinoTank() {
        super("Buratino", 1000, 1000, 150, 1000000000);
        Texture buratinoTankTexture = new Texture("BattleScreen/BuratinoTank.png");
        this.textureRegion = new TextureRegion(buratinoTankTexture, 0, 0, 86, 64);
    }

    @Override
    public void setTextureRegion() {
        Texture buratinoTankTexture = new Texture("BattleScreen/BuratinoTank.png");
        this.textureRegion = new TextureRegion(buratinoTankTexture, 0, 0, 86, 64);
    }
}

