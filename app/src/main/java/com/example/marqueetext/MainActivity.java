package com.example.marqueetext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtMarquee;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //casting of textview
        txtMarquee=(TextView)findViewById(R.id.marqueeText);
        //Now we will call setSelected() method and pass boolean value as true
        txtMarquee.setSelected(true);


    }
}