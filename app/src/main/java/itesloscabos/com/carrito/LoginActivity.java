package itesloscabos.com.carrito;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText correo,contrasena;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void recuperar(View vista){
        Intent rec = new Intent(LoginActivity.this,RecuperarActivity.class);
        startActivity(rec);
    }

    public void inicio(View vista){
        correo =(EditText)findViewById(R.id.correo);
        contrasena =(EditText)findViewById(R.id.contra);

        if(correo.getText().toString().trim().isEmpty() || contrasena.getText().toString().trim().isEmpty()){
            Toast.makeText(getApplicationContext(), "Llene los dos campos!", Toast.LENGTH_SHORT).show();

        }else if(correo.getText().toString().equals("ites") && contrasena.getText().toString().equals("ites"))
        {
            Intent principal = new Intent(LoginActivity.this,PrincipalActivity.class);
            startActivity(principal);

        }else
            {
                Toast.makeText(getApplicationContext(), "Correo o contraseña incorrectos!", Toast.LENGTH_SHORT).show();
                correo.setText("");
                contrasena.setText("");
            }
    }
}
