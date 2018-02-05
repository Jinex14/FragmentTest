package com.jeancarlo.fragmenttest;

import android.net.Uri;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FragmentDinamico extends AppCompatActivity implements fragAzul.OnFragmentInteractionListener,fragRojo.OnFragmentInteractionListener,FragVerde.OnFragmentInteractionListener{

    //Referencias a los fragments
    FragVerde fVerde;
    fragAzul fAzul;
    fragRojo fRojo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_dinamico);

        //Inicio
        fVerde=new FragVerde();
        fAzul=new fragAzul();
        fRojo=new fragRojo();
        //Manejo de transaccion de fragment
        getSupportFragmentManager().beginTransaction().add(R.id.contendor,fRojo).commit();
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    public void onClick(View view){
        FragmentTransaction trans=getSupportFragmentManager().beginTransaction();
        //ver que boton es
        switch (view.getId()){
            case R.id.btnRojo:
                //Remplazar
                trans.replace(R.id.contendor,fRojo);
                //ejecutar Metodo
                fRojo.texto("remplazo");
                break;
            case R.id.btnAzul:
                //Remplazar
                trans.replace(R.id.contendor,fAzul);
                break;
            case R.id.btnVerde:
                //Remplazar
                trans.replace(R.id.contendor,fVerde);
                break;
        }
        trans.commit();
    }
}
