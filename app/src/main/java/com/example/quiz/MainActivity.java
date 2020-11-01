package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void mostrarresultado(View v){

        CheckBox resposta1= (CheckBox) findViewById(R.id.respostaB1);
        boolean check1=resposta1.isChecked();

        CheckBox resposta2= (CheckBox) findViewById(R.id.respostaA2);
        boolean check2=resposta2.isChecked();

        CheckBox resposta3= (CheckBox) findViewById(R.id.respostaC3);
        boolean check3=resposta3.isChecked();

        CheckBox resposta4= (CheckBox) findViewById(R.id.respostaC4);
        boolean check4=resposta4.isChecked();

        CheckBox resposta5= (CheckBox) findViewById(R.id.respostaD5);
        boolean check5=resposta5.isChecked();

        CheckBox resposta6= (CheckBox) findViewById(R.id.respostaC6);
        boolean check6=resposta6.isChecked();

        CheckBox resposta7= (CheckBox) findViewById(R.id.respostaB7);
        boolean check7=resposta7.isChecked();


        int resultado=calcular(check1,check2,check3,check4,check5,check6,check7);
        //Log.v("MainActivity", "quantas respostas" + resultado);
        String msgfinal=mensagem(resultado);

        criartoast(msgfinal);

    }

    public int calcular (boolean respost1, boolean resposta2,boolean resposta3,boolean resposta4,boolean resposta5,boolean resposta6,boolean resposta7){
        int escolhacorreta=0;
        if(respost1){
            escolhacorreta += 1;
        }
        if(resposta2){
            escolhacorreta += 1;

        }
       if(resposta3){
            escolhacorreta += 1;

        }
        if(resposta4){
            escolhacorreta += 1;

        }
        if(resposta5){
            escolhacorreta += 1;

        }
        if(resposta6){
            escolhacorreta += 1;

        }
        if(resposta7){
            escolhacorreta += 1;

        }


        return  escolhacorreta;
    }

    public String mensagem(int resultadofinal){

        String resumo;
        if(resultadofinal==0){
            resumo="Nenhuma resposta certa \n";
            resumo+="Respostas: 1-B, 2-A, 3-C, 4-C, 5-D, 6-C, 7-B \n";
        } else if(resultadofinal==1) {
            resumo=resultadofinal + " resposta certa \n";
            resumo+="Respostas: 1-B, 2-A, 3-C, 4-C, 5-D, 6-C, 7-B \n";
        }else{
            resumo="Parabens! Tiveste" +  resultadofinal + " respostas certas\n";
        resumo+="Respostas corretas: 1-B, 2-A, 3-C, 4-C, 5-D, 6-C, 7-B \n";}
        return resumo;

    }


    public void criartoast (String msg){
        TextView orderSummaryTextView = (TextView) findViewById(R.id.test);
        orderSummaryTextView.setText(msg);


    }

}