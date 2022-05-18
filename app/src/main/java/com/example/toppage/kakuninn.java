package com.example.toppage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class kakuninn extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kakuninn);

        ((Button) findViewById(R.id.credit)).setOnClickListener((View.OnClickListener) this);

    }

    //onClickメソッド実装
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case (R.id.credit):
                Intent intentStart = new Intent(getApplication(),kakuninn2.class);
                startActivity(intentStart);
                break;


        }
    }
}