//
//package com.mygdx.game.screens;
//
//import com.badlogic.gdx.Game;
//import com.badlogic.gdx.Gdx;
//import com.badlogic.gdx.Input;
//import com.badlogic.gdx.graphics.GL20;
//import com.badlogic.gdx.graphics.OrthographicCamera;
//import com.badlogic.gdx.graphics.Texture;
//import com.badlogic.gdx.graphics.g2d.Batch;
//import com.badlogic.gdx.graphics.g2d.SpriteBatch;
//import com.badlogic.gdx.graphics.g2d.TextureRegion;
//import com.badlogic.gdx.math.Vector2;
//import com.badlogic.gdx.physics.box2d.*;
//import com.badlogic.gdx.scenes.scene2d.InputEvent;
//import com.badlogic.gdx.scenes.scene2d.Stage;
//import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
//import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
//import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;
//
//
//
//public class BattleScreen extends TankStarsScreen {
//
////    Scene2D UI
////    private Stage stage;
////    private ImageButton button;
////    private ImageButton.ImageButtonStyle style;
////
//////    Box2D
////    private World world;
////    private Box2DDebugRenderer debugRenderer;
////    private Body groundBody;
//
//    private Texture battleScreenSprite;
//
//    private TextureRegion battleScreenBackground;
//    private TextureRegion battleScreenEarth;
//    private TextureRegion battleScreenGround;
//    private TextureRegion battleScreenLogo;
//    private TextureRegion battleScreenPlayer1Health;
//    private TextureRegion battleScreenPlayer1;
//    private TextureRegion battleScreenPlayer2Health;
//    private TextureRegion battleScreenPlaye2;
//    private TextureRegion battleScreenRedPlanet;
//    private TextureRegion battleScreenRock1;
//    private TextureRegion battleScreenRock2;
//    private TextureRegion battleScreenRock;
//    private TextureRegion battleScreenSuperNova;
//    private TextureRegion battleScreenTank2;
//    private TextureRegion battleScreenTank;
//    private TextureRegion battleScreenWhitePlanet;
//    private TextureRegion battleScreenMenu;
//
//    private Batch batch;
//
//    private Stage stage;
//
//    ImageButton.ImageButtonStyle style;
//    ImageButton button;
//
//
//    public BattleScreen(Game game) {
//        super(game);
//    }
//
//    World world = new World(new Vector2(0, -9.8f), true);
//    Box2DDebugRenderer debugRenderer = new Box2DDebugRenderer();
//
//    public void createGround()
//    {
//        //ground
//        BodyDef groundBodyDef = new BodyDef();
//        groundBodyDef.position.set(new Vector2(0, 0));
//        Body groundBody = world.createBody(groundBodyDef);
//        PolygonShape groundBox = new PolygonShape();
//        groundBox.setAsBox(50, 1);
//        groundBody.createFixture(groundBox, 0.0f);
//        groundBox.dispose();
//    }
//
//    public void usingChainShape()
//    {
//        //ground
//        BodyDef groundBodyDef = new BodyDef();
//        groundBodyDef.position.set(new Vector2(0, 0));
//        Body groundBody = world.createBody(groundBodyDef);
//        ChainShape groundBox = new ChainShape();
//        groundBox.createChain(new Vector2[]{new Vector2(0, 0), new Vector2(50, 0), new Vector2(50, 1), new Vector2(0, 1)});
//        groundBody.createFixture(groundBox, 0.0f);
//        groundBox.dispose();
//    }
//
//    @Override
//    public void show() {
//
//        battleScreenSprite = new Texture("BattleScreen/BattleScreenSprite.png");
//        battleScreenBackground = new TextureRegion(battleScreenSprite, 0, 416, 960, 540);
//        battleScreenEarth = new TextureRegion(battleScreenSprite, 596, 51, 153, 156);
////        battleScreenGround = new TextureRegion(battleScreenSprite, 0, 207, 960, 209);
//        battleScreenLogo = new TextureRegion(battleScreenSprite, 449, 51, 147, 149);
//        battleScreenPlayer1Health = new TextureRegion(battleScreenSprite, 261, 0, 277, 45);
//        battleScreenPlayer1 = new TextureRegion(battleScreenSprite, 73, 0, 77, 26);
//        battleScreenPlayer2Health = new TextureRegion(battleScreenSprite, 590, 0, 269, 49);
//        battleScreenPlaye2 = new TextureRegion(battleScreenSprite, 0, 0, 73, 19);
//        battleScreenRedPlanet = new TextureRegion(battleScreenSprite, 174, 51, 81, 67);
//        battleScreenRock1 = new TextureRegion(battleScreenSprite, 538, 0, 52, 47);
//        battleScreenRock2 = new TextureRegion(battleScreenSprite, 150, 0, 50, 33);
//        battleScreenRock = new TextureRegion(battleScreenSprite, 200, 0, 61, 37);
//        battleScreenSuperNova = new TextureRegion(battleScreenSprite, 255, 51, 108, 99);
//        battleScreenTank2 = new TextureRegion(battleScreenSprite, 86, 51, 88, 62);
//        battleScreenTank = new TextureRegion(battleScreenSprite, 0, 51, 86, 56);
//        battleScreenWhitePlanet = new TextureRegion(battleScreenSprite, 363, 51, 86, 126);
//        battleScreenMenu = new TextureRegion(battleScreenSprite, 859, 0, 55, 51);
//
//        batch = new SpriteBatch();
//
//        stage = new Stage();
//
//        style = new ImageButton.ImageButtonStyle();
//        style.imageUp = new TextureRegionDrawable(battleScreenMenu);
//        button = new ImageButton(style);
//        button.setPosition(27, 463);
//        button.setSize(55, 51);
//        button.addListener(new ClickListener() {
//            @Override
//            public void clicked(InputEvent event, float x, float y) {
//                game.setScreen(new StartScreen(game));
//            }
//        });
//        stage.addActor(button);
//
//        Gdx.input.setInputProcessor(stage);
//
//    }
//    @Override
//    public void render(float delta) {
//        stage.act(delta);
//        Gdx.gl.glClearColor(0, 0, 0, 1);
//        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
//        Batch batch = new SpriteBatch();
//        batch.begin();
//        batch.draw(battleScreenBackground, 0, 0);
//        batch.draw(battleScreenEarth, 750, 288);
//        batch.draw(battleScreenPlayer1Health, 207, 448);
//        batch.draw(battleScreenPlayer1, 278, 455);
//        batch.draw(battleScreenPlayer2Health, 484, 444);
//        batch.draw(battleScreenPlaye2, 612, 451);
//        batch.draw(battleScreenRedPlanet, 523, 299);
//        batch.draw(battleScreenLogo, 404, 381);
//        batch.draw(battleScreenRock1, 3, 160);
//        batch.draw(battleScreenRock2, 264, 175);
//        batch.draw(battleScreenRock, 851, 194);
//        batch.draw(battleScreenSuperNova, 304, 299);
////        batch.draw(battleScreenGround, 0, 0);
//        batch.draw(battleScreenTank2, 722, 183);
//        batch.draw(battleScreenTank, 82, 169);
//        batch.draw(battleScreenWhitePlanet, 75, 303);
//        batch.end();
//        stage.draw();
//
//        createGround();
//        world.step(1/60f, 6, 2);
//        debugRenderer.render(world, batch.getProjectionMatrix());
//
//
//    }
//    @Override
//    public void hide() {
//        dispose();
//
//    }
//    @Override
//    public void dispose() {
//        battleScreenSprite.dispose();
//    }
//}



package com.mygdx.game.screens;

import com.badlogic.gdx.*;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.*;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.badlogic.gdx.scenes.scene2d.ui.ProgressBar;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;
import com.mygdx.game.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

import static java.lang.Thread.sleep;


public class BattleScreen extends TankStarsScreen {

    int winner;

    private Batch batch;
    private Stage stage;

    // Images
    private Texture battleScreenSprite;

    private Texture GameOverText;
    private Texture Player1WinsText;
    private Texture Player2WinsText;
    private Texture WinText;

    private Texture pauseMenuSprite;
    private TextureRegion pauseMenuBackground;
    private TextureRegion pauseMenuGeneralImage;
    private TextureRegion pauseMenuOuterRectangle;
    private TextureRegion pauseMenuUpperRectangle;

    private TextureRegion battleScreenBackground;
    private TextureRegion battleScreenEarth;
    private TextureRegion battleScreenLogo;
    private TextureRegion battleScreenPlayer1Health;
    private TextureRegion battleScreenPlayer1;
    private TextureRegion battleScreenPlayer2Health;
    private TextureRegion battleScreenPlaye2;
    private TextureRegion battleScreenRedPlanet;
    private TextureRegion battleScreenRock1;
    private TextureRegion battleScreenRock2;
    private TextureRegion battleScreenRock;
    private TextureRegion battleScreenSuperNova;
    private TextureRegion battleScreenWhitePlanet;
    private TextureRegion battleScreenMenu;
    private TextureRegion battleScreenGround;
    private TextureRegion battleScreenPlayerTank;
    private TextureRegion battleScreenEnemyTank;

    ImageButton.ImageButtonStyle style;
    ImageButton menubutton;

    ProgressBar progressBar1;
    ProgressBar progressBar2;

    private Texture playerHealthBar = new Texture("BattleScreen/player 1 health.png");
    private Texture playerTankFuel = new Texture("BattleScreen/player 1 health.png");


    private Texture enemyHealthBar = new Texture("BattleScreen/player 2 health.png");
    private Texture enemyTankFuel = new Texture("BattleScreen/player 2 health.png");

    // World2D
    private World world;
    private Box2DDebugRenderer debugRenderer;
    private OrthographicCamera camera;
    private Vector2 movement = new Vector2();
    private Body ground;
    private Body playerTankBody;
    private Body enemyTankBody;
    private Body bulletBody;
    private ChainShape groundShape;
    //    private ArrayList<Bullet> bullets = new ArrayList<Bullet>();
    private Collection<Bullet> bullets = new ArrayList<Bullet>();
    //    private ArrayList<Bullet> enemyBullets = new ArrayList<Bullet>();
    private Collection<Bullet> enemyBullets = new ArrayList<Bullet>();
    private ArrayList<Vector2> groundCoords = new ArrayList<Vector2>();

    private final Tank playerTank = Config.getInstance().getPlayerTank();
    private final Tank enemyTank = Config.getInstance().getEnemyTank();

    private InputProcessor playerProcessor;
    private InputProcessor enemyProcessor;

    public BattleScreen(Game game) {
        super(game);
    }

    public void createWorld() {
        //ground
        BodyDef groundBodyDef = new BodyDef();
        groundBodyDef.type = BodyDef.BodyType.StaticBody;
        groundBodyDef.position.set(new Vector2(0, 0));
        ground = world.createBody(groundBodyDef);
        groundShape = new ChainShape();
        groundShape.createChain(groundCoords.toArray(new Vector2[groundCoords.size()]));
        ground.createFixture(groundShape, 0.0f);

        //player tank
        BodyDef playerTankBodyDef = new BodyDef();
        playerTankBodyDef.type = BodyDef.BodyType.DynamicBody;
//        playerTankBodyDef.position.set(Config.getInstance().getPlayerTankPosition());
        playerTankBodyDef.position.set(new Vector2(100, 220));
        playerTankBody = world.createBody(playerTankBodyDef);
        PolygonShape playerTankShape = new PolygonShape();
        playerTankShape.setAsBox(60, 40);
        playerTankBody.createFixture(playerTankShape, 0.0f);
        playerTank.setBody(playerTankBody);
        playerTankShape.dispose();

        //enemy tank
        BodyDef enemyTankBodyDef = new BodyDef();
        enemyTankBodyDef.type = BodyDef.BodyType.DynamicBody;
//        enemyTankBodyDef.position.set(Config.getInstance().getEnemyTankPosition());
        enemyTankBodyDef.position.set(new Vector2(700, 220));
        enemyTankBody = world.createBody(enemyTankBodyDef);
        PolygonShape enemyTankShape = new PolygonShape();
        enemyTankShape.setAsBox(60, 40);
        enemyTankBody.createFixture(enemyTankShape, 0.0f);
        enemyTank.setBody(enemyTankBody);
        enemyTankShape.dispose();
    }

    public void createBullet(float speedX, float speedY) {
        BodyDef bulletBodyDef = new BodyDef();
        bulletBodyDef.type = BodyDef.BodyType.DynamicBody;
        bulletBodyDef.position.set(new Vector2(playerTank.getBody().getPosition().x + 50, playerTank.getBody().getPosition().y + 10));
        bulletBody = world.createBody(bulletBodyDef);

        PolygonShape bulletShape = new PolygonShape();
        bulletShape.setAsBox((float) playerTank.getBulletType().getWidth() / 2, (float) playerTank.getBulletType().getHeight() / 2);
        bulletBody.createFixture(bulletShape, 0.0f);
        bulletShape.dispose();
        if (Objects.equals(playerTank.getTankName(), "Buratino")) {
//            bulletBody.setLinearVelocity(playerTank.getBulletType().getSpeed(), 0);
            bulletBody.applyForceToCenter(speedX * 100f, speedY, true);
            // set bullet gravity to 0
            bulletBody.setGravityScale(0);
            // set playerTank fuel to 5
            playerTank.setFuelCapacity(5);
        } else {
            // apply variable force according to the angle
            bulletBody.applyForceToCenter(speedX, speedY, true);
            // apply gravity to the bullet randomly between 5 to 10
            bulletBody.setGravityScale((float) (Math.random() * 5 + 5));
            // set playerTank fuel to 5 for both tanks
            playerTank.setFuelCapacity(5);
        }

        Bullet bullet = new Bullet(playerTank.getBulletType().getDamage(), playerTank.getBulletType().getSpeed(), playerTank);
        bullet.setBody(bulletBody);
        bullets.add(bullet);
    }

    public void createEnemyBullet(float speedX, float speedY) {
        BodyDef bulletBodyDef = new BodyDef();
        bulletBodyDef.type = BodyDef.BodyType.DynamicBody;
        bulletBodyDef.position.set(new Vector2(enemyTank.getBody().getPosition().x - 50, enemyTank.getBody().getPosition().y + 10));
        bulletBody = world.createBody(bulletBodyDef);
        PolygonShape bulletShape = new PolygonShape();
        bulletShape.setAsBox((float) enemyTank.getBulletType().getWidth() / 2, (float) enemyTank.getBulletType().getHeight() / 2);
        bulletBody.createFixture(bulletShape, 0.0f);
        bulletShape.dispose();
        if (Objects.equals(enemyTank.getTankName(), "Buratino")) {
//            bulletBody.setLinearVelocity(-enemyTank.getBulletType().getSpeed(), 0);
            bulletBody.applyForceToCenter(-speedX * 100f, speedY, true);
            bulletBody.setGravityScale(0);
            enemyTank.setFuelCapacity(5);
        } else {
            bulletBody.applyForceToCenter(-speedX, speedY, true);
            bulletBody.setGravityScale((float) (Math.random() * 5 + 5));
            enemyTank.setFuelCapacity(5);
        }

        Bullet bullet = new Bullet(enemyTank.getBulletType().getDamage(), enemyTank.getBulletType().getSpeed(), enemyTank);
        bullet.setBody(bulletBody);
        enemyBullets.add(bullet);
    }

    @Override
    public void show() {
        stage = new Stage();
        Gdx.input.setInputProcessor(stage);

        // Images
        battleScreenSprite = new Texture("BattleScreen/BattleScreenSprite.png");
        battleScreenBackground = new TextureRegion(battleScreenSprite, 0, 454, 960, 540);
        battleScreenEarth = new TextureRegion(battleScreenSprite, 596, 51, 153, 156);
        battleScreenLogo = new TextureRegion(battleScreenSprite, 449, 51, 147, 149);
        battleScreenPlayer1Health = new TextureRegion(battleScreenSprite, 261, 0, 277, 45);
        battleScreenPlayer1 = new TextureRegion(battleScreenSprite, 73, 0, 77, 26);
        battleScreenPlayer2Health = new TextureRegion(battleScreenSprite, 590, 0, 269, 49);
        battleScreenPlaye2 = new TextureRegion(battleScreenSprite, 0, 0, 73, 19);
        battleScreenRedPlanet = new TextureRegion(battleScreenSprite, 174, 51, 81, 67);
        battleScreenRock1 = new TextureRegion(battleScreenSprite, 538, 0, 52, 47);
        battleScreenRock2 = new TextureRegion(battleScreenSprite, 150, 0, 50, 33);
        battleScreenRock = new TextureRegion(battleScreenSprite, 200, 0, 61, 37);
        battleScreenSuperNova = new TextureRegion(battleScreenSprite, 255, 51, 108, 99);
        battleScreenWhitePlanet = new TextureRegion(battleScreenSprite, 363, 51, 86, 126);
        battleScreenMenu = new TextureRegion(battleScreenSprite, 859, 0, 55, 51);
        battleScreenGround = new TextureRegion(battleScreenSprite, 0, 207, 960, 247);
        battleScreenPlayerTank = playerTank.getTextureRegion();
        battleScreenEnemyTank = enemyTank.getTextureRegion();
//        battleScreenPlayerTank = new TextureRegion(battleScreenSprite, 0, 51, 86, 56);
//        battleScreenEnemyTank = new TextureRegion(battleScreenSprite, 86, 51, 88, 62);
        GameOverText = new Texture("PauseMenu/GameOver.png");
        Player1WinsText = new Texture("PauseMenu/Player1.png");
        Player2WinsText = new Texture("PauseMenu/Player2.png");
        WinText = new Texture("PauseMenu/Wins.png");
        WinText.setFilter(Texture.TextureFilter.Linear, Texture.TextureFilter.Linear);
        pauseMenuSprite = new Texture("PauseMenu/PauseMenuSprite.png");
        pauseMenuBackground = new TextureRegion(pauseMenuSprite, 0, 0, 240, 426);
        pauseMenuGeneralImage = new TextureRegion(pauseMenuSprite, 40, 426, 141, 142);
        pauseMenuOuterRectangle = new TextureRegion(pauseMenuSprite, 0, 568, 246, 432);
        pauseMenuUpperRectangle = new TextureRegion(pauseMenuSprite, 0, 1088, 172, 66);



        style = new ImageButton.ImageButtonStyle();
        style.imageUp = new TextureRegionDrawable(battleScreenMenu);
        menubutton = new ImageButton(style);
        menubutton.setPosition(27, 463);
        menubutton.setSize(55, 51);

        // if menu button is pressed, set screen to pauseMenu

        menubutton.addListener(new ClickListener() {
            @Override
            public void clicked(InputEvent event, float x, float y) {
                game.setScreen(new PauseMenu(game));
            }
        });

        stage.addActor(menubutton);

        // World2D
        world = new World(new Vector2(0, -9.8f), true);
        debugRenderer = new Box2DDebugRenderer();
        camera = new OrthographicCamera();
        camera.setToOrtho(false, 960, 540);
        camera.update();

        // Ground
        groundCoords.add(new Vector2(0, 189));
        groundCoords.add(new Vector2(70,186));
        groundCoords.add(new Vector2(157,192));
        groundCoords.add(new Vector2(390, 190));
        groundCoords.add(new Vector2(484,193));
        groundCoords.add(new Vector2(553, 191));
        groundCoords.add(new Vector2(736, 190));
        groundCoords.add(new Vector2(870, 200));
        groundCoords.add(new Vector2(960, 234));
        createWorld();

        playerProcessor = new InputAdapter() {
            @Override
            public boolean keyDown(int keycode) {
                if (keycode == Input.Keys.A && playerTank.getFuelCapacity() > 0) {
                    playerTank.getBody().applyLinearImpulse((float) -playerTank.getMoveSpeed(), 0, playerTank.getBody().getPosition().x, playerTank.getBody().getPosition().y, true);
                    playerTank.setFuelCapacity(playerTank.getFuelCapacity() - 1);
                    System.out.println("Player Fuel capacity: " + playerTank.getFuelCapacity());
                }
                if (keycode == Input.Keys.D && playerTank.getFuelCapacity() > 0) {
                    playerTank.getBody().applyLinearImpulse((float) playerTank.getMoveSpeed(), 0, playerTank.getBody().getPosition().x, playerTank.getBody().getPosition().y, true);
                    playerTank.setFuelCapacity(playerTank.getFuelCapacity() - 1);
                    System.out.println("Player Fuel capacity: " + playerTank.getFuelCapacity());
                }
                if (keycode == Input.Keys.G) {
                    if (Objects.equals(playerTank.getTankName(), "Buratino")) {
                        createBullet(playerTank.getBulletType().getSpeed(), 0);
                    } else if (Objects.equals(playerTank.getTankName(), "Spectre")) {
                        createBullet(playerTank.getBulletType().getSpeed(), playerTank.getBulletType().getSpeed());
                    } else {
                        createBullet(playerTank.getBulletType().getSpeed(), playerTank.getBulletType().getSpeed() * 2.0f);
                        createBullet(playerTank.getBulletType().getSpeed(), playerTank.getBulletType().getSpeed());
                        createBullet(playerTank.getBulletType().getSpeed(), playerTank.getBulletType().getSpeed() * 0.75f);
                    }
                    Config.getInstance().setPlayerTwosTurn();
                    return true;
                }
                if (keycode == Input.Keys.P) {
                    // Get position of enemyTank
                    Vector2 enemyTankPosition = enemyTank.getBody().getPosition();
                    // Get position of playerTank
                    Vector2 playerTankPosition = playerTank.getBody().getPosition();
                    Config.getInstance().setPlayerTankPosition(playerTankPosition);
                    Config.getInstance().setEnemyTankPosition(enemyTankPosition);

//                    // Calculate distance between enemyTank and playerTank
//                    float distance = enemyTankPosition.dst(playerTankPosition);
//                    // If distance is less than 100, then enemyTank is in range
//                    if (distance < 100) {
//                        // Calculate angle between enemyTank and playerTank
//                        float angle = (float) Math.atan2(enemyTankPosition.y - playerTankPosition.y, enemyTankPosition.x - playerTankPosition.x);
//                        // Apply force to enemyTank
//                        enemyTank.getBody().applyLinearImpulse((float) Math.cos(angle) * enemyTank.getMoveSpeed(), (float) Math.sin(angle) * enemyTank.getMoveSpeed(), enemyTankPosition.x, enemyTankPosition.y, true);
//                    }

                    game.setScreen(new PauseMenu(game));
                }
                return true;
            }
            @Override
            public boolean keyUp(int keycode) {
                if (keycode == Input.Keys.A || keycode == Input.Keys.D) {
                    Vector2 vec = playerTank.getBody().getLinearVelocity();
                    vec.x = 0;
                    playerTank.getBody().setLinearVelocity(vec);
                }
                return true;
            }
        };

        enemyProcessor = new InputAdapter() {
            @Override
            public boolean keyDown(int keycode) {
                if (keycode == Input.Keys.LEFT && enemyTank.getFuelCapacity() > 0) {
                    enemyTank.getBody().applyLinearImpulse((float) -enemyTank.getMoveSpeed(), 0, enemyTank.getBody().getPosition().x, enemyTank.getBody().getPosition().y, true);
                    enemyTank.setFuelCapacity(enemyTank.getFuelCapacity() - 1);
                    System.out.println("Enemy fuel capacity: " + enemyTank.getFuelCapacity());
                }
                if (keycode == Input.Keys.RIGHT && enemyTank.getFuelCapacity() > 0) {
                    enemyTank.getBody().applyLinearImpulse((float) enemyTank.getMoveSpeed(), 0, enemyTank.getBody().getPosition().x, enemyTank.getBody().getPosition().y, true);
                    enemyTank.setFuelCapacity(enemyTank.getFuelCapacity() - 1);
                    System.out.println("Enemy fuel capacity = " + enemyTank.getFuelCapacity());
                }
                if (keycode == Input.Keys.SPACE) {
                    if (Objects.equals(enemyTank.getTankName(), "Buratino")) {
                        createEnemyBullet(enemyTank.getBulletType().getSpeed(), 0);
                    } else if (Objects.equals(enemyTank.getTankName(), "Spectre")) {
                        createEnemyBullet(enemyTank.getBulletType().getSpeed(), enemyTank.getBulletType().getSpeed());
                    } else {
                        createEnemyBullet(enemyTank.getBulletType().getSpeed(), enemyTank.getBulletType().getSpeed() * 2.0f);
                        createEnemyBullet(enemyTank.getBulletType().getSpeed(), enemyTank.getBulletType().getSpeed());
                        createEnemyBullet(enemyTank.getBulletType().getSpeed(), enemyTank.getBulletType().getSpeed() * 0.75f);
                    }
                    Config.getInstance().setPlayerOnesTurn();
                    return true;
                }

                if (keycode == Input.Keys.P) {
                    game.setScreen(new PauseMenu(game));
                }
                return true;
            }
            @Override
            public boolean keyUp(int keycode) {
                if (keycode == Input.Keys.LEFT || keycode == Input.Keys.RIGHT) {
                    Vector2 vec = enemyTank.getBody().getLinearVelocity();
                    vec.x = 0;
                    enemyTank.getBody().setLinearVelocity(vec);
                }
                return true;
            }
        };
//        if (Config.getInstance().isPlayerOnesTurn()) {
//            Gdx.input.setInputProcessor(playerProcessor);
//        } else {
//            Gdx.input.setInputProcessor(enemyProcessor);
//        }

//        Gdx.input.setInputProcessor(new InputAdapter() {
//            @Override
//            public boolean keyDown(int keycode) {
//                if (keycode == Input.Keys.A) {
//                    playerTank.getBody().applyLinearImpulse((float) -playerTank.getMoveSpeed(), 0, playerTank.getBody().getPosition().x, playerTank.getBody().getPosition().y, true);
//                }
//                if (keycode == Input.Keys.D) {
//                    playerTank.getBody().applyLinearImpulse((float) playerTank.getMoveSpeed(), 0, playerTank.getBody().getPosition().x, playerTank.getBody().getPosition().y, true);
//                }
//                if (keycode == Input.Keys.LEFT) {
//                    enemyTank.getBody().applyLinearImpulse((float) -enemyTank.getMoveSpeed(), 0, enemyTank.getBody().getPosition().x, enemyTank.getBody().getPosition().y, true);
//                }
//                if (keycode == Input.Keys.RIGHT) {
//                    enemyTank.getBody().applyLinearImpulse((float) enemyTank.getMoveSpeed(), 0, enemyTank.getBody().getPosition().x, enemyTank.getBody().getPosition().y, true);
//                }
//                if (keycode == Input.Keys.G) {
//                    if (Objects.equals(playerTank.getTankName(), "Buratino")) {
//                        createBullet(playerTank.getBulletType().getSpeed(), 0);
//                    } else if (Objects.equals(playerTank.getTankName(), "Spectre")) {
//                        createBullet(playerTank.getBulletType().getSpeed(), playerTank.getBulletType().getSpeed());
//                    } else {
//                        createBullet(playerTank.getBulletType().getSpeed(), playerTank.getBulletType().getSpeed() * 2.0f);
//                        createBullet(playerTank.getBulletType().getSpeed(), playerTank.getBulletType().getSpeed());
//                        createBullet(playerTank.getBulletType().getSpeed(), playerTank.getBulletType().getSpeed() * 0.75f);
//                    }
//                }
//                if (keycode == Input.Keys.SPACE) {
//                    if (Objects.equals(enemyTank.getTankName(), "Buratino")) {
//                        createEnemyBullet(enemyTank.getBulletType().getSpeed(), 0);
//                    } else if (Objects.equals(enemyTank.getTankName(), "Spectre")) {
//                        createEnemyBullet(enemyTank.getBulletType().getSpeed(), enemyTank.getBulletType().getSpeed());
//                    } else {
//                        createEnemyBullet(enemyTank.getBulletType().getSpeed(), enemyTank.getBulletType().getSpeed() * 2.0f);
//                        createEnemyBullet(enemyTank.getBulletType().getSpeed(), enemyTank.getBulletType().getSpeed());
//                        createEnemyBullet(enemyTank.getBulletType().getSpeed(), enemyTank.getBulletType().getSpeed() * 0.75f);
//                    }
//                }
//
//                if (keycode == Input.Keys.P) {
//                    game.setScreen(new PauseMenu(game));
//                }
//                return true;
//            }
//            @Override
//            public boolean keyUp(int keycode) {
//                if (keycode == Input.Keys.A) {
//                    Vector2 vec = playerTank.getBody().getLinearVelocity();
//                    vec.x = 0;
//                    playerTank.getBody().setLinearVelocity(vec);
//                }
//                if (keycode == Input.Keys.D) {
//                    Vector2 vec = playerTank.getBody().getLinearVelocity();
//                    vec.x = 0;
//                    playerTank.getBody().setLinearVelocity(vec);
//                }
//                if (keycode == Input.Keys.LEFT) {
//                    Vector2 vec = enemyTank.getBody().getLinearVelocity();
//                    vec.x = 0;
//                    enemyTank.getBody().setLinearVelocity(vec);
//                }
//                if (keycode == Input.Keys.RIGHT) {
//                    Vector2 vec = enemyTank.getBody().getLinearVelocity();
//                    vec.x = 0;
//                    enemyTank.getBody().setLinearVelocity(vec);
//                }
//                return true;
//            }
//        });

        // create a progress bar
//        ProgressBar.ProgressBarStyle progressBarStyle = new ProgressBar.ProgressBarStyle();
////        progressBarStyle.background = new TextureRegionDrawable(battleScreenPlayer1Health);
//        progressBarStyle.knob = new TextureRegionDrawable(battleScreenPlayer1Health);
//        progressBarStyle.knobBefore = new TextureRegionDrawable(battleScreenPlayer1Health);
//        progressBar1 = new ProgressBar(0, playerTank.getHealthCapacity(), 1, false, progressBarStyle);
//        progressBar1.setPosition(207, 448);
//        progressBar1.setSize(277, 45);
//        progressBar1.setValue(playerTank.getCurrentHealth());
//
//        // create a progress bar
//        ProgressBar.ProgressBarStyle progressBarStyle2 = new ProgressBar.ProgressBarStyle();
//        progressBarStyle2.background = new TextureRegionDrawable(battleScreenPlayer2Health);
//        progressBarStyle2.knob = new TextureRegionDrawable(battleScreenPlayer2Health);
//        progressBarStyle2.knobBefore = new TextureRegionDrawable(battleScreenPlayer2Health);
//
//        progressBarStyle2 = new ProgressBar.ProgressBarStyle(
//
//        progressBar2 = new ProgressBar(0, enemyTank.getHealthCapacity(), 1, false, progressBarStyle2);
//        progressBar2.setPosition(484, 448);
//        progressBar2.setSize(277, 45);
//        progressBar2.setValue(enemyTank.getCurrentHealth());
//
//
//        stage.addActor(progressBar1);
//        stage.addActor(progressBar2);
    }


    @Override
    public void render(float delta) {
        stage.act(delta);
        if (Config.getInstance().isPlayerOnesTurn()) {
            Gdx.input.setInputProcessor(playerProcessor);
        } else {
            Gdx.input.setInputProcessor(enemyProcessor);
        }
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        Batch batch = new SpriteBatch();
        batch.begin();

        batch.draw(battleScreenBackground, 0, 0);
        batch.draw(battleScreenEarth, 750, 288);
//        batch.draw(battleScreenPlayer1Health, 207, 448);
        batch.draw(battleScreenPlayer1, Config.getInstance().getPlayerTankPosition().x, Config.getInstance().getPlayerTankPosition().y);
//        batch.draw(battleScreenPlayer1, 278, 450);
//        batch.draw(battleScreenPlayer2Health, 484, 444);
        batch.draw(battleScreenPlaye2, Config.getInstance().getEnemyTankPosition().x, Config.getInstance().getEnemyTankPosition().y);
//        batch.draw(battleScreenPlaye2, 612, 454);
        batch.draw(battleScreenRedPlanet, 523, 299);
        batch.draw(playerHealthBar, 207, 448, 277 * ((float) playerTank.getCurrentHealth() / playerTank.getHealthCapacity()), 45);
        batch.draw(enemyHealthBar, 484, 448, 277 * ((float) enemyTank.getCurrentHealth() / enemyTank.getHealthCapacity()), 45);
        batch.draw(battleScreenLogo, 404, 381);
        batch.draw(battleScreenRock1, 3, 160);
        batch.draw(battleScreenRock2, 264, 175);
        batch.draw(battleScreenRock, 851, 194);
        batch.draw(battleScreenSuperNova, 304, 299);
        batch.draw(battleScreenWhitePlanet, 75, 303);
        batch.draw(battleScreenGround, 0, 0);
        try {
            batch.draw(battleScreenPlayerTank, playerTank.getBody().getPosition().x - 45, playerTank.getBody().getPosition().y - 40);
        } catch (NullPointerException e) {
            System.out.println(battleScreenPlayerTank);
            System.out.println(playerTank.getBody());
            System.out.println(playerTank.getBody().getPosition());
        }
        batch.draw(battleScreenEnemyTank, enemyTank.getBody().getPosition().x - 30, enemyTank.getBody().getPosition().y - 40);
//        batch.draw(BulletImage, bulletBody.getPosition().x - 5, bulletBody.getPosition().y - 5);
        batch.end();
        stage.draw();

        // World2D
        world.step(1/60f, 6, 2);

        // Check for bullet-tank collision
        CollisionRect bulletRect;
        CollisionRect enemyTankRect = new CollisionRect((int) enemyTank.getBody().getPosition().x - 40, (int) enemyTank.getBody().getPosition().y - 40, 60 + 80, 40 + 80);
        CollisionRect playerTankRect = new CollisionRect((int) playerTank.getBody().getPosition().x, (int) playerTank.getBody().getPosition().y, 60 + 10, 40 + 10);
        Iterator<Bullet> iterator = bullets.iterator();

        while (iterator.hasNext()) {
            Bullet bullet = iterator.next();
            bulletRect = new CollisionRect((int) bullet.getBody().getPosition().x, (int) bullet.getBody().getPosition().y, 40, 40);
            if (bulletRect.collidesWith(enemyTankRect)) {
                enemyTank.getBody().applyLinearImpulse(bullet.getSpeed(), 0, enemyTank.getBody().getPosition().x, enemyTank.getBody().getPosition().y, true);
                enemyTank.getBody().setLinearDamping(1.0f);
                bullets.remove(bullet);
                world.destroyBody(bullet.getBody());
                enemyTank.reduceHealth((int) playerTank.getDPS());

//                02.setValue(enemyTank.getCurrentHealth());

                System.out.println("Enemy tank health: " + enemyTank.getCurrentHealth());
                if (enemyTank.getCurrentHealth() <= 0) {
                    batch.begin();
                    batch.draw(pauseMenuOuterRectangle, 345, 39);
                    batch.draw(pauseMenuBackground, 348, 42);
                    batch.draw(pauseMenuGeneralImage, 398, 267);
                    batch.draw(pauseMenuUpperRectangle, 384, 434);
                    batch.draw(GameOverText, 419, 460);
                    batch.draw(Player1WinsText, 391, 165);
                    batch.draw(WinText, 395, 96);
                    batch.end();
                    pause();
                    System.out.println("Enemy tank destroyed");
                    world.destroyBody(enemyTank.getBody());
                    Gdx.app.exit();
                }
                break;
            }
        }
        iterator = enemyBullets.iterator();
        while (iterator.hasNext()) {
            Bullet bullet = iterator.next();
            bulletRect = new CollisionRect((int) bullet.getBody().getPosition().x - 10, (int) bullet.getBody().getPosition().y - 10, 20 + 20, 20 + 20);
            if (playerTankRect.collidesWith(bulletRect)) {
                playerTank.getBody().applyLinearImpulse(-bullet.getSpeed(), 0, playerTank.getBody().getPosition().x, playerTank.getBody().getPosition().y, true);
                playerTank.getBody().setLinearDamping(1.0f);
                enemyBullets.remove(bullet);
                world.destroyBody(bullet.getBody());
                playerTank.reduceHealth((int) enemyTank.getDPS());

//                progressBar1.setValue(playerTank.getCurrentHealth());

                System.out.println("Player tank health: " + playerTank.getCurrentHealth());
                if (playerTank.getCurrentHealth() <= 0) {
                    batch.begin();
                    batch.draw(pauseMenuOuterRectangle, 345, 39);
                    batch.draw(pauseMenuBackground, 348, 42);
                    batch.draw(pauseMenuGeneralImage, 398, 267);
                    batch.draw(pauseMenuUpperRectangle, 384, 434);
                    batch.draw(GameOverText, 419, 460);
                    batch.draw(Player2WinsText, 391, 165);
                    batch.draw(WinText, 395, 96);
                    batch.end();
                    pause();
                    System.out.println("Player tank destroyed");
                    world.destroyBody(playerTank.getBody());
                    Gdx.app.exit();
                }
                break;
            }
        }

        iterator = bullets.iterator();
        while (iterator.hasNext()) {
            Bullet bullet = iterator.next();
            if (bullet.getBody().getPosition().x > 960 || bullet.getBody().getPosition().x < 0 || bullet.getBody().getPosition().y > 540 || bullet.getBody().getPosition().y < 205) {
                bullets.remove(bullet);
                world.destroyBody(bullet.getBody());
                break;
            }
        }

        iterator = enemyBullets.iterator();
        while (iterator.hasNext()) {
            Bullet bullet = iterator.next();
            if (bullet.getBody().getPosition().x > 960 || bullet.getBody().getPosition().x < 0 || bullet.getBody().getPosition().y > 540 || bullet.getBody().getPosition().y < 205) {
                enemyBullets.remove(bullet);
                world.destroyBody(bullet.getBody());
                break;
            }
        }

        debugRenderer.render(world, camera.combined);
        camera.update();
    }

    @Override
    public void hide() {
        dispose();
    }
    @Override
    public void dispose() {
        battleScreenSprite.dispose();
        stage.dispose();
        world.dispose();
        debugRenderer.dispose();
    }

    @Override
    public void pause() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void resume() {
    }

    @Override
    public void resize(int width, int height) {
    }
}
