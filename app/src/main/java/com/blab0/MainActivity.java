package com.blab0;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    TextView txtNombre,txtCi;
    CheckBox cbOpc1,cbOpc2,cbOpc3,cbOpc4,cbOpc5;

    String nombre="hola", ci="Hola2";
    Boolean pla1,pla2,pla3,pla4,pla5;
    int platos[];


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


        cbOpc1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){

                }else{

                }
            }
        });
    }
    public void cambioLayout(View view){
        nombre = txtNombre.getText().toString();
        ci = txtCi.getText().toString();

        Intent intent = new Intent(MainActivity.this, FacturaActivity.class);
        intent.putExtra("nom",nombre);
        intent.putExtra("ci",ci);
        intent.putExtra("plato1",platos);
        startActivity(intent);
    }
}