package com.shariaty.falhafez;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import model.fal;
import model.poet;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickFal(View v) {
        Intent intent1 = new Intent(this,
                fal.class);

        Bundle b = new Bundle();
        intent1.putExtra("bundle data", b);
        startActivity(intent1);
    }

    public void onClickPoet(View v) {
        Intent intent1 = new Intent(this,
                poet.class);

        Bundle b = new Bundle();
        intent1.putExtra("bundle data", b);
        startActivity(intent1);

    }
}