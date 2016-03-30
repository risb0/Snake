package com.example.risbo.snake;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;

import stanford.androidlib.graphics.GCanvas;
import stanford.androidlib.graphics.GColor;
import stanford.androidlib.graphics.GLabel;


public class SnakeView extends GCanvas {

    private GLabel helloLabel;

    public SnakeView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public void init() {
        //TODO

        helloLabel = new GLabel("SNAKE", 10, 10);
        helloLabel.setFont(Typeface.MONOSPACE, 40);
        helloLabel.setColor(GColor.BLACK);

        add(helloLabel);


        animate(30);



    }
}
