package com.example.calculadoraana;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText numero1, numero2;
    private TextView resultado;
    private Button buttonSum, buttonSub, buttonMult, buttonDiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButtonCalcularOnClickListener botoesListener = new ButtonCalcularOnClickListener();
        this.numero1 = (EditText) findViewById(R.id.num1);
        this.numero2 = (EditText) findViewById(R.id.num2);
        
        this.resultado = (TextView) findViewById(R.id.resultado);
        
        this.buttonSum = (Button) findViewById(R.id.somar);
        this.buttonSub = (Button) findViewById(R.id.subtrair);
        this.buttonDiv = (Button) findViewById(R.id.dividir);
        this.buttonMult = (Button) findViewById(R.id.multiplicar);


        this.buttonSum.setOnClickListener(botoesListener);
        this.buttonSub.setOnClickListener(botoesListener);
        this.buttonDiv.setOnClickListener(botoesListener);
        this.buttonMult.setOnClickListener(botoesListener);
        
    }

    public void calcular(botaoId) {
        float resultado;
        float number1 = 0;
        float number2 = 0;

        number1 = Float.valueOf(String.valueOf(numero1.getText()));
        number2 = Float.valueOf(String.valueOf(numero2.getText()));

        switch(botaoId){
            case R.id.buttonSum:
                resultado = somar(number1, number2);
                break;
            case R.id.buttonSub:
                resultado = subtrair(number1. number2)
                break;
            case R.id.buttonMult:
                resultado = multiplicar(number1. number2)
                break;
            case R.id.buttonDiv:
                resultado = dividir(number1. number2)
                break;
        }

    }
    public void somar(float number1, float number2) {
        float Soma = number1 + number2;

        return Soma;
    }

    public void multiplicar(float number1, float number2) {
        float Mult = number1 * number2;

        return Mult;
    }

    public void dividir(float number1, float number2) {
        float Div = number1 - number2;

        return Div;
    }
    public void subtrair(float number1, float number2) {
        float Subtracao = number1 / number2;

        return Subtracao;
    }
    class ButtonCalcularOnClickListener implements View.OnClickListener{

        @Override
        public void onClick(View view) {

            calcular(view.getId());
        }
    }
}