package com.anwesome.uiview.holdmebutton;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.Button;

/**
 * Created by anweshmishra on 04/12/16.
 */
public class HoldMeButtonView extends Button {
    private HoldMeButtonDrawable holdMeButtonDrawable = new HoldMeButtonDrawable();
    private Button.OnClickListener onClickListener;
    private boolean shouldUpdate = false;
    public HoldMeButtonView(Context context, AttributeSet attrs) {
        super(context,attrs);
        setBackground(holdMeButtonDrawable);
    }
    public HoldMeButtonView(Context context) {
        super(context);
        setBackground(holdMeButtonDrawable);
    }
    public void setOnClickListener(OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if(holdMeButtonDrawable.holdDone()) {
            onClickListener.onClick(this);
        }
        if(shouldUpdate) {
            if(holdMeButtonDrawable.holdOff()) {
                shouldUpdate = false;
                holdMeButtonDrawable.stop();
            }
            try {
                Thread.sleep(100);
                invalidate();
            } catch (Exception ex) {

            }
        }
    }
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                holdMeButtonDrawable.startHold();
                shouldUpdate = true;
                break;

            case MotionEvent.ACTION_UP:
                holdMeButtonDrawable.offHold();
                break;
            default:
                break;
        }
        postInvalidate();
        return true;
    }
    public void setDefaultColor(int defaultColor) {
        holdMeButtonDrawable.setDefaultColor(defaultColor);
    }
    public void setHoldColor(int holdColor) {
        holdMeButtonDrawable.setHoldColor(holdColor);
    }
}
