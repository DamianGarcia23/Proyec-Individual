package com.example.avesconsumo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalculadorAves extends AppCompatActivity {

    private EditText weekEditText, numberOfBirdsEditText;
    private TextView resultTextView;
    private Button calculateButton, continueButton;

    private int[] foodConsumptionPerWeek = {
            // ... tu lista de consumo de alimento por semana ...
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        weekEditText = findViewById(R.id.weekEditText);
        numberOfBirdsEditText = findViewById(R.id.numberOfBirdsEditText);
        resultTextView = findViewById(R.id.resultTextView);
        calculateButton = findViewById(R.id.calculateButton);
        continueButton = findViewById(R.id.continueButton);

        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculateFoodConsumption();
            }
        });

        continueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CalculadorAves.this, end.class); // Cambia "end" a "EndActivity" si ese es el nombre correcto de tu actividad.
                startActivity(intent);
            }
        });
    }

    private void calculateFoodConsumption() {
        int week = Integer.parseInt(weekEditText.getText().toString());
        int numberOfBirds = Integer.parseInt(numberOfBirdsEditText.getText().toString());

        if (week >= 1 && week <= 30) {
            int foodPerWeek = foodConsumptionPerWeek[week - 1];
            int totalFoodConsumption = foodPerWeek * numberOfBirds;
            resultTextView.setText("Consumo total de alimento: " + totalFoodConsumption + " unidades");
        } else {
            resultTextView.setText("La semana ingresada está fuera del rango válido (1-30).");
        }
    }
}
