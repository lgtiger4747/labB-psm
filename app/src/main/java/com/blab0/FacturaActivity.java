package com.blab0;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class FacturaActivity extends AppCompatActivity {
    TextView txtNom,txtCi,txtCons;
    Boolean pl1,pl2,pl3,pl4,pl5;
    String nom1="",ci1="";
    int Opc[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factura);

        txtNom = (TextView)findViewById(R.id.textView3);
        txtCi = (TextView)findViewById(R.id.textView4);
        txtCons = (TextView)findViewById(R.id.tv_plato2);


        Intent intent = getIntent();
        nom1 = intent.getStringExtra("nom");
        ci1= intent.getStringExtra("ci");
        Opc = intent.getIntArrayExtra("plato1");

        txtNom.setText(nom1);
        txtCi.setText(ci1);

        txtCons.setText(""+Opc[0]);
    }
}