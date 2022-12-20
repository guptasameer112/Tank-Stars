//package com.mygdx.game.screens;
//
//import com.badlogic.gdx.Game;
//import com.badlogic.gdx.graphics.Texture;
//import com.badlogic.gdx.graphics.g2d.Sprite;
//import com.badlogic.gdx.graphics.g2d.SpriteBatch;
//import com.badlogic.gdx.graphics.g2d.TextureRegion;
//import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
//
//public class SavedGamesScreen extends TankStarsScreen {
//    private Texture savedGame1;
//    private Texture savedGame2;
//    private Texture savedGame3;
//    private Texture startScreenSprite;
//    private Texture exitButton;
//    private Texture settings;
//
//    private TextureRegion startScreenBackground;
//    private TextureRegion startScreenTank;
//    private TextureRegion startScreenPlatform;
//    private TextureRegion startScreenTree;
//    private TextureRegion startScreenMuzzle;
//    private TextureRegion tankStarsLogo;
//
//    private Sprite startScreenTankSprite;
//    private Sprite tankStarsLogoSprite;
//
//    private SpriteBatch batch;
//    private ImageButton.ImageButtonStyle savedGame1Style;
//    private ImageButton.ImageButtonStyle savedGame2Style;
//    private ImageButton.ImageButtonStyle savedGame3Style;
//    private ImageButton savedGame1Button;
//    private ImageButton savedGame2Button;
//    private ImageButton savedGame3Button;
//
//    public SavedGamesScreen(Game game) {
//        super(game);
//    }
//
//    @Override
//    public void show() {
//        savedGame1 = new Texture("SavedGames/savedGame1.png");
//        savedGame2 = new Texture("SavedGames/savedGame2.png");
//        savedGame3 = new Texture("SavedGames/savedGame3.png");
//        startScreenSprite = new Texture("StartScreen/startScreenSprite.png");
//        exitButton = new Texture("StartScreen/Raw/exitButton.png");
//        settings = new Texture("StartScreen/Raw/settings.png");
//
//        startScreenBackground = new TextureRegion(startScreenSprite, 0, 0, 960, 540);
//        startScreenTank = new TextureRegion(startScreenSprite, 146, 542, 190, 290);
//        startScreenPlatform = new TextureRegion(startScreenSprite, 338, 542, 567, 136);
//        startScreenTree = new TextureRegion(startScreenSprite, 647, 680, 207,224);
//        startScreenMuzzle = new TextureRegion(startScreenSprite, 0, 851, 135, 77);
//        tankStarsLogo = new TextureRegion(startScreenSprite, 0, 542, 144, 307);
//
//        startScreenTankSprite = new Sprite(startScreenTank);
//        startScreenTankSprite.setPosition(105, 317);
//        startScreenTankSprite.setOrigin(startScreenTankSprite.getWidth()/2, startScreenTankSprite.getHeight()/2);
//        startScreenTankSprite.setRotation(270);
//
//        tankStarsLogoSprite = new Sprite(tankStarsLogo);
//        tankStarsLogoSprite.setPosition(350, 480);
//        tankStarsLogoSprite.setOrigin(tankStarsLogoSprite.getWidth()/2, tankStarsLogoSprite.getHeight()/2);
//        tankStarsLogoSprite.setRotation(270);
//
//        batch = new SpriteBatch();
//    }
//    public void render(float delta) {
//        batch.begin();
//
//        batch.draw(startScreenBackground, 0, 0);
//        batch.draw(startScreenTankSprite, startScreenTankSprite.getX(), startScreenTankSprite.getY(), 0, 0, startScreenTankSprite.getWidth(), startScreenTankSprite.getHeight(), 1, 1, startScreenTankSprite.getRotation());
//        batch.draw(startScreenPlatform, 0, 0);
//        batch.draw(startScreenTree, 445, 0);
//        batch.draw(startScreenMuzzle, 353, 225);
//        batch.draw(tankStarsLogoSprite, tankStarsLogoSprite.getX(), tankStarsLogoSprite.getY(), 0, 0, tankStarsLogoSprite.getWidth(), tankStarsLogoSprite.getHeight(), 1, 1, tankStarsLogoSprite.getRotation());
//        batch.draw(savedGame1, 639, 238);
//        batch.draw(savedGame2, 639, 140);
//        batch.draw(savedGame3, 639, 43);
//        batch.draw(settings, 29, 462);
//        batch.draw(exitButton, 900, 20);
//
//        batch.end();
//    }
//    @Override
//    public void hide() {
//        batch.dispose();
//        savedGame1.dispose();
//        savedGame2.dispose();
//        savedGame3.dispose();
//        startScreenSprite.dispose();
//        exitButton.dispose();
//        settings.dispose();
//    }
//    @Override
//    public void dispose() {
//    }
//}



package com.mygdx.game.screens;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.scenes.scene2d.utils.SpriteDrawable;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;
import com.mygdx.game.Config;

public class SavedGamesScreen extends TankStarsScreen {
    private Texture SavedGameScreenSprite;

    private TextureRegion SavedGameScreenBackground;
    private TextureRegion SavedGameScreenLogo;
    private TextureRegion SavedGameScreenMusic;
    private TextureRegion SavedGameScreenSound;
    private TextureRegion SavedGameScreenTank;
    private TextureRegion SavedGameScreenFire;
    private TextureRegion SavedGameScreenGroundLine;
    private TextureRegion SavedGameScreenSlot1Button;
    private TextureRegion SavedGameScreenSlot2Button;
    private TextureRegion SavedGameScreenSlot3Button;
    private TextureRegion SavedGameScreenBackButton;
    private TextureRegion SavedGameScreenExitButton;

    private SpriteBatch batch;
    private Stage stage;

    private ImageButton.ImageButtonStyle SavedGameScreenSlot1ButtonStyle;
    private ImageButton.ImageButtonStyle SavedGameScreenSlot2ButtonStyle;
    private ImageButton.ImageButtonStyle SavedGameScreenSlot3ButtonStyle;
    private ImageButton.ImageButtonStyle SavedGameScreenBackButtonStyle;
    private ImageButton.ImageButtonStyle SavedGameScreenExitButtonStyle;

    public SavedGamesScreen(Game game) {
        super(game);
    }

    @Override
    public void show() {
        SavedGameScreenSprite = new Texture("SavedGames/SavedGamesScreenSprite.png");
        SavedGameScreenBackButton = new TextureRegion(SavedGameScreenSprite, 39, 0, 38, 40);
        SavedGameScreenBackground = new TextureRegion(SavedGameScreenSprite, 0, 385, 960, 540);
        SavedGameScreenExitButton = new TextureRegion(SavedGameScreenSprite, 118, 0, 48, 47);
        SavedGameScreenFire = new TextureRegion(SavedGameScreenSprite, 307, 133, 238, 252);
        SavedGameScreenTank = new TextureRegion(SavedGameScreenSprite, 545, 133, 324, 217);
//        SavedGameScreenGroundLine = new TextureRegion(SavedGameScreenSprite, 338, 542, 567, 136);
        SavedGameScreenMusic = new TextureRegion(SavedGameScreenSprite, 0, 0, 39, 32);
        SavedGameScreenSound = new TextureRegion(SavedGameScreenSprite, 77, 0, 41, 39);
        SavedGameScreenSlot1Button = new TextureRegion(SavedGameScreenSprite, 0, 50, 295, 83);
        SavedGameScreenSlot2Button = new TextureRegion(SavedGameScreenSprite, 295, 50, 295, 83);
        SavedGameScreenSlot3Button = new TextureRegion(SavedGameScreenSprite, 590, 50, 295, 83);
        SavedGameScreenLogo = new TextureRegion(SavedGameScreenSprite, 0, 133, 307, 144);


        batch = new SpriteBatch();

        stage = new Stage();

        SavedGameScreenSlot1ButtonStyle = new ImageButton.ImageButtonStyle();
        SavedGameScreenSlot1ButtonStyle.up = new TextureRegionDrawable(SavedGameScreenSlot1Button);
        SavedGameScreenSlot1ButtonStyle.down = new TextureRegionDrawable(SavedGameScreenSlot1Button);
        SavedGameScreenSlot1ButtonStyle.checked = new TextureRegionDrawable(SavedGameScreenSlot1Button);

        SavedGameScreenSlot2ButtonStyle = new ImageButton.ImageButtonStyle();
        SavedGameScreenSlot2ButtonStyle.up = new TextureRegionDrawable(SavedGameScreenSlot2Button);
        SavedGameScreenSlot2ButtonStyle.down = new TextureRegionDrawable(SavedGameScreenSlot2Button);
        SavedGameScreenSlot2ButtonStyle.checked = new TextureRegionDrawable(SavedGameScreenSlot2Button);

        SavedGameScreenSlot3ButtonStyle = new ImageButton.ImageButtonStyle();
        SavedGameScreenSlot3ButtonStyle.up = new TextureRegionDrawable(SavedGameScreenSlot3Button);
        SavedGameScreenSlot3ButtonStyle.down = new TextureRegionDrawable(SavedGameScreenSlot3Button);
        SavedGameScreenSlot3ButtonStyle.checked = new TextureRegionDrawable(SavedGameScreenSlot3Button);

        SavedGameScreenBackButtonStyle = new ImageButton.ImageButtonStyle();
        SavedGameScreenBackButtonStyle.up = new TextureRegionDrawable(SavedGameScreenBackButton);
        SavedGameScreenBackButtonStyle.down = new TextureRegionDrawable(SavedGameScreenBackButton);
        SavedGameScreenBackButtonStyle.checked = new TextureRegionDrawable(SavedGameScreenBackButton);

        SavedGameScreenExitButtonStyle = new ImageButton.ImageButtonStyle();
        SavedGameScreenExitButtonStyle.up =  new TextureRegionDrawable(SavedGameScreenExitButton);
        SavedGameScreenExitButtonStyle.down = new TextureRegionDrawable(SavedGameScreenExitButton);
        SavedGameScreenExitButtonStyle.checked = new TextureRegionDrawable(SavedGameScreenExitButton);

        ImageButton SavedGameScreenSlot1Button = new ImageButton(SavedGameScreenSlot1ButtonStyle);
        SavedGameScreenSlot1Button.setPosition(601, 273);
        SavedGameScreenSlot1Button.addListener(new ClickListener() {
            @Override
            public void clicked(InputEvent event, float x, float y) {
                System.out.println("Slot1 clicked");
                // Load config file
                Config.getInstance().load();
                // Start battle screen
                game.setScreen(new BattleScreen(game));
            }
        });
        stage.addActor(SavedGameScreenSlot1Button);

        ImageButton SavedGameScreenSlot2Button = new ImageButton(SavedGameScreenSlot2ButtonStyle);
        SavedGameScreenSlot2Button.setPosition(601, 198);
        stage.addActor(SavedGameScreenSlot2Button);

        ImageButton SavedGameScreenSlot3Button = new ImageButton(SavedGameScreenSlot3ButtonStyle);
        SavedGameScreenSlot3Button.setPosition(601, 123);
        stage.addActor(SavedGameScreenSlot3Button);

        ImageButton SavedGameScreenBackButton = new ImageButton(SavedGameScreenBackButtonStyle);
        SavedGameScreenBackButton.addListener(new ClickListener() {
            @Override
            public void clicked(InputEvent event, float x, float y) {
                game.setScreen(new StartScreen(game));
            }
        });
        SavedGameScreenBackButton.setPosition(50, 28);
        stage.addActor(SavedGameScreenBackButton);

        ImageButton SavedGameScreenExitButton = new ImageButton(SavedGameScreenExitButtonStyle);
        SavedGameScreenExitButton.addListener(new ClickListener() {
            @Override
            public void clicked(InputEvent event, float x, float y) {
                Gdx.app.exit();
            }
        });
        SavedGameScreenExitButton.setPosition(888, 21);
        stage.addActor(SavedGameScreenExitButton);

        Gdx.input.setInputProcessor(stage);

    }
    public void render(float delta) {
        stage.act(delta);
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
        batch.draw(SavedGameScreenBackground, 0, 0);
        batch.draw(SavedGameScreenMusic, 831, 467);
        batch.draw(SavedGameScreenSound, 883, 466);
        batch.draw(SavedGameScreenTank, 68, 94);
//        batch.draw(SavedGameScreenGroundLine, 0, 96);
        batch.draw(SavedGameScreenFire, 242, 115);
        batch.draw(SavedGameScreenLogo, 344, 346);
        batch.end();
        stage.draw();
    }
    @Override
    public void hide() {
        super.hide();
    }
    @Override
    public void dispose() {
        super.dispose();
    }
}
