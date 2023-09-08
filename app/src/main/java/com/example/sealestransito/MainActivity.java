package com.example.sealestransito;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickTipoSeñalizacion(View view){

        try {



            Spinner tipoSeñalizacion = findViewById(R.id.tipoSeñalizacion);
            TextView listaSeñalizacion = findViewById(R.id.listaSeñalizacion);
            TextView seleccionado = findViewById(R.id.seleccionado);

            String[] arrayRegulacion = getResources().getStringArray(R.array.Regulacion);
            String[] arrayAdvertencia = getResources().getStringArray(R.array.Advertencia);
            String[] arrayPeligro = getResources().getStringArray(R.array.Peligro);
            String[] arrayInformacion = getResources().getStringArray(R.array.Informacion);

            String tipo = String.valueOf(tipoSeñalizacion.getSelectedItem());

            listaSeñalizacion.setText("");

            switch (tipo){
                case "Regulacion":

                    seleccionado.setText("As seleccionado " + tipo);

                    for (String regulacion : arrayRegulacion) {
                        listaSeñalizacion.append( regulacion + "\n");

                    }

                    break;

                case "Advertencia":
                    seleccionado.setText("As seleccionado " + tipo);

                    for (String advertencia : arrayAdvertencia) {
                        listaSeñalizacion.append( advertencia + "\n");
                    }

                    break;

                case "Peligro":
                    seleccionado.setText("As seleccionado " + tipo);

                    for (String peligro : arrayPeligro) {
                        listaSeñalizacion.append( peligro + "\n");
                    }

                    break;

                case "Informacion":
                    seleccionado.setText("As seleccionado " + tipo);

                    for (String informacion : arrayInformacion) {
                        listaSeñalizacion.append( informacion + "\n");
                    }

                    break;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}