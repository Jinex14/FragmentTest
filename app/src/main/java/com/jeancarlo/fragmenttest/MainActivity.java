package com.jeancarlo.fragmenttest;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements fragUno.OnFragmentInteractionListener,fragDos.OnFragmentInteractionListener{
    //Declara Boton
    Button btnFrag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Castear boton
        btnFrag= (Button) findViewById(R.id.btnCambio);
        //Accion del boton
        btnFrag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Accion
                Intent a=new Intent(getApplicationContext(),FragmentDinamico.class);
                startActivity(a);
            }
        });
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
