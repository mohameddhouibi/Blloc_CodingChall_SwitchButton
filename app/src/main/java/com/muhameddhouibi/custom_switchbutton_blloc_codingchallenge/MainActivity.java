package com.muhameddhouibi.custom_switchbutton_blloc_codingchallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.Switch;

import com.suke.widget.SwitchButton;


public class MainActivity extends AppCompatActivity {

    private Switch compactSwitchButton;
    private SwitchButton sukSwitchButton ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        compactSwitchButton = findViewById(R.id.firstSwitch);
        sukSwitchButton = findViewById(R.id.secondSwitch);

        compactSwitchButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                //TODO first action result
            }
        });
        sukSwitchButton.setOnCheckedChangeListener(new SwitchButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(SwitchButton view, boolean isChecked) {
                //TODO second action result
            }
        });
    }
}