package com.nyoba.app.nyoba;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Detail extends AppCompatActivity {
    TextView txtJudul;
    ImageView imgSepeda;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        txtJudul = (TextView)findViewById(R.id.txtJudul);
        imgSepeda = (ImageView)findViewById(R.id.imgSepeda);
        Intent intent = getIntent();
        String receivedName =  intent.getStringExtra("name");
        int receivedImage = intent.getIntExtra("image",0);
        txtJudul.setText(receivedName);
        imgSepeda.setImageResource(receivedImage);
    }
}
