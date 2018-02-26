package com.example.desk.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> listaDatos;
    RecyclerView recycler1;
    String ar[]=new String[]{
            "ABREGO DELGADO ALEXIA ARIANA",
            "ARANDA PATRON NOMAR JAZIEL",
            "BAUTISTA MONSALVO JULIO CESAR",
            "CARDENAS RAMOS FRANCISCO EMANUEL",
            "CARO LOPEZ LUIS RICARDO",
            "ABREGO DELGADO ALEXIA ARIANA",
            "ARANDA PATRON NOMAR JAZIEL",
            "BAUTISTA MONSALVO JULIO CESAR",
            "CARDENAS RAMOS FRANCISCO EMANUEL",
            "CARO LOPEZ LUIS RICARDO",
            "CARVAJAL GUTIERREZ RAUL RAFAEL",
            "CORDERO VILLA OSCAR ALBERTO",
            "ESPINO SERRANO CESAR RAMSES",
            "ESPINOSA ABANDO DENISSE YANETH",
            "ESPINOZA ORONIA CARLOS EDUARDO",
            "GALLEGOS GODINEZ FRANCISCO JAVIER",
            "GIL LLANOS JUAN PEDRO",
            "GONZALEZ ARELLANO ERNESTO",
            "GONZALEZ CASTELLANOS EDGAR FABRIZIO",
            "GUTIERREZ ESPARZA BRAYAN JESUS",
            "GUTIÉRREZ ROJAS BRYAN",
            "HERNANDEZ SANDOVAL ABRIL YARELI",
            "JIMENEZ ORTIZ JUAN DANIEL",
            "LIZOLA CHAVARÍN LUIS FERNANDO",
            "LOZANO MORA EDGAR ERNESTO",
            "MARTINEZ BAÑUELOS ERIKA LIZBETH",
            "MENDEZ SANTANA KEVIN ALEJANDRO",
            "MONROY SALCEDO JOSE DE JESUS",
            "PARRA DOMINGUEZ DYLAN SALVADOR",
            "PEREZ ARAIZA FLOR MARIELA",
            "PUGA FLORES CARLOS",
            "REYES GUERRERO GUILLERMO GUADALUPE",
            "RODRIGUEZ ADAME OLIVER GIOVANNY",
            "SANCHEZ CARRILLO BETSY DEL CARMEN",
            "SILVA CAMACHO EDUARDO LUIS",
            "TORRES CUETO JESUS MANUEL",
            "VALDEZ CORREA CARLOS GERMAN",
            "VALDEZ LOPEZ HOLLIVER EDUARDO",
            "VALENZUELA MIRAMONTES JOSE PABLO",
            "VEGA LUNA CRISTOBAL ELIHU",
            "CARRILLO GONZÁLEZ CARLOS ARTURO",
            "IBARRA MARAVILLAS JONATHAN GUADALUPE",
            "OCAMPO AGUILAR JESUS ANDRÉS"
                };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recycler1 = (RecyclerView) findViewById(R.id.idRecycler);
        recycler1.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        listaDatos = new ArrayList<String>();

        for (int i = 0; i < ar.length; i++) {

            listaDatos.add(ar[i]);
        }
        Datos adapter=new Datos(listaDatos);
        recycler1.setAdapter(adapter);
    }
}
