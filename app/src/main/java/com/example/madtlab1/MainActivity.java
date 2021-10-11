package com.example.madtlab1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView TxtViewId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.TxtViewId = findViewById(R.id.TxtViewId);
    }

    public void BtnClk(View view) {
        this.TxtViewId.setText("Text Changed :D");
        
    }
    public void ButtonTap(View view){
        this.TxtViewId.setTextColor(Color.BLUE);
    }
}