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
import com.badlogic.gdx.physics.bullet.Bullet;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;
import com.badlogic.gdx.utils.Timer;

import java.util.ArrayList;


public class BattleScreen extends TankStarsScreen {

    private Batch batch;
    private Stage stage;

    // Images
    private Texture battleScreenSprite;
    private Texture BulletImage;
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
    private ArrayList<Body> bullets = new ArrayList<Body>();
    private ArrayList<Body> enemyBullets = new ArrayList<Body>();
    private ArrayList<Vector2> groundCoords = new ArrayList<Vector2>();

    public BattleScreen(Game game) {
        super(game);
    }

    public void createWorld()
    {
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
        playerTankBodyDef.position.set(new Vector2(100, 220));
        playerTankBody = world.createBody(playerTankBodyDef);
        PolygonShape playerTankShape = new PolygonShape();
        playerTankShape.setAsBox(60, 40);
        playerTankBody.createFixture(playerTankShape, 0.0f);
        playerTankShape.dispose();

        //enemy tank
        BodyDef enemyTankBodyDef = new BodyDef();
        enemyTankBodyDef.type = BodyDef.BodyType.DynamicBody;
        enemyTankBodyDef.position.set(new Vector2(700, 220));
        enemyTankBody = world.createBody(enemyTankBodyDef);
        PolygonShape enemyTankShape = new PolygonShape();
        enemyTankShape.setAsBox(60, 40);
        enemyTankBody.createFixture(enemyTankShape, 0.0f);
        enemyTankShape.dispose();
    }

    public void createBullet()
    {
        BodyDef bulletBodyDef = new BodyDef();
        bulletBodyDef.type = BodyDef.BodyType.DynamicBody;
        bulletBodyDef.position.set(new Vector2(playerTankBody.getPosition().x + 50, playerTankBody.getPosition().y + 10));
        bulletBody = world.createBody(bulletBodyDef);
        PolygonShape bulletShape = new PolygonShape();
        bulletShape.setAsBox(10, 10);
        bulletBody.createFixture(bulletShape, 0.0f);
        bulletShape.dispose();
        bulletBody.applyForceToCenter(5000, 5000, true);
        bulletBody.setGravityScale(10);
        bullets.add(bulletBody);
    }

    public void createEnemyBullet()
    {
        BodyDef bulletBodyDef = new BodyDef();
        bulletBodyDef.type = BodyDef.BodyType.DynamicBody;
        bulletBodyDef.position.set(new Vector2(enemyTankBody.getPosition().x - 50, enemyTankBody.getPosition().y + 10));
        bulletBody = world.createBody(bulletBodyDef);
        PolygonShape bulletShape = new PolygonShape();
        bulletShape.setAsBox(10, 10);
        bulletBody.createFixture(bulletShape, 0.0f);
        bulletShape.dispose();
        bulletBody.applyForceToCenter(-5000, 5000, true);
        bulletBody.setGravityScale(10);
        enemyBullets.add(bulletBody);
    }

    @Override
    public void show() {
        batch = new SpriteBatch();
        stage = new Stage();
        Gdx.input.setInputProcessor(stage);

        // Images
        battleScreenSprite = new Texture("BattleScreen/BattleScreenSprite.png");
        BulletImage = new Texture("BattleScreen/Bullet.png");
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
        battleScreenPlayerTank = new TextureRegion(battleScreenSprite, 0, 51, 86, 56);
        battleScreenEnemyTank = new TextureRegion(battleScreenSprite, 86, 51, 88, 62);


        style = new ImageButton.ImageButtonStyle();
        style.imageUp = new TextureRegionDrawable(battleScreenMenu);
        menubutton = new ImageButton(style);
        menubutton.setPosition(27, 463);
        menubutton.setSize(55, 51);
        menubutton.addListener(new ClickListener() {
            @Override
            public void clicked(InputEvent event, float x, float y) {
                game.setScreen(new StartScreen(game));
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

        // take a look at the input processor

            Gdx.input.setInputProcessor(new InputAdapter() {
                // if left arrow is pressed, apply force to player tank
                @Override
                public boolean keyDown(int keycode) {
                    if (keycode == Input.Keys.LEFT) {
                        playerTankBody.applyForceToCenter(-500, 0, true);
                    }
                    if (keycode == Input.Keys.RIGHT) {
                        playerTankBody.applyForceToCenter(500, 0, true);
                    }

                    if (keycode == Input.Keys.A)
                    {
                        enemyTankBody.applyForceToCenter(-500, 0, true);
                    }
                    if (keycode == Input.Keys.D)
                    {
                        enemyTankBody.applyForceToCenter(500, 0, true);
                    }
                    if (keycode == Input.Keys.SPACE) {
                        createBullet();
                    }
                    if (keycode == Input.Keys.G)
                    {
                        createEnemyBullet();
                    }
                    else
                    {
                        playerTankBody.applyForceToCenter(0,0,true);
                    }
                    return true;
                }
            });
        }


    @Override
    public void render(float delta) {
        stage.act(delta);
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        Batch batch = new SpriteBatch();
        batch.begin();
        batch.draw(battleScreenBackground, 0, 0);
        batch.draw(battleScreenEarth, 750, 288);
        batch.draw(battleScreenPlayer1Health, 207, 448);
        batch.draw(battleScreenPlayer1, 278, 455);
        batch.draw(battleScreenPlayer2Health, 484, 444);
        batch.draw(battleScreenPlaye2, 612, 451);
        batch.draw(battleScreenRedPlanet, 523, 299);
        batch.draw(battleScreenLogo, 404, 381);
        batch.draw(battleScreenRock1, 3, 160);
        batch.draw(battleScreenRock2, 264, 175);
        batch.draw(battleScreenRock, 851, 194);
        batch.draw(battleScreenSuperNova, 304, 299);
        batch.draw(battleScreenWhitePlanet, 75, 303);
        batch.draw(battleScreenGround, 0, 0);
        batch.draw(battleScreenPlayerTank, playerTankBody.getPosition().x - 45, playerTankBody.getPosition().y - 40);
        batch.draw(battleScreenEnemyTank, enemyTankBody.getPosition().x - 30, enemyTankBody.getPosition().y - 40);
//        batch.draw(BulletImage, bulletBody.getPosition().x - 5, bulletBody.getPosition().y - 5);
        batch.end();
        stage.draw();

        // World2D
        world.step(1/60f, 6, 2);

        for (Body bullet : bullets) {
            if (bullet.getPosition().x > 960 || bullet.getPosition().x < 0 || bullet.getPosition().y > 540 || bullet.getPosition().y < 205 || ((bullet.getPosition().y <= enemyTankBody.getPosition().y) && (bullet.getPosition().x >= enemyTankBody.getPosition().x))) {
                world.destroyBody(bullet);
                bullets.remove(bullet);
                break;
            }
        }

        for (Body enemybullet : enemyBullets) {
            if (enemybullet.getPosition().x > 960 || enemybullet.getPosition().x < 0 || enemybullet.getPosition().y > 540 || enemybullet.getPosition().y < 205 || ((enemybullet.getPosition().y <= playerTankBody.getPosition().y + 50) && (enemybullet.getPosition().x <= playerTankBody.getPosition().x + 50))) {
                world.destroyBody(enemybullet);
                enemyBullets.remove(enemybullet);
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
}
