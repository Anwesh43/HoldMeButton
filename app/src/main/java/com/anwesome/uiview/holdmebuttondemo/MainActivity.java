package com.anwesome.uiview.holdmebuttondemo;

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
                Toast.makeText(MainActivity.this,"A",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
