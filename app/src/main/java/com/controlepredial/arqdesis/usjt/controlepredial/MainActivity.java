package com.controlepredial.arqdesis.usjt.controlepredial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    private EditText nome, senha;
    private Spinner spinner;
    private static final String[] conta = {"Funcionário", "Atendente", "Síndico"};
    public static final String CHAVE = "br.usjt.arqdesis.cliente.chave";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = (Spinner)findViewById(R.id.spinner);
        ArrayAdapter<String>adapter = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_spinner_item,paths);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

        nome = (EditText)findViewById(R.id.txt_log_nome);
        senha = (EditText)findViewById(R.id.txt_log_senha);
        senha = (EditText)findViewById(R.id.listitem_log_conta);
    }

    public void validarLogin(View view){
        Intent intent = new Intent(this, ListaClientesActivity.class);
        String nome = nome.getText().toString();
        String senha = senha.getText().toString();
        String chave = parent.getItemAtPosition(position).toString();
        intent.putExtra(CHAVE, chave);
        startActivity(intent);
    }

    // parent.getItemAtPosition(position).toString();

    public void onItemSelected(AdapterView<?> parent, View v, int position, long id) {

        switch (position) {
            case 0:
                // Whatever you want to happen when the first item gets selected
                break;
            case 1:
                // Whatever you want to happen when the second item gets selected
                break;
            case 2:
                // Whatever you want to happen when the thrid item gets selected
                break;

        }
    }
}
