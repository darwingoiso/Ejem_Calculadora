package com.example.android.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText numero1,numero2;
Button btnsuma,btnresta,btnmultiplicacion,btndividir;
TextView resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numero1=(EditText) findViewById(R.id.editText);
        numero2=(EditText) findViewById(R.id.editText);
        btnsuma=(Button) findViewById(R.id.button);
        btnresta=(Button) findViewById(R.id.button2);
        btnmultiplicacion=(Button) findViewById(R.id.button3);
        btndividir=(Button) findViewById(R.id.button4);
        resultado=(TextView) findViewById(R.id.textView);

        btnsuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1=Integer.valueOf(numero1.getText().toString());
                int n2=Integer.valueOf(numero2.getText().toString());
                int rsp=n1+n2;
                resultado.setText(String.valueOf(rsp));
            }
        });
        btnresta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1=Integer.valueOf(numero1.getText().toString());
                int n2=Integer.valueOf(numero2.getText().toString());
                int rsp=n1-n2;
                resultado.setText(String.valueOf(rsp));
            }
        });

        btnmultiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1=Integer.valueOf(numero1.getText().toString());
                int n2=Integer.valueOf(numero2.getText().toString());
                int rsp=n1*n2;
                resultado.setText(String.valueOf(rsp));
            }
        });
        btndividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1=Integer.valueOf(numero1.getText().toString());
                int n2=Integer.valueOf(numero2.getText().toString());
                double rsp=n1/n2;
                resultado.setText(String.valueOf(rsp));
            }
        });



    }
}
