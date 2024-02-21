package com.example.regestration_fr;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void replacetopfrag(Fragment frg) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.topfrag, frg)
                .commit();

    }

    public void replacebottomfrag(Fragment frg){
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.bottomfrag, frg)
                .commit();

    }
}