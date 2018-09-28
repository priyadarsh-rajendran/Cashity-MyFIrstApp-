package com.project.priyadarshrajendran.cashity;


import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Priyadarshini Rajendran on 3/2/2017.
 */
public class Setting extends Activity{
    RelativeLayout relativeLayout;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings);

        Button btnBack = (Button) findViewById(R.id.btn_settings_back);
        Button editExpense = (Button) findViewById(R.id.btn_settings_editExp);
        Button addCategory = (Button) findViewById(R.id.btn_settings_addCat);
        relativeLayout = (RelativeLayout) findViewById(R.id.content_main);
        final EditText editText = (EditText) findViewById(R.id.editTextDialog);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        editExpense.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),Update_AddExpense.class);
                startActivity(i);
            }
        });

        addCategory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),Tab1.class);
                startActivity(i);
            }
        });


    }
}

