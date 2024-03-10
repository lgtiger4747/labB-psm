package com.blab0;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    TextView txtNombre,txtCi;
    CheckBox cbOpc1,cbOpc2,cbOpc3,cbOpc4,cbOpc5;
    RadioGroup rgPago;
    RadioButton rbContado,rbTargeta;
    String nombre="hola", ci="Hola2";
    String[] platos = new String[10];
    int[] precios = new int[10];

    private String tipoPago = "Tipo de Pago";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtNombre = (TextView)findViewById(R.id.edt_nombre);
        txtCi = (TextView)findViewById(R.id.edt_ci);

        cbOpc1 = (CheckBox) findViewById(R.id.ch_plato1);
        cbOpc2 = (CheckBox) findViewById(R.id.ch_plato2);
        cbOpc3 = (CheckBox) findViewById(R.id.ch_plato3);
        cbOpc4 = (CheckBox) findViewById(R.id.ch_refresco1);
        cbOpc5 = (CheckBox) findViewById(R.id.ch_refresco2);

        rgPago=(RadioGroup) findViewById(R.id.forma_pago);
        rbContado=(RadioButton) findViewById(R.id.rb_contado);
        rbTargeta=(RadioButton) findViewById(R.id.rb_tar);

        cbOpc1.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                platos[0]="pique macho";
                precios[0]=30;
            } else {
                platos[0]="no";
                precios[0]=0;
            }
        });

        //Ver estado del RadioGroup para ver el tipo de pago
        rgPago.setOnCheckedChangeListener((group, checkedId) -> {
            if (rbContado.isChecked()){
                tipoPago="contado";
            }else if (rbTargeta.isChecked()){
                tipoPago="targeta";
            }
        });

    }
    public void cambioLayout(View view){
        nombre = txtNombre.getText().toString();
        ci = txtCi.getText().toString();

        Intent intent = new Intent(MainActivity.this, FacturaActivity.class);
        intent.putExtra("nom",nombre);
        intent.putExtra("ci",ci);
        intent.putExtra("ListaPlatos", platos);
        intent.putExtra("ListaPrecios", precios);
        intent.putExtra("tipoPag", tipoPago);
        startActivity(intent);
    }
}