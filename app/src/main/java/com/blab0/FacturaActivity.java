package com.blab0;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class FacturaActivity extends AppCompatActivity {
    TextView txtNom,txtCi,txtCons,txtTipoPago;
    String nom1="",ci1="",tipoPago="";
    String[] plato = new String[10];
    int[] precio = new int[10];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factura);

        txtNom = (TextView)findViewById(R.id.textView3);
        txtCi = (TextView)findViewById(R.id.textView4);
        txtCons = (TextView)findViewById(R.id.tv_plato2);
        txtTipoPago = (TextView)findViewById(R.id.textView14);

        Intent intent = getIntent();
        nom1 = intent.getStringExtra("nom");
        ci1= intent.getStringExtra("ci");
        plato=intent.getStringArrayExtra("ListaPlatos");
        precio=intent.getIntArrayExtra("ListaPrecios");
        tipoPago=intent.getStringExtra("tipoPag");

        txtNom.setText(nom1);
        txtCi.setText(ci1);
        txtCons.setText(plato[0]+": "+precio[0]+" Bs.");
        txtTipoPago.setText(tipoPago);
        System.out.println(plato[0]);


    }
}