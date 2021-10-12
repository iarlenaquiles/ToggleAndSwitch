package com.aquiles.toggleeswitch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private ToggleButton toggleSenha;
    private Switch switchSenha;
    private TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toggleSenha = findViewById(R.id.toggleSenha);
        switchSenha = findViewById(R.id.switchSenha);
        txtResultado = findViewById(R.id.txtResultado);

        adicionarListener();
    }

    public void adicionarListener() {
        switchSenha.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    txtResultado.setText("ligado");
                } else {
                    txtResultado.setText("desligado");
                }
            }
        });
    }

    public void enviar(View view) {
        if (toggleSenha.isChecked()) {
            txtResultado.setText("toggleSenha ligado");
        } else {
            txtResultado.setText("toggleSenha desligado");
        }
    }
}