package com.mygdx.game.screens;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;

public class PauseMenu extends TankStarsScreen
{
    private Stage stage;
    private SpriteBatch batch;

    private Texture pauseMenuSprite;

    private TextureRegion pauseMenuBackground;
    private TextureRegion pauseMenuGeneralImage;
    private TextureRegion pauseMenuResumeButton;
    private TextureRegion pauseMenuExitButton;
    private TextureRegion pauseMenuOuterRectangle;
    private TextureRegion pausedText;
    private TextureRegion pauseMenuRestartButton;
    private TextureRegion pauseMenuSaveGame;
    private TextureRegion pauseMenuUpperRectangle;

    ImageButton resumeButton;
    ImageButton exitButton;
    ImageButton restartButton;
    ImageButton saveGameButton;

    public PauseMenu(Game game)
    {
        super(game);
    }

    @Override
    public void show()
    {
        stage = new Stage();

        Gdx.input.setInputProcessor(stage);

        pauseMenuSprite = new Texture("PauseMenu/PauseMenuSprite.png");
        pauseMenuBackground = new TextureRegion(pauseMenuSprite, 0, 0, 240, 426);
        pauseMenuGeneralImage = new TextureRegion(pauseMenuSprite, 40, 426, 141, 142);
        pauseMenuResumeButton = new TextureRegion(pauseMenuSprite, 114, 1000, 32, 38);
        pauseMenuExitButton = new TextureRegion(pauseMenuSprite, 0, 426, 40, 41);
        pauseMenuOuterRectangle = new TextureRegion(pauseMenuSprite, 0, 568, 246, 432);
        pausedText = new TextureRegion(pauseMenuSprite, 0, 1000, 75, 16);
        pauseMenuRestartButton = new TextureRegion(pauseMenuSprite, 75, 1000, 39, 38);
        pauseMenuSaveGame = new TextureRegion(pauseMenuSprite, 0, 1038, 178, 50);
        pauseMenuUpperRectangle = new TextureRegion(pauseMenuSprite, 0, 1088, 172, 66);

        resumeButton = new ImageButton(new TextureRegionDrawable(pauseMenuResumeButton));
        exitButton = new ImageButton(new TextureRegionDrawable(pauseMenuExitButton));
        restartButton = new ImageButton(new TextureRegionDrawable(pauseMenuRestartButton));
        saveGameButton = new ImageButton(new TextureRegionDrawable(pauseMenuSaveGame));

        resumeButton.setPosition(392, 73);
        exitButton.setPosition(515, 70);
        restartButton.setPosition(450, 72);
        saveGameButton.setPosition(385, 186);

        resumeButton.addListener(new ClickListener()
        {
            @Override
            public void clicked(InputEvent event, float x, float y)
            {
                // go back to the same screen

            }
        });

        exitButton.addListener(new ClickListener()
        {
            @Override
            public void clicked(InputEvent event, float x, float y)
            {
                game.setScreen(new StartScreen(game));
            }
        });

        restartButton.addListener(new ClickListener()
        {
            @Override
            public void clicked(InputEvent event, float x, float y)
            {
                game.setScreen(new BattleScreen(game));
            }
        });

        saveGameButton.addListener(new ClickListener()
        {
            @Override
            public void clicked(InputEvent event, float x, float y)
            {
                System.out.println("Save Game");
            }
        });

        stage.addActor(resumeButton);
        stage.addActor(exitButton);
        stage.addActor(restartButton);
        stage.addActor(saveGameButton);

        super.show();
    }

    @Override
    public void render(float delta)
    {
        stage.act(delta);

        Batch batch = new SpriteBatch();
        batch.begin();
        batch.draw(pauseMenuOuterRectangle, 345, 39);
        batch.draw(pauseMenuBackground, 348, 42);
        batch.draw(pauseMenuGeneralImage, 398, 267);
        batch.draw(pauseMenuUpperRectangle, 384, 434);
        batch.draw(pausedText, 429, 455);
        batch.end();

        stage.draw();

        super.render(delta);
    }

    @Override
    public void dispose()
    {
        stage.dispose();
    }

    @Override
    public void hide()
    {
        dispose();
    }

    @Override
    public void pause()
    {

    }

    @Override
    public void resume()
    {

    }

    @Override
    public void resize(int width, int height)
    {

    }
}