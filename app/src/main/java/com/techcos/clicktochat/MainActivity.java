package com.techcos.clicktochat;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;

import java.util.Objects;


public class MainActivity extends AppCompatActivity {

    Button wa,tg;
    GridView gridView;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        MobileAds.initialize(this);
//        wa=findViewById(R.id.Btn_wa);
//        tg=findViewById(R.id.Btn_tg);
        toolbar = findViewById(R.id.main_page_toolbar);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setTitle(Html.fromHtml("<small>C2C - Click To Chat</small>"));

        gridView = findViewById(R.id.gridview);
        gridView.setBackgroundColor(Color.parseColor("#FFFFFF"));
        ImageAdapter imageAdapter = new ImageAdapter(this);
        gridView.setAdapter(imageAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0) {
                    Intent intent = new Intent(MainActivity.this, Whatsapp.class);
                    startActivity(intent);
                }
//                else if(i==1) {
//                    Intent intent = new Intent(getActivity(), EceSemList.class);
//                    startActivity(intent);
//                }
            }
        });

//        wa.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(MainActivity.this,Whatsapp.class));
//            }
//        });
//        tg.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(MainActivity.this,Telegram.class));
//            }
//        });

        
    }
}
