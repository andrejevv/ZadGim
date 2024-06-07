package com.example.gimnazija1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void GimnazijaKlik (View view){
        TextView tv = (TextView) view;
        tv.setText(tv.getText()+"Pirot");
    }
    public void OdeljenjeKlik (View view){
        TextView tv = (TextView) view;
        tv.setText(tv.getText()+"III5");
    }
}