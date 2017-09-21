package br.usjt.arqdesis.appcondominio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText usuario;
    private EditText senha;
    private Button btLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usuario = (EditText)findViewById(R.id.etLogin);
        senha = (EditText)findViewById(R.id.etSenha);
        btLogin = (Button)findViewById(R.id.bntLogin);

        btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                realizarLogin(usuario.getText().toString(), senha.getText().toString());
            }
        });
    }


    public void realizarLogin(String usuario, String senha){
        if(usuario.equals("sindico") && senha.equals("123")){
            Intent intent = new Intent( MainActivity.this, SindicoLogin.class);
            startActivity(intent);
        }
        else if(usuario.equals("atendente") && senha.equals("123")){
            Intent intent = new Intent( MainActivity.this, SindicoLogin.class);
            startActivity(intent);
        }
        else if(usuario.equals("funcionario") && senha.equals("123")){
            Intent intent = new Intent( MainActivity.this, FuncionarioLogin.class);
            startActivity(intent);
        }
    }

}
