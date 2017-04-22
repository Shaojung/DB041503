package com.example.teacher.db041503;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String str = getIntent().getStringExtra("msg");
        TextView tv = (TextView) findViewById(R.id.textView);
        tv.setText(str);
    }
}
