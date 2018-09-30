package com.example.intent.intent;

import android.content.Intent;
import android.net.Uri;
import android.renderscript.Sampler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    EditText etNum,etRoll;
    SeekBar seekBar;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNum = findViewById(R.id.phoneNo);
        etRoll = findViewById(R.id.rollNo);

        seekBar = findViewById(R.id.newSeekbar);
        textView = findViewById(R.id.myText);


        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                textView.setText("Value "+i +"/" + seekBar.getMax());
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

                Toast.makeText(MainActivity.this,"Start Tracking", Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

    public void takeData(View view) {

        int num = Integer.parseInt(etNum.getText().toString());
        int roll = Integer.parseInt(etRoll.getText().toString());





        Intent i = new Intent(this,SecondActivity.class);
        i.putExtra("num",num);
        i.putExtra("roll",roll);
        startActivity(i);

    }
}
