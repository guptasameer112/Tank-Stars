package com.mygdx.game;

public class Config {
    private static Config instance = null;
    public static Config getInstance() {
        if (instance == null) {
            instance = new Config();
        }
        return instance;
    }
    private Config() {
    }
    private Tank playerTank;
    private Tank enemyTank;

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

}
