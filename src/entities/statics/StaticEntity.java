package entities.statics;

import entities.Entity;
import game.Handler;

import java.awt.*;

/**
 * Created by Артем on 13.01.2017.
 */
public abstract class StaticEntity extends Entity {
    public StaticEntity(Handler handler, float x, float y, int width, int height) {
        super(handler, x, y, width, height);
    }
}

