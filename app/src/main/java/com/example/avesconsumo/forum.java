package com.example.avesconsumo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class forum extends AppCompatActivity {

    private EditText etName, etLastName, etEmail, etPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forum);

        etName = findViewById(R.id.etName);
        etLastName = findViewById(R.id.etLastName);
        etEmail = findViewById(R.id.etEmail);
        etPhone = findViewById(R.id.etPhone);

        Button btnRegister = findViewById(R.id.btnRegister);
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Obtener los valores de los campos
                String name = etName.getText().toString();
                String lastName = etLastName.getText().toString();
                String email = etEmail.getText().toString();
                String phone = etPhone.getText().toString();

                // Aquí puedes hacer algo con los datos ingresados, como mostrarlos en la ventana de agradecimiento
                // Navegar a la ventana de agradecimiento
                Intent intent = new Intent(forum.this, end.class);
                // Pasar los datos a la actividad de agradecimiento
                intent.putExtra("name", name);
                intent.putExtra("lastName", lastName);
                intent.putExtra("email", email);
                intent.putExtra("phone", phone);
                startActivity(intent);
            }
        });
    }
}
