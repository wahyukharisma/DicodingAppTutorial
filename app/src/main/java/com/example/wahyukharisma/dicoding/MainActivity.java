package com.example.wahyukharisma.dicoding;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnPindah,btnPindahData,btnPindahDataObject,btnDial,btnResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initialize
        btnPindah=(Button)findViewById(R.id.btn_1);
        btnPindahData=(Button)findViewById(R.id.btn_2);
        btnPindahDataObject=(Button)findViewById(R.id.btn_3);
        btnDial=(Button)findViewById(R.id.btn_4);
        btnResult=(Button)findViewById(R.id.btn_2);

        //Action Click
        btnPindah.setOnClickListener(this);
        btnPindahData.setOnClickListener(this);
        btnDial.setOnClickListener(this);
        btnPindahDataObject.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_1:
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);
                break;
            case R.id.btn_2:
                Intent moveData=new Intent(MainActivity.this,Main3Activity.class);
                moveData.putExtra(Main3Activity.EXTRA_NAME,"wahyu");
                startActivity(moveData);
                break;
            case R.id.btn_4:
                String phone="08122520788";
                Intent dial=new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+phone));
                startActivity(dial);
                break;
            case R.id.btn_3:
                Person person=new Person();
                person.setAlamat("Bangli");
                person.setName("Wahyu");
                person.setNoTelp("08122520788");

                Intent intent1=new Intent(MainActivity.this,Main3Activity.class);
                intent1.putExtra(Main3Activity.EXTRA_NAME,person);
                startActivity(intent1);


        }
    }
}
