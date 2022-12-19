
//package com.mygdx.game;
//
//import com.badlogic.gdx.Game;
//import com.mygdx.game.screens.HomeScreen;
//import com.mygdx.game.screens.StartScreen;
//public class TankStars extends Game {
//	@Override
//	public void create() {
//		StartScreen startScreen = new StartScreen(this);
//		setScreen(startScreen);
//		startScreen.render(0);
//	}
//}
//


package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.mygdx.game.screens.GameScreen;
import com.mygdx.game.screens.HomeScreen;
import com.mygdx.game.screens.StartScreen;
public class TankStars extends Game {
	@Override
	public void create() {
		GameScreen gameScreen = new GameScreen(this);
		setScreen(gameScreen);
		gameScreen.render(0);
	}

	@Override
	public void render() {
		super.render();
	}

	@Override
	public void dispose() {
		super.dispose();
	}

	@Override
	public void resize(int width, int height) {
		super.resize(width, height);
	}

	@Override
	public void pause() {
		super.pause();
	}

	@Override
	public void resume() {
		super.resume();
	}
}

