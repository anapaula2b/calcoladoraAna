package com.example.calculadoraana;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText numero1;
    private EditText numero2;
    private TextView resultado;
    private Button button;
    private Button buttonSub;
    private Button buttonMult;
    private Button buttonDiv;

    private float resultadoSoma;
    private float resultadoSubtracao;
    private float resultadoMult;
    private float resultadoDiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numero1 = findViewById(R.id.num1);
        numero2 = findViewById(R.id.num2);
        resultado = findViewById(R.id.resultado);
        button = findViewById(R.id.somar);
        buttonSub = findViewById(R.id.subtrair);
        buttonDiv = findViewById(R.id.dividir);
        buttonMult = findViewById(R.id.multiplicar);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float number1 = 0;
                float number2 = 0;

                number1 = Float.valueOf(String.valueOf(numero1.getText()));
                number2 = Float.valueOf(String.valueOf(numero2.getText()));

                somar(number1, number2);
            }
        });
        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float number1 = 0;
                float number2 = 0;

                number1 = Float.valueOf(String.valueOf(numero1.getText()));
                number2 = Float.valueOf(String.valueOf(numero2.getText()));

                subtrair(number1, number2);
            }
        });

        buttonMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float number1 = 0;
                float number2 = 0;

                number1 = Float.valueOf(String.valueOf(numero1.getText()));
                number2 = Float.valueOf(String.valueOf(numero2.getText()));

                multiplicar(number1, number2);
            }
        });
        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float number1 = 0;
                float number2 = 0;

                number1 = Float.valueOf(String.valueOf(numero1.getText()));
                number2 = Float.valueOf(String.valueOf(numero2.getText()));

                dividir(number1, number2);
            }
        });

    }

    public void somar(float number1, float number2) {
        this.resultadoSoma = number1 + number2;

        String resultadoString = String.valueOf(this.resultadoSoma);

        resultado.setText(resultadoString);
    }

    public void multiplicar(float number1, float number2) {
        this.resultadoMult = number1 * number2;

        String resultadoString = String.valueOf(this.resultadoMult);

        resultado.setText(resultadoString);
    }

    public void dividir(float number1, float number2) {
        this.resultadoDiv = number1 - number2;

        String resultadoString = String.valueOf(this.resultadoDiv);

        resultado.setText(resultadoString);
    }
    public void subtrair(float number1, float number2) {
        this.resultadoSubtracao = number1 / number2;

        String resultadoString = String.valueOf(this.resultadoSubtracao);

        resultado.setText(resultadoString);
    }
}