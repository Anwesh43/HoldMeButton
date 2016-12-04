package com.anwesome.uiview.holdmebutton;

import android.graphics.*;
import android.graphics.drawable.Drawable;

/**
 * Created by anweshmishra on 04/12/16.
 */

public class HoldMeButtonDrawable extends Drawable{
    private Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    private int holdColor = Color.parseColor("#00E676");
    private int defaultColor = Color.parseColor("#90A4AE");
    private float scale_hold = 0,scale_hold_dir=0;
    public void draw(Canvas canvas) {
        int w = canvas.getWidth(),h = canvas.getHeight();
        float radius = w/2;
        if(w>h) {
            radius = h/2;
        }
        paint.setColor(defaultColor);
        canvas.drawCircle(w/2,h/2,radius,paint);
        paint.setColor(holdColor);
        canvas.save();
        canvas.translate(w/2,h/2);
        canvas.scale(scale_hold,scale_hold);
        canvas.drawCircle(0,0,radius,paint);
        canvas.restore();
        scale_hold+=scale_hold_dir;
        if(holdDone() || holdOff()) {
            scale_hold_dir = 0;
        }
    }
    public int getOpacity() {
        return 0;
    }
    public void setAlpha(int alpha) {
        paint.setAlpha(alpha);
    }
    public void setColorFilter(ColorFilter colorFilter) {
        paint.setColorFilter(colorFilter);
    }
    public boolean holdDone() {
        return scale_hold>=1;
    }
    public boolean holdOff() {
        return scale_hold <= 0;
    }
    public void startHold() {
        scale_hold_dir = 0.1f;
    }
    public void offHold() {
        scale_hold_dir = -0.1f;
    }
    public void setHoldColor(int holdColor) {
        this.holdColor = holdColor;
    }
    public void setDefaultColor(int defaultColor) {
        this.defaultColor = defaultColor;
    }
    public void stop() {
        scale_hold = 0;
        scale_hold_dir = 0;
    }
}
