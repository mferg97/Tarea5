package com.example.tarea5;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    SeekBar seekBar1;
    SeekBar seekBar2;
    SeekBar seekBar3;

    TextView textView1;
    TextView textView2;
    TextView textView3;
    TextView textView4;

    View View5;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textView1 = findViewById(R.id.textView1);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);
        textView4 = findViewById(R.id.textView4);
        View5 = findViewById(R.id.View5);



        seekBar1 = findViewById(R.id.seekBar1);
        seekBar1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @SuppressLint("SetTextI18n")
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                String hexValue = "#" + ColorUtils.decimalToHex(seekBar1.getProgress()) + ColorUtils.decimalToHex(seekBar2.getProgress()) + ColorUtils.decimalToHex(seekBar3.getProgress());
                textView4.setText(hexValue);
                textView1.setText("R: " + i);
                View5.setBackgroundColor(Color.parseColor(hexValue));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }

        });

        seekBar2 = findViewById(R.id.seekBar2);
        seekBar2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @SuppressLint("SetTextI18n")
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                String hexValue = "#" + ColorUtils.decimalToHex(seekBar1.getProgress()) + ColorUtils.decimalToHex(seekBar2.getProgress()) + ColorUtils.decimalToHex(seekBar3.getProgress());
                textView4.setText(hexValue);
                textView2.setText("G: " + i);
                View5.setBackgroundColor(Color.parseColor(hexValue));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }

        });

        seekBar3 = findViewById(R.id.seekBar3);
        seekBar3.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @SuppressLint("SetTextI18n")
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                String hexValue = "#" + ColorUtils.decimalToHex(seekBar1.getProgress()) + ColorUtils.decimalToHex(seekBar2.getProgress()) + ColorUtils.decimalToHex(seekBar3.getProgress());
                textView4.setText(hexValue);
                textView3.setText("B: " + i);
                View5.setBackgroundColor(Color.parseColor(hexValue));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }

        });






        Color.parseColor("#000000");



    }


}
