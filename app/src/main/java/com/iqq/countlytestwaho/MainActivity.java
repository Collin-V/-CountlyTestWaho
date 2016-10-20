package com.iqq.countlytestwaho;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bn = (Button) findViewById(R.id.ok);
        bn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final TextView show = (TextView) findViewById(R.id.show);
                show.setText("Hello Android~ and hello my first git project" + new java.util.Date());
            }
        });
    }
}
