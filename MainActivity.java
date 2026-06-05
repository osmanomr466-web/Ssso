package com.iapp.maker;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.view.Gravity;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setGravity(Gravity.CENTER);
        
        TextView tv = new TextView(this);
        tv.setText("مرحباً بك في تطبيقي الأول!");
        tv.setTextSize(24);
        
        Button btn = new Button(this);
        btn.setText("اضغط هنا");
        
        layout.addView(tv);
        layout.addView(btn);
        
        setContentView(layout);
    }
}