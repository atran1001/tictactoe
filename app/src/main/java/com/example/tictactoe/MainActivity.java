package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    TextView scoreP1;
    TextView scoreP2;

    Button button00;
    Button button01;
    Button button02;
    Button button10;
    Button button11;
    Button button12;
    Button button20;
    Button button21;
    Button button22;


    int p1 = 0, p2 = 0;
    int turn = 0;
    ArrayList<String> moves = new ArrayList(Arrays.asList(null, null, null, null, null, null, null, null, null));


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
        turn = 0;
    }

    public void button00OnClick(View view) {
        button00 = findViewById(R.id.button00);

        if (moves.get(0) == null) {
            if (turn % 2 == 0) {
                moves.set(0, "X");
            } else {
                moves.set(0, "O");
            }
            turn++;
        }
        try {
            setButtonSymbol(button00, moves.get(0));
        } catch (Exception e) {
            Toast.makeText(this, "setting null", Toast.LENGTH_SHORT).show();
        }


    }

    public void button01OnClick(View view) {
        button01 = findViewById(R.id.button01);
        if (moves.get(1) == null) {
            System.out.println(moves);
            if (turn % 2 == 0) {
                moves.set(1, "X");
            } else {
                moves.set(1, "O");
            }
            turn++;
        }
        try {
            setButtonSymbol(button01, moves.get(1));
        } catch (Exception e) {
            Toast.makeText(this, "setting null", Toast.LENGTH_SHORT).show();
        }

    }

    public void button02OnClick(View view) {
        button02 = findViewById(R.id.button02);
        if (moves.get(2) == null) {
            if (turn % 2 == 0) {
                moves.set(2, "X");
            } else {
                moves.set(2, "O");
            }
            turn++;
        }
        try {
            setButtonSymbol(button02, moves.get(2));
        } catch (Exception e) {
            Toast.makeText(this, "setting null", Toast.LENGTH_SHORT).show();
        }

    }

    public void button10OnClick(View view) {
        button10 = findViewById(R.id.button10);
        if (moves.get(3) == null) {
            if (turn % 2 == 0) {
                moves.set(3, "X");
            } else {
                moves.set(3, "O");
            }
            turn++;
        }
        try {
            setButtonSymbol(button10, moves.get(3));
        } catch (Exception e) {
            Toast.makeText(this, "setting null", Toast.LENGTH_SHORT).show();
        }
    }

    public void button11OnClick(View view) {
        button11 = findViewById(R.id.button11);
        if (moves.get(4) == null) {
            if (turn % 2 == 0) {
                moves.set(4, "X");
            } else {
                moves.set(4, "O");
            }
            turn++;
        }
        try {
            setButtonSymbol(button11, moves.get(4));
        } catch (Exception e) {
            Toast.makeText(this, "setting null", Toast.LENGTH_SHORT).show();
        }
    }

    public void button12OnClick(View view) {
        button12 = findViewById(R.id.button12);
        if (moves.get(5) == null) {
            if (turn % 2 == 0) {
                moves.set(5, "X");
            } else {
                moves.set(5, "O");
            }
            turn++;
        }
        try {
            setButtonSymbol(button12, moves.get(5));
        } catch (Exception e) {
            Toast.makeText(this, "setting null", Toast.LENGTH_SHORT).show();
        }
    }

    public void button22OnClick(View view) {
        button22 = findViewById(R.id.button22);
        if (moves.get(8) == null) {
            if (turn % 2 == 0) {
                moves.set(8, "X");
            } else {
                moves.set(8, "O");
            }
            turn++;
        }
        try {
            setButtonSymbol(button22, moves.get(8));
        } catch (Exception e) {
            Toast.makeText(this, "setting null", Toast.LENGTH_SHORT).show();
        }
    }

    public void button21OnClick(View view) {
        button21 = findViewById(R.id.button21);
        if (moves.get(7) == null) {
            if (turn % 2 == 0) {
                moves.set(7, "X");
            } else {
                moves.set(7, "O");
            }
            turn++;
        }
        try {
            setButtonSymbol(button21, moves.get(7));
        } catch (Exception e) {
            Toast.makeText(this, "setting null", Toast.LENGTH_SHORT).show();
        }
    }

    public void button20OnClick(View view) {
        button20 = findViewById(R.id.button20);
        if (moves.get(6) == null) {
            if (turn % 2 == 0) {
                moves.set(6, "X");
            } else {
                moves.set(6, "O");
            }
            turn++;
        }
        try {
            setButtonSymbol(button20, moves.get(6));
        } catch (Exception e) {
            Toast.makeText(this, "setting null", Toast.LENGTH_SHORT).show();
        }
    }
}