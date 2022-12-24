package com.techcos.clicktochat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class Whatsapp extends AppCompatActivity {

    EditText prefix,number;
    ImageView back;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_whatsapp);

        prefix = findViewById(R.id.prefix);
        number = findViewById(R.id.number);
        submit = findViewById(R.id.Btn_Submit);
        back = findViewById(R.id.back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Whatsapp.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String link = prefix.getText().toString() + number.getText().toString();
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://wa.me/"+link));
                startActivity(intent);
            }
        });

    }
}
