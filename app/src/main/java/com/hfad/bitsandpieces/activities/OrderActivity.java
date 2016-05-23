package com.hfad.bitsandpieces.activities;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;

import com.hfad.bitsandpieces.R;

public class OrderActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        //ENABLE UP BUTTON
        ActionBar actionBar = getActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
    }
}
