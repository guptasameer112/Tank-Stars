package com.mygdx.game.screens;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Stage;

public class GameScreen extends TankStarsScreen {

    private SpriteBatch batch;
    private Stage stage;
    private Texture GameScreenTexture;
    private TextureRegion GameScreenBackground;
    private TextureRegion GameScreenBar;

    public GameScreen(Game game) {
        super(game);
    }

    @Override
    public void show() {
        batch = new SpriteBatch();
        GameScreenTexture = new Texture("GameScreen/GameScreenSprite.png");
        GameScreenBackground = new TextureRegion(GameScreenTexture, 0, 0, 960, 540);
        GameScreenBar = new TextureRegion(GameScreenTexture, 0, 540, 230, 25);
    }

    @Override
    public void render(float delta) {
        batch.begin();
        batch.draw(GameScreenBackground, 0, 0);
        batch.draw(GameScreenBar, 723, 16);
        batch.end();

        Gdx.input.setInputProcessor(new InputAdapter()
        {
            // if space is pressed, go to the next screen
            @Override
            public boolean keyDown(int keycode)
            {
                if (keycode == 62)
                {
                    game.setScreen(new HomeScreen(game));
                }
                return true;
            }
        });
    }
}
