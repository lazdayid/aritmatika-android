package com.lazday.menghitungluasjajargenjang;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtAlas, edtTinggi;
    Button btnHitung;
    TextView txtHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtAlas     = findViewById(R.id.edtAlas);
        edtTinggi   = findViewById(R.id.edtTinggi);
        btnHitung   = findViewById(R.id.btnHitung);
        txtHasil    = findViewById(R.id.txtHasil);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String alas     = edtAlas.getText().toString();
                String tinggi   = edtTinggi.getText().toString();

                if ( alas.equals("") || tinggi.equals("") ){
                    Toast.makeText(getApplicationContext(), "Isi data dengan benar",
                            Toast.LENGTH_SHORT).show();
                } else {
                    hitungLuasJajargenjang(
                            Integer.parseInt( alas ), Integer.parseInt( tinggi )
                    );
                }
            }
        });

    }

    private void hitungLuasJajargenjang(int alas, int tingggi){
        int hasil   = alas * tingggi; // luas = alas x tinggi

        Log.e("_logHasil", String.valueOf( hasil ));
        txtHasil.setText( String.valueOf( hasil ) );
    }
}
