package com.mygdx.game.screens;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;

public class TankChangeScreen extends TankStarsScreen {

    private Texture TankChangeScreenSprite;

    private TextureRegion TankChangeScreenBackground;
    private TextureRegion TankChangeScreenLogo;
    private TextureRegion TankChangeScreenMusic;
    private TextureRegion TankChangeScreenSound;
    private TextureRegion TankChangeScreenPlayer1Tank;
    private TextureRegion TankChangeScreenPlayer2Tank;
    private TextureRegion TankChangeScreenGroundLine;
    private TextureRegion TankChangeScreenBackButton;
    private TextureRegion TankChangeScreenContinueButton;
    private TextureRegion TankChangeScreenExitButton;


    private SpriteBatch batch;

    private Stage stage;
    private ImageButton musicButton;
    private ImageButton soundButton;
    private ImageButton backButton;
    private ImageButton continueButton;
    private ImageButton exitButton;

    public TankChangeScreen(Game game) {
        super(game);
    }

    @Override
    public void show() {

        TankChangeScreenSprite = new Texture("TankChange/TankChangeSprite.png");
        TankChangeScreenBackground = new TextureRegion(TankChangeScreenSprite, 0, 450, 960, 540);
        TankChangeScreenLogo = new TextureRegion(TankChangeScreenSprite, 166, 0, 286, 144);
        TankChangeScreenMusic = new TextureRegion(TankChangeScreenSprite, 38, 0, 39, 32);
        TankChangeScreenSound = new TextureRegion(TankChangeScreenSprite, 77, 0, 41, 39);
        TankChangeScreenPlayer1Tank = new TextureRegion(TankChangeScreenSprite, 423, 144, 430, 303);
        TankChangeScreenPlayer2Tank = new TextureRegion(TankChangeScreenSprite, 0, 144, 423, 303);
        TankChangeScreenBackButton = new TextureRegion(TankChangeScreenSprite, 0, 0, 38, 40);
        TankChangeScreenContinueButton = new TextureRegion(TankChangeScreenSprite, 452, 0, 287, 75);
        TankChangeScreenExitButton = new TextureRegion(TankChangeScreenSprite, 118, 0, 48, 47);
        TankChangeScreenGroundLine = new TextureRegion(TankChangeScreenSprite, 0, 820, 960, 96);

        batch = new SpriteBatch();
        stage = new Stage();

        musicButton = new ImageButton(new TextureRegionDrawable(TankChangeScreenMusic));
        musicButton.setPosition(831, 467);
        musicButton.setSize(50, 50);

        soundButton = new ImageButton(new TextureRegionDrawable(TankChangeScreenSound));
        soundButton.setPosition(883, 466);
        soundButton.setSize(50, 50);

        backButton = new ImageButton(new TextureRegionDrawable(TankChangeScreenBackButton));
        backButton.setPosition(50, 28);
        backButton.setSize(50, 50);

        continueButton = new ImageButton(new TextureRegionDrawable(TankChangeScreenContinueButton));
        continueButton.setPosition(345, 5);
        continueButton.setSize(300, 75);

        exitButton = new ImageButton(new TextureRegionDrawable(TankChangeScreenExitButton));
        exitButton.setPosition(888, 21);
        exitButton.setSize(50, 50);

        stage.addActor(musicButton);
        stage.addActor(soundButton);
        stage.addActor(backButton);
        stage.addActor(continueButton);
        stage.addActor(exitButton);

        musicButton.addListener(new ClickListener() {
            @Override
            public void clicked(InputEvent event, float x, float y) {
                System.out.println("Music Button Clicked");
            }
        });

        soundButton.addListener(new ClickListener() {
            @Override
            public void clicked(InputEvent event, float x, float y) {
                System.out.println("Sound Button Clicked");
            }
        });

        backButton.addListener(new ClickListener() {
            @Override
            public void clicked(InputEvent event, float x, float y) {
                System.out.println("Back Button Clicked");
                game.setScreen(new StartScreen(game));
            }
        });

        continueButton.addListener(new ClickListener() {
            @Override
            public void clicked(InputEvent event, float x, float y) {
                System.out.println("Continue Button Clicked");
                game.setScreen(new BattleScreen(game));
            }
        });

        exitButton.addListener(new ClickListener() {
            @Override
            public void clicked(InputEvent event, float x, float y) {
                System.out.println("Exit Button Clicked");
                Gdx.app.exit();
            }
        });

        Gdx.input.setInputProcessor(stage);

    }

    @Override
    public void render(float delta) {
        stage.act(delta);
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        batch.begin();
        batch.draw(TankChangeScreenBackground, 0, 0);
        batch.draw(TankChangeScreenLogo, 352, 362);
        batch.draw(TankChangeScreenPlayer1Tank, 36, 64);
        batch.draw(TankChangeScreenPlayer2Tank, 498, 66);

        batch.end();
        stage.draw();
    }

    @Override
    public void hide() {
        dispose();

    }

    @Override
    public void dispose() {
        TankChangeScreenSprite.dispose();
        batch.dispose();
        stage.dispose();
    }
}
