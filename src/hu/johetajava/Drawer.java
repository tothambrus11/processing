package hu.johetajava;

import processing.core.PApplet;

public class Drawer extends PApplet {

    static final String title = "Processing...";
    static Colors colors;
    static final int width = 600;
    static final int height = 600;


    public void setup() {

        surface.setTitle(title);

    }

    public void settings() {
        App.drawer = this;

        size(width, height);
        colors = new Colors("dark");
    }

    public void draw() {
        background(colors.backgroundColor);
        circle(random(width), random(height), random(30));
    }
}
