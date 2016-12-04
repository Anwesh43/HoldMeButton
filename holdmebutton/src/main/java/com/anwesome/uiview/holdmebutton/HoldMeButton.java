package com.anwesome.uiview.holdmebutton;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by anweshmishra on 04/12/16.
 */
public class HoldMeButton {
    private HoldMeButtonView holdMeButtonView;
    public HoldMeButton(Activity activity,String text,int width,int height) {
        holdMeButtonView = new HoldMeButtonView(activity.getApplicationContext());
        holdMeButtonView.setText(text);
        activity.addContentView(holdMeButtonView,new ViewGroup.LayoutParams(width,height));
    }
    public void setOnClickListener(View.OnClickListener onClickListener) {
        holdMeButtonView.setOnClickListener(onClickListener);
    }
}
