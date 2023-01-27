package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView scoreP1;
    TextView scoreP2;

    Button  button00;
    Button  button01;
    Button  button02;
    Button  button10;
    Button  button11;
    Button  button12;
    Button  button20;
    Button  button21;
    Button  button22;


    int p1 = 0, p2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scoreP1 = findViewById(R.id.playerOneScore);
        scoreP2 = findViewById(R.id.playerTwoScore);
    }

    public void setButtonSymbol(Button button, String string) {
        button.setText(string);
    }

    public void setP1(int p1) {
        scoreP1.setText(String.valueOf(p1));
    }

    public void setP2(int p2) {
        scoreP2.setText(String.valueOf(p2));
    }


    public void reset(View view) {
        p1 = 0;
        setP1(p1);
        p2 = 0;
        setP2(p2);
//        setButtonSymbol(button00,"");
//        setButtonSymbol(button01,"");
//        setButtonSymbol(button02,"");
//        setButtonSymbol(button10,"");
//        setButtonSymbol(button11,"");
//        setButtonSymbol(button12,"");
//        setButtonSymbol(button20,"");
//        setButtonSymbol(button21,"");
//        setButtonSymbol(button22,"");
    }

    public void button00OnClick(View view) {
        button00 = findViewById(R.id.button00);
        setButtonSymbol(button00,"X");

    }

    public void button01OnClick(View view) {
        button01 = findViewById(R.id.button01);
        setButtonSymbol(button01,"X");
    }

    public void button02OnClick(View view) {
        button02 = findViewById(R.id.button02);
        setButtonSymbol(button02,"X");
    }

    public void button10OnClick(View view) {
        button10 = findViewById(R.id.button10);
        setButtonSymbol(button10,"X");
    }

    public void button11OnClick(View view) {
        button11 = findViewById(R.id.button11);
        setButtonSymbol(button11,"X");
    }

    public void button12OnClick(View view) {
        button12 = findViewById(R.id.button12);
        setButtonSymbol(button12,"X");
    }

    public void button22OnClick(View view) {
        button22 = findViewById(R.id.button22);
        setButtonSymbol(button22,"X");
    }

    public void button21OnClick(View view) {
        button21 = findViewById(R.id.button21);
        setButtonSymbol(button21,"X");
    }

    public void button20OnClick(View view) {
        button20 = findViewById(R.id.button20);
        setButtonSymbol(button20,"X");
    }
}