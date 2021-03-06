package br.edu.iff.pooa20172.trabalho02_2017_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class ActivityInformacao extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacao);

        Intent intent = getIntent();

        String nome = (String) intent.getSerializableExtra("nome");
        String data = (String) intent.getSerializableExtra("data");
        String local = (String) intent.getSerializableExtra("local");
        String capacidade = (String) intent.getSerializableExtra("capacidade");
        String promotor = (String) intent.getSerializableExtra("promotor");
        String patrocinio = (String) intent.getSerializableExtra("patrocinio");
        double valorIngresso = (double) intent.getSerializableExtra("valorIngresso");

        EditText etNome = (EditText) findViewById(R.id.etNome);
        EditText etData = (EditText) findViewById(R.id.etData);
        EditText etLocal = (EditText) findViewById(R.id.etLocal);
        EditText etCapacidade = (EditText) findViewById(R.id.etCapacidade);
        EditText etPromotor = (EditText) findViewById(R.id.etPromotor);
        EditText etPatrocinnio = (EditText) findViewById(R.id.etPatrocinio);
        EditText etValorIngresso = (EditText) findViewById(R.id.etValorIngresso);


        etNome.setText(nome);
        etData.setText(data);
        etLocal.setText(local);
        etCapacidade.setText(capacidade);
        etPromotor.setText(promotor);
        etPatrocinnio.setText(patrocinio);
        etValorIngresso.setText(Double.toString(valorIngresso));
    }

    @Override
    public void finish() {

        Intent dados = new Intent();

        EditText etNome = (EditText) findViewById(R.id.etNome);
        EditText etData = (EditText) findViewById(R.id.etData);
        EditText etLocal = (EditText) findViewById(R.id.etLocal);
        /*
        EditText etCapacidade = (EditText) findViewById(R.id.etCapacidade);
        EditText etPromotor = (EditText) findViewById(R.id.etPromotor);
        EditText etPatrocinnio = (EditText) findViewById(R.id.etPatrocinio);
        EditText etValorIngresso = (EditText) findViewById(R.id.etValorIngresso);
        */

        dados.putExtra("nome", "teswt");
        dados.putExtra("data", etData.getText());
        dados.putExtra("local", etLocal.getText());
        /*
        intent.putExtra("capacidade", etCapacidade.getText());
        intent.putExtra("promotor", etPromotor.getText());
        intent.putExtra("patrocinio", etPatrocinnio.getText());
        intent.putExtra("valorIngresso", etValorIngresso.getText());
        */
        setResult(RESULT_OK, dados);
        super.finish();
    }
}
