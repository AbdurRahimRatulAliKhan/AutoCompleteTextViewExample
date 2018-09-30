package com.example.intent.intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

       Bundle bundle = getIntent().getExtras();

       if (bundle != null);
       String value = bundle.getString("name");

        Toast.makeText(this,""+value,Toast.LENGTH_SHORT).show();
    }
}
