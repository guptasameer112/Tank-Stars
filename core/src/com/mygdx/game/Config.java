package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;

import java.io.*;

public class Config implements Serializable {
    private static final long serialVersionUID = 2L;
    private static Config instance = null;
    private Tank playerTank;
    private Tank enemyTank;
    private boolean playerOnesTurn = true;
    private Vector2 playerTankPosition;
    private int x1, y1, x2, y2;
    private Vector2 enemyTankPosition;

    public static Config getInstance() {
        if (instance == null) {
            instance = new Config();
        }
        return instance;
    }
    private Config() {
        playerTankPosition = new Vector2(278, 450);
        enemyTankPosition = new Vector2(612, 454);
    }

    public void setPlayerOnesTurn() {
        playerOnesTurn = true;
    }
    public void setPlayerTwosTurn() {
        playerOnesTurn = false;
    }
    public boolean isPlayerOnesTurn() {
        return playerOnesTurn;
    }

    public void setPlayerTank(int index) {
        switch (index) {
            case 0:
                playerTank = new SpectreTank();
                break;
            case 1:
                playerTank = new AtomicTank();
                break;
            case 2:
                playerTank = new BuratinoTank();
                break;
        }
    }
    public void setPlayerTank(Tank playerTank) {
        this.playerTank = playerTank;
    }
    public void setEnemyTank(int index) {
        switch (index) {
            case 0:
                enemyTank = new SpectreTank();
                break;
            case 1:
                enemyTank = new AtomicTank();
                break;
            case 2:
                enemyTank = new BuratinoTank();
                break;
        }
    }
    public void setEnemyTank(Tank enemyTank) {
        this.enemyTank = enemyTank;
    }
    public Tank getPlayerTank() {
        return playerTank;
    }
    public Tank getEnemyTank() {
        return enemyTank;
    }

//    public void setPlayerOnePosition(int x, int y) {
//        playerTankPosition = new Vector2(x, y);
//    }
//    public void setPlayerTwoPosition(int x, int y) {
//        enemyTankPosition = new Vector2(x, y);
//    }
    public void setPlayerTankPosition(Vector2 playerTankPosition) {
        this.playerTankPosition = playerTankPosition;
    }
    public void setEnemyTankPosition(Vector2 enemyTankPosition) {
        this.enemyTankPosition = enemyTankPosition;
    }
    public Vector2 getPlayerTankPosition() {
        return playerTankPosition;
    }
    public Vector2 getEnemyTankPosition() {
        return enemyTankPosition;
    }

    public void reset() {
        playerTank.setHealth(playerTank.getHealthCapacity());
        enemyTank.setHealth(enemyTank.getHealthCapacity());
//        playerTank = null;
//        enemyTank = null;
//        playerOnesTurn = true;
//        playerTankPosition = null;
//        enemyTankPosition = null;
    }
    public void save() {
        getInstance().setPlayerTankPosition(playerTank.getBody().getPosition());
        getInstance().setEnemyTankPosition(enemyTank.getBody().getPosition());
        System.out.println("Saving...");
        System.out.println("Player tank position: " + playerTankPosition);
        System.out.println("Enemy tank position: " + enemyTankPosition);
        try {
            serialize();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void load() {
        try {
            deserialize();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Player tank position: " + playerTankPosition);
        System.out.println("Enemy tank position: " + enemyTankPosition);
        getInstance().getPlayerTank().battleScreenSprite =  new Texture("BattleScreen/BattleScreenSprite.png");
        getInstance().getEnemyTank().battleScreenSprite =  new Texture("BattleScreen/BattleScreenSprite.png");
        getInstance().getPlayerTank().setTextureRegion();
        getInstance().getEnemyTank().setTextureRegion();
        getInstance().setPlayerTankPosition(new Vector2(x1, y1));
        getInstance().setEnemyTankPosition(new Vector2(x2, y2));
//        playerTank.getBody().setTransform(playerTankPosition, 0);
//        enemyTank.getBody().setTransform(enemyTankPosition, 0);
    }
    public void serialize() throws IOException {
        FileOutputStream fileOut = new FileOutputStream("saveconfig.cfg");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(instance);
        out.close();
        fileOut.close();

    }
    public void deserialize() throws IOException, ClassNotFoundException {
        FileInputStream fileIn = new FileInputStream("saveconfig.cfg");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        instance = (Config) in.readObject();
        in.close();
        fileIn.close();
    }
}
