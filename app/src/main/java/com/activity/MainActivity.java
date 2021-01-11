package com.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity {

    private Button buttonEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonEnviar = findViewById(R.id.buttonEnviar);

        buttonEnviar.setOnClickListener(v -> {

            Intent intent = new Intent(getApplicationContext(), SegundaActivity.class);

            //instanciar o objeto
            Usuario usuario = new Usuario("Léo", "leo@gmail.com");


            //passar dados de uma activity para outra
            intent.putExtra("nome", "Léo");
            intent.putExtra("idade", 3);
            intent.putExtra("objeto", (Serializable) usuario);

            startActivity( intent );

        });

    }
}