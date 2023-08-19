package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

import java.util.ArrayList;

import com.mygdx.game.Dude;

public class FirstGDXGame extends ApplicationAdapter {
    SpriteBatch batch;

    ArrayList<Dude> dudes = new ArrayList<Dude>();

    public void create() {
        batch = new SpriteBatch();
        for (int i = 0; i < 5; i++) {
            dudes.add(new Dude());
        }
    }

    @Override
    public void render() {

        ScreenUtils.clear(1, 0, 0, 1);
        batch.begin();
        for (Dude d : dudes) {
            d.sprite.draw(batch);
            d.update();
        }

        batch.end();
    }

    @Override
    public void dispose() {
        batch.dispose();
        for (Dude d : dudes) {
            d.sprite.getTexture().dispose();
        }
    }
}