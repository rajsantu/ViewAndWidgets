package com.example.viewandwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Toast button call
        button=findViewById(R.id.toast_messages);

        //Event handling

        button.setOnClickListener(this::onClick);


    }

    private void onClick(View view) {

        //Action perform

        Toast.makeText(MainActivity.this, "This is Toast", Toast.LENGTH_LONG).show();
    }


}