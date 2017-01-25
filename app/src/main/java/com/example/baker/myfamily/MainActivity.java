package com.example.baker.myfamily;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnFather,btnMother,btnBrother,btnSister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /* nise sob button k type cast kora hoise*/
        btnFather= (Button) findViewById(R.id.father);
        btnMother= (Button) findViewById(R.id.mother);
        btnBrother=(Button) findViewById(R.id.brother);
        btnSister= (Button) findViewById(R.id.sister);

        btnFather.setOnClickListener(new View.OnClickListener() {
            @Override /*Override ta holo age onClick() function ta kora ase ,amra modify kore use korte parbo*/
            public void onClick(View v) {
                /* aikane onno activity r akta object create kora hoise
                * Intent constructor e 2 ta parameter ase , first er ta j activity theke onno activity call kora hobe oi activity,
                * 2nd ta j activity te jabe sei activity er name*/
                Intent intent=new Intent(MainActivity.this,FatherDetails.class);
               /*startActivity() dia activity ta start kora hoise*/
                startActivity(intent);
                /*Toast dia kissokon er jonno kiso leka show kora jai*/
                Toast.makeText(MainActivity.this, "Click Father Button", Toast.LENGTH_SHORT).show();
            }
        });
        btnMother.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,MotherDetails.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "Click Mother Button", Toast.LENGTH_SHORT).show();
            }
        });
        btnBrother.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,BrotherDetails.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "Click Brother Button", Toast.LENGTH_SHORT).show();
            }
        });
        btnSister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,SisterActivity.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "Click Sister Button", Toast.LENGTH_SHORT).show();
            }
        });
    }

}
