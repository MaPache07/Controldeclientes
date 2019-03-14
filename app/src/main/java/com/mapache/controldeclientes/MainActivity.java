package com.mapache.controldeclientes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView entran, salen;
    private Button add1, add2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        add1 = findViewById(R.id.add1);
        add2 = findViewById(R.id.add2);

        entran = (TextView) findViewById(R.id.entran);
        salen = (TextView) findViewById(R.id.salen);

        add1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int ent = Integer.parseInt(entran.getText().toString());
                ent = ent + 1;
                entran.setText(Integer.toString(ent));
            }
        });

        add2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int sal = Integer.parseInt(salen.getText().toString());
                sal = sal + 1;
                salen.setText(Integer.toString(sal));
            }
        });
    }
}
