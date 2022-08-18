package com.example.cv;

import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
    Button select,submit,clear;
    ImageView photo1;

    ActivityResultLauncher<String> galleryLauncher;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        select = (Button) findViewById(R.id.button5);
        photo1= (ImageView) findViewById(R.id.imageView);
        submit = (Button) findViewById(R.id.button6);
        clear= (Button) findViewById(R.id.button7);



        galleryLauncher = registerForActivityResult(new ActivityResultContracts.GetContent(), new ActivityResultCallback<Uri>() {
            @Override
            public void onActivityResult(Uri uri) {
                photo1.setImageURI(uri);


            }
        });
        select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                galleryLauncher.launch("image/*");


            }

        });

        clear.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View view) {
                                         EditText Edtnumber = findViewById(R.id.editTextNumber);
                                         Edtnumber.getText().clear();
                                         EditText Edtname = findViewById(R.id.editTextTextPersonName);
                                         Edtname.getText().clear();
                                         EditText Edtage = findViewById(R.id.editTextTextPersonName1);
                                         Edtage.getText().clear();
                                         EditText Edtjob = findViewById(R.id.editTextTextPersonName3);
                                         Edtjob.getText().clear();
                                         EditText Edtpath = findViewById(R.id.editTextTextPersonName2);
                                         Edtpath.getText().clear();
                                     }
                                 });
        submit.setOnClickListener(new View.OnClickListener() {
            EditText Edtname = findViewById(R.id.editTextTextPersonName);
            EditText Edtage = findViewById(R.id.editTextTextPersonName1);
            EditText Edtnumber = findViewById(R.id.editTextNumber);
            EditText Edtjob = findViewById(R.id.editTextTextPersonName3);
            EditText  Edtpath = findViewById(R.id.editTextTextPersonName2);



            @Override
            public void onClick(View view) {
                if (Edtname.getText().toString().equals("")) {
                    Toast.makeText(MainActivity3.this, "Plz make sure to fill the space", Toast.LENGTH_SHORT).show();

                } else if (Edtage.getText().toString().equals("")) {
                    Toast.makeText(MainActivity3.this, "Plz make sure to fill the space", Toast.LENGTH_SHORT).show();
                } else if (Edtnumber.getText().toString().equals("")) {
                    Toast.makeText(MainActivity3.this, "Plz make sure to fill the space", Toast.LENGTH_SHORT).show();

                } else if (Edtjob.getText().toString().equals("")) {
                    Toast.makeText(MainActivity3.this, "Plz make sure to fill the space", Toast.LENGTH_SHORT).show();
                } else if (Edtpath.getText().toString().equals("")) {
                    Toast.makeText(MainActivity3.this, "Plz make sure to fill the space", Toast.LENGTH_SHORT).show();
                } else{


                    String name = Edtname.getText().toString();
                    int age = Integer.parseInt(Edtage.getText().toString());
                    int number = Integer.parseInt(Edtnumber.getText().toString());
                    String job = Edtjob.getText().toString();
                    String path = Edtpath.getText().toString();



                    Intent intent3 = new Intent(MainActivity3.this, MainActivity4.class);
                    intent3.putExtra("name", name);
                    intent3.putExtra("age", age);
                    intent3.putExtra("number", number);
                    intent3.putExtra("job", job);
                    intent3.putExtra("path",path);
                    intent3.putExtra("image-uri",photo1.toString());
                    startActivity(intent3);


            }


        }
        });



            }
        }