package com.metype.game;

import javafx.scene.paint.Color;

public class Light {
    Polygon shape;
    Color color;
    Vector center;
    int intensity;

    public Light(Polygon shape, Vector center, int intensity){
        this.color = Color.rgb(50,50,50);
        this.shape = shape;
        this.center = center;
    }

    public Light(Polygon shape, Color color, Vector center, int intensity){
        this.color = color;
        this.shape = shape;
        this.center = center;
    }
}
