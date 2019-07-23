package com.example.nightmode;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AppCompatDelegate;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        
        // AppCompatDelegate.MODE_NIGHT_NO,   AppCompatDelegate.MODE_NIGHT_YES, AppCompatDelegate.MODE_NIGHT_AUTO
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
    }

    private void initViews() {

        TextView textModeType = findViewById(R.id.tv_mode);

       int modeType = AppCompatDelegate.getDefaultNightMode();

        if (modeType == AppCompatDelegate.MODE_NIGHT_AUTO) {
            textModeType.setText("Default Mode Type: Auto");
        } else if (modeType == AppCompatDelegate.MODE_NIGHT_NO) {
            textModeType.setText("Default Mode Type: Day");
        } else if (modeType == AppCompatDelegate.MODE_NIGHT_YES) {
            textModeType.setText("Default Mode Type: Night");
        }
    }
}
