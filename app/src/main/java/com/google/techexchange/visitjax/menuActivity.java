package com.google.techexchange.visitjax;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Toast;


public class menuActivity implements View.OnClickListener {
    @Override
    public void onClick(View view){
        Toast.makeText(view.getContext(),"Open the list of numbers",
                Toast.LENGTH_SHORT).show();
    }
}