package com.shadoapps.famvisao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar maintoolbar = (Toolbar) findViewById(R.id.main_toolbar);
        setSupportActionBar(maintoolbar);
    }
}
