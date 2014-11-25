package com.churpi.games.grumpybusman.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.badlogic.gdx.tools.texturepacker.TexturePacker;
import com.churpi.games.grumpybusman.GrumpyBusmanGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		TexturePacker.process("images", "../android/assets/data","uiskin");
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		new LwjglApplication(new GrumpyBusmanGame(), config);
	}
}

