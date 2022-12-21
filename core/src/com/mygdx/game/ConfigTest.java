package com.mygdx.game;

import com.badlogic.gdx.math.Vector2;
import org.junit.Test;

import static org.junit.Assert.*;
//import static org.mockito.Mockito.mock;

public class ConfigTest {
//    private static Application app;
//    @BeforeClass
//    public static void setUp() {
////        Gdx.gl = app.getGraphics().getGL20();
//        Gdx.gl = mock(GL20.class);
//        Gdx.gl.glClearColor(0, 0, 0, 1);
//        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
//    }

//    @Test
//    public void testReset() {
//        Config.getInstance().setPlayerTank(1);
//        Config.getInstance().setEnemyTank(0);
//        Config.getInstance().reset();
//        assertEquals(Config.getInstance().getPlayerTank().getCurrentHealth(), Config.getInstance().getPlayerTank().getHealthCapacity());
//        assertEquals(Config.getInstance().getEnemyTank().getCurrentHealth(), Config.getInstance().getEnemyTank().getHealthCapacity());
//    }
//
//    @Test
//    public void testSave() {
//        Config.getInstance().setPlayerTankPosition(new Vector2(1, 1));
//        Config.getInstance().setEnemyTankPosition(new Vector2(2, 2));
//        Config.getInstance().save();
//        Config.getInstance().load();
//        assertEquals(Config.getInstance().getPlayerTankPosition(), new Vector2(1, 1));
//        assertEquals(Config.getInstance().getEnemyTankPosition(), new Vector2(2, 2));
//    }

//    @Test
//    public void testLoad() {
//        Config.getInstance().setPlayerTankPosition(new Vector2(1, 1));
//        Config.getInstance().setEnemyTankPosition(new Vector2(2, 2));
//        Config.getInstance().save();
//        Config.getInstance().load();
//        assertEquals(Config.getInstance().getPlayerTankPosition(), new Vector2(1, 1));
//        assertEquals(Config.getInstance().getEnemyTankPosition(), new Vector2(2, 2));
//    }

//    @Test
//    public void testSetPlayerTank() {
//        Config.getInstance().setPlayerTank(0);
//        assertSame(Config.getInstance().getPlayerTank().getClass(), SpectreTank.class);
//        Config.getInstance().setPlayerTank(1);
//        assertSame(Config.getInstance().getPlayerTank().getClass(), AtomicTank.class);
//        Config.getInstance().setPlayerTank(2);
//        assertSame(Config.getInstance().getPlayerTank().getClass(), BuratinoTank.class);
//    }
//
//    @Test
//    public void testSetEnemyTank() {
//        Config.getInstance().setEnemyTank(0);
//        assertSame(Config.getInstance().getEnemyTank().getClass(), SpectreTank.class);
//        Config.getInstance().setEnemyTank(1);
//        assertSame(Config.getInstance().getEnemyTank().getClass(), AtomicTank.class);
//        Config.getInstance().setEnemyTank(2);
//        assertSame(Config.getInstance().getEnemyTank().getClass(), BuratinoTank.class);
//    }

    @Test
    public void testSetPlayerTankPosition() {
        Config.getInstance().setPlayerTankPosition(new Vector2(1, 1));
        assertEquals(Config.getInstance().getPlayerTankPosition(), new Vector2(1, 1));
    }

    @Test
    public void testSetEnemyTankPosition() {
        Config.getInstance().setEnemyTankPosition(new Vector2(1, 1));
        assertEquals(Config.getInstance().getEnemyTankPosition(), new Vector2(1, 1));
    }

//    @Test
//    public void testGetPlayerTank() {
//        Config.getInstance().setPlayerTank(0);
//        assertSame(Config.getInstance().getPlayerTank().getClass(), SpectreTank.class);
//        Config.getInstance().setPlayerTank(1);
//        assertSame(Config.getInstance().getPlayerTank().getClass(), AtomicTank.class);
//        Config.getInstance().setPlayerTank(2);
//        assertSame(Config.getInstance().getPlayerTank().getClass(), BuratinoTank.class);
//    }
//
//    @Test
//    public void testGetEnemyTank() {
//        Config.getInstance().setEnemyTank(0);
//        assertSame(Config.getInstance().getEnemyTank().getClass(), SpectreTank.class);
//        Config.getInstance().setEnemyTank(1);
//        assertSame(Config.getInstance().getEnemyTank().getClass(), AtomicTank.class);
//        Config.getInstance().setEnemyTank(2);
//        assertSame(Config.getInstance().getEnemyTank().getClass(), BuratinoTank.class);
//    }

    @Test
    public void testGetPlayerTankPosition() {
        Config.getInstance().setPlayerTankPosition(new Vector2(1, 1));
        assertEquals(Config.getInstance().getPlayerTankPosition(), new Vector2(1, 1));
    }

    @Test
    public void testGetEnemyTankPosition() {
        Config.getInstance().setEnemyTankPosition(new Vector2(1, 1));
        assertEquals(Config.getInstance().getEnemyTankPosition(), new Vector2(1, 1));
    }

    @Test
    public void testSetPlayerOnesTurn() {
        Config.getInstance().setPlayerOnesTurn();
        assertTrue(Config.getInstance().isPlayerOnesTurn());
    }

    @Test
    public void testSetPlayerTwosTurn() {
        Config.getInstance().setPlayerTwosTurn();
        assertFalse(Config.getInstance().isPlayerOnesTurn());
    }
}
