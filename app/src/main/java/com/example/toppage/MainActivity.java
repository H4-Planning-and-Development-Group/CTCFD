package com.example.toppage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((Button)findViewById(R.id.mypage)).setOnClickListener(this)

    }

    @Override
    public void onClick(View view){
        switch (view.getId()){
            case(R.id.mypage):
                Intent intentStart= new Intent(getApplication(),kupon.class);
                startActivity(intentStart);
                break;

        }
    }
}