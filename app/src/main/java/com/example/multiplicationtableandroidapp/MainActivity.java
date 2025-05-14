package com.example.multiplicationtableandroidapp;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SeekBar;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    SeekBar seekBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);
        seekBar = findViewById(R.id.seekBar);

        int Max = 20;
        seekBar.setMax(Max);

        int min = 1;
        generateList(min);
        seekBar.setProgress(min);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                int min = 1;
                int timeTableNumber;

                if(progress < min) {

                    timeTableNumber = min;
                    seekBar.setProgress(min);
                }else{

                    timeTableNumber = progress;
                }
                Log.i("message" , String.valueOf(timeTableNumber));

                generateList(timeTableNumber);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }
    public void generateList(int timesTableNumber) {
        ArrayList<String> arrayList = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            arrayList.add(timesTableNumber + " x " + i + " = " + (i * timesTableNumber));
        }

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, arrayList);
        listView.setAdapter(arrayAdapter);
    }
}