package com.anwesome.uiview.holdmebuttondemo;

import android.app.Dialog;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.anwesome.uiview.holdmebutton.HoldMeButton;
import com.anwesome.uiview.holdmebutton.HoldMeButtonView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        HoldMeButton holdMeButton = new HoldMeButton(this,"A",300,300);
        holdMeButton.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View view) {
                setupDialog();
            }
        });
        holdMeButton.setHoldColor(Color.parseColor("#5E35B1"));
    }
    public void setupDialog() {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.view_dialog);
        HoldMeButtonView a = (HoldMeButtonView)dialog.findViewById(R.id.a);
        a.setHoldColor(Color.parseColor("#03A9F4"));
        HoldMeButtonView b = (HoldMeButtonView)dialog.findViewById(R.id.b);
        b.setHoldColor(Color.parseColor("#26A69A"));
        setButtonAction(a,"A");
        setButtonAction(b,"B");
        HoldMeButtonView c = (HoldMeButtonView) dialog.findViewById(R.id.c);
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });
        dialog.show();

    }
    private void setButtonAction(HoldMeButtonView button,final String text) {
        button.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,text,Toast.LENGTH_SHORT).show();
            }
        });
    }
}
