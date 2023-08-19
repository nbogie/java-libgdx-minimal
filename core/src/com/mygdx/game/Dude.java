package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Vector2;

import static com.badlogic.gdx.math.MathUtils.random;

//asset(s) from https://www.kenney.nl/assets/pirate-pack
public class Dude {
    Vector2 pos;
    Vector2 vel;
    Sprite sprite;

    public Dude() {
        Texture img = new Texture("ship (2).png");
        sprite = new Sprite(img);

        pos = new Vector2(random(400), random(400));
        sprite.setPosition(pos.x, pos.y);

        vel = new Vector2(random(-2, 2), random(-2, 2));
    }


    public void update() {
        pos.add(vel);
        bounceIfNecessary();
        vel.rotateDeg(random(-5, 5));
        sprite.setPosition(pos.x, pos.y);
        sprite.setRotation(vel.angleDeg() + 90);
    }

    public void bounceIfNecessary() {
        if (pos.x > 500 || pos.x < 0) {
            vel.x *= -1;
        }
        if (pos.y > 500 || pos.y < 0) {
            vel.y *= -1;
        }

    }
}

