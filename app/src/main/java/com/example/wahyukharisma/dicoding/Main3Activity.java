package com.example.wahyukharisma.dicoding;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    TextView tvName;
    public static String EXTRA_NAME="extra_name";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        tvName=(TextView)findViewById(R.id.tvName);
        Person person=new Person();
        person=getIntent().getParcelableExtra(EXTRA_NAME);
        String temp="Nama : "+person.getName()+"\nNo Telp :"+person.getNoTelp()+"\nAlamat :"+person.getAlamat();
        tvName.setText(temp);

    }
}
