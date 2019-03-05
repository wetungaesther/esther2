package com.example.esther;

import android.content.Intent;
import android.net.wifi.hotspot2.pps.HomeSp;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MYCOSTOMER extends AppCompatActivity {
Button btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mycostomer);
        btn2=(Button) findViewById(R.id.submitbtn);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent objj= new Intent(MYCOSTOMER.this, home.class);
                startActivity(objj);

            }
        });

    }
}
