package com.example.fooball;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Integer ArgCounter = 0;
    Integer Porcounter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickBtnAddArg(View view) {
        ArgCounter++;
        TextView counterView = findViewById(R.id.txt_counterarg);
        ViewGroup.LayoutParams params = counterView.getLayoutParams();
        counterView.setText(ArgCounter.toString());
        if (ArgCounter >= 1000) {
            params.height = 100;
            counterView.setLayoutParams(params);
        }
        if (ArgCounter >= 10000) {
            params.height = 150;
            counterView.setLayoutParams(params);
        }
    }
    public void onClickBtnAddPor(View view) {
        Porcounter++;
        TextView counterView = findViewById(R.id.txt_counterpor);
        ViewGroup.LayoutParams params = counterView.getLayoutParams();
        counterView.setText(Porcounter.toString());
        if (Porcounter >= 1000) {
            params.height = 100;
            counterView.setLayoutParams(params);
        }
        if (Porcounter >= 10000) {
            params.height = 150;
            counterView.setLayoutParams(params);
        }
    }
    public void onRestoreInstanceState(Bundle savedInstanceState){
        super.onRestoreInstanceState(savedInstanceState);
        if (savedInstanceState != null && savedInstanceState.containsKey("ArgCount")) {
            ArgCounter = savedInstanceState.getInt("ArgCount");
        }
        if (savedInstanceState != null && savedInstanceState.containsKey("PorCount")) {
            Porcounter = savedInstanceState.getInt("PorCount");
        }
    }
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("ArgCount", ArgCounter);
        outState.putInt("PorCount", Porcounter);
    }
    public void resetUI() {
        ((TextView) findViewById(R.id.txt_counterarg)).setText(ArgCounter.toString());
        ((TextView) findViewById(R.id.txt_counterpor)).setText(Porcounter.toString());
    }
    public void onResume() {
        super.onResume();
        resetUI();
    }
    public void onClickBtnObNull(View view) {
        ArgCounter = 0;
        Porcounter = 0;
        TextView counterOrdView = findViewById(R.id.txt_counterarg);
        TextView counterAlsView = findViewById(R.id.txt_counterpor);
        counterOrdView.setText(ArgCounter.toString());
        counterAlsView.setText(Porcounter.toString());
    }

}