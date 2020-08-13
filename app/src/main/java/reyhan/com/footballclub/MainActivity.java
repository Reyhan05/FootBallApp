package reyhan.com.footballclub;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnpersib, btnpersija, btnpersela, btnpsm, btnbhayangkara, btnpersebaya, btnpersipura;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnpersib = findViewById(R.id.btn_persib);
        btnpersija = findViewById(R.id.btn_persija);
        btnpersela = findViewById(R.id.btn_persela);
        btnpsm = findViewById(R.id.btn_psm);
        btnbhayangkara = findViewById(R.id.btn_bhayangkara);
        btnpersebaya = findViewById(R.id.btn_persebaya);
        btnpersipura = findViewById(R.id.btn_persipura);

        btnpersib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, persibActivity.class));
            }

        });


        btnpersija.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, persijaActivity.class));
            }
        });
        btnpersela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, perselaActivity.class));
            }
        });
        btnpsm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, psmActivity.class));
            }
        });
        btnbhayangkara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, bhayangkara2Activity.class));
            }
        });
        btnpersebaya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, persebayaActivity.class));
            }
        });
        btnpersipura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, persipuraActivity.class));
            }
        });

    }
}
