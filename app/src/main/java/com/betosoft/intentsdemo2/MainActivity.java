package com.betosoft.intentsdemo2;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn2 = findViewById(R.id.btnStart);

        btn2.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent();
                String packageName = "com.betosoft.intentsdemo2";
                String className = "com.betosoft.intentsdemo2.SecondActivity";
                intent.setClassName(packageName, className);
                startActivity(intent);

            }

        });
    }

}