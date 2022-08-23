package com.example.cv;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ButtonBarLayout;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.net.URI;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        TextView name1 = findViewById(R.id.textView);
        TextView age1 = findViewById(R.id.textView1);
        TextView job1 = findViewById(R.id.textView2);
        TextView path1 = findViewById(R.id.textView3);
        TextView number1 = findViewById(R.id.textView4);
        ImageView photo1 = findViewById(R.id.imageView2);
        Button back = findViewById(R.id.button8);


        Bundle bundle = getIntent().getExtras();
        String name = bundle.getString("name");
        name1.setText(name);
        int age =bundle.getInt("age");
        age1.setText(String.valueOf(age));
        String job = bundle.getString("job");
        job1.setText(job);
        int number =bundle.getInt("number");
        number1.setText(String.valueOf(number));
        String path = bundle.getString("path");
        path1.setText(path);
        String uri=bundle.getString("uri");
        photo1.setImageURI(Uri.parse(uri));

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(MainActivity4.this,MainActivity3.class);
                startActivity(intent4);

            }
        });



    }
}