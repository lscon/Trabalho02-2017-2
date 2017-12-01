package br.edu.iff.pooa20172.trabalho02_2017_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ActivityPrincipal extends AppCompatActivity {

    private static final int REQUEST_CODE_INFO = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        ListView lista = (ListView) findViewById(R.id.lvEventos);

        final ArrayList<Evento> eventos = adicionarEventos();

        ArrayAdapter adapter = new EventoAdapter(this, eventos);

        lista.setAdapter(adapter);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView,
                                    View view, int i, long l) {
                Toast.makeText(getBaseContext(), "Item clicado",
                        Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(ActivityPrincipal.this,ActivityInformacao.class);
                intent.putExtra("nome", eventos.get(i).getNome());
                intent.putExtra("data", eventos.get(i).getData());
                intent.putExtra("local", eventos.get(i).getLocal());
                intent.putExtra("capacidade", eventos.get(i).getCapacidade());
                intent.putExtra("promotor", eventos.get(i).getPromotor());
                intent.putExtra("patrocinio", eventos.get(i).getPatrocinio());
                intent.putExtra("valorIngresso", eventos.get(i).getValorIngresso());
                startActivityForResult(intent, REQUEST_CODE_INFO);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent dados) {
        if (resultCode == RESULT_OK &&
                requestCode == REQUEST_CODE_INFO) {
            if (dados.hasExtra(" nome")) {

            }
        }
    }

    private ArrayList<Evento> adicionarEventos() {
        ArrayList<Evento> eventos = new ArrayList<Evento>();

        Evento e = new Evento("Tributo a Offspring, Peal Jam e Red Hot",
                "Sab, 2 de dezembro as 23:00", "Correria Music Bar",
                "100 Pessoas","test","test",0.0);
        eventos.add(e);

        e = new Evento("Vai da PT the Fest",
                "Sab, 2 de dezembro as 22:00", "R. Franklin de Campos Sobral, 1675","test","test","test",60.50);
        eventos.add(e);

        return eventos;
    }
}
