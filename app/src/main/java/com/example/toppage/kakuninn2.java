package com.example.toppage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class kakuninn2 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cyuumondesu);

        ((Button) findViewById(R.id.button15)).setOnClickListener((View.OnClickListener) this);

    }

    //onClickメソッド実装
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case (R.id.button15):
                Intent intentStart = new Intent(getApplication(),banngou.class);
                startActivity(intentStart);
                break;


        }
    }
}