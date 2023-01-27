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
import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    TextView scoreP1;
    TextView scoreP2;

    TextView playerTurn;

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

    int[] gameState = {2, 2, 2, 2, 2, 2, 2, 2, 2};

    // State meanings:
    //    0 - X
    //    1 - O
    //    2 - Null
    int[][] winPositions = {{0, 1, 2}, {3, 4, 5}, {6, 7, 8},
            {0, 3, 6}, {1, 4, 7}, {2, 5, 8},
            {0, 4, 8}, {2, 4, 6}};

    boolean gameActive = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scoreP1 = findViewById(R.id.playerOneScore);
        scoreP2 = findViewById(R.id.playerTwoScore);
        playerTurn = findViewById(R.id.playerTurn);
        button00 = findViewById(R.id.button00);
        button01 = findViewById(R.id.button01);
        button02 = findViewById(R.id.button02);
        button10 = findViewById(R.id.button10);
        button11 = findViewById(R.id.button11);
        button12 = findViewById(R.id.button12);
        button20 = findViewById(R.id.button20);
        button21 = findViewById(R.id.button21);
        button22 = findViewById(R.id.button22);
        playerTurn.setText("X's Turn");

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

    private void checkWin() {
        int flag = 0;
        if (turn % 2 ==0){
            playerTurn.setText("X's Turn");
        }
        else{
            playerTurn.setText("O's Turn");
        }
        // Check if any player has won
        if(turn<=9) {
            for (int[] winPosition : winPositions) {
                if (gameState[winPosition[0]] == gameState[winPosition[1]] &&
                        gameState[winPosition[1]] == gameState[winPosition[2]] &&
                        gameState[winPosition[0]] != 2) {
                    flag = 1;


                    // Somebody has won! - Find out who!
                    String winnerStr;

                    // game reset function be called

                    if (gameState[winPosition[0]] == 0) {
                        winnerStr = "X has won";
                        p1++;
                        setP1(p1);
                    } else {
                        winnerStr = "O has won";
                        p2++;
                        setP2(p2);
                    }
                    System.out.println(winnerStr);
                    resetGame();
                }

            }
            // set the status if the match draw
            if (turn == 9 && flag == 0) {
                System.out.println("draw");
                resetGame();
            }
        }
        else{
            resetGame();
        }
    }

    public void reset(View view) {
        gameActive=true;
        resetGame();
    }

    private void resetGame(){
        turn = 0;
        playerTurn.setText("X's turn");
        button00.setText("");
        button01.setText("");
        button02.setText("");
        button10.setText("");
        button11.setText("");
        button12.setText("");
        button20.setText("");
        button21.setText("");
        button22.setText("");
        moves = new ArrayList(Arrays.asList(null, null, null, null, null, null, null, null, null));
        Arrays.fill(gameState, 2);
    }

    public void button00OnClick(View view) {
        button00 = findViewById(R.id.button00);

        if (moves.get(0) == null) {
            if (turn % 2 == 0) {
                moves.set(0, "X");
                gameState[0] = 0;
            } else {
                gameState[0] = 1;
                moves.set(0, "O");
            }
            turn++;
            checkWin();
        }
        try {
            setButtonSymbol(button00, moves.get(0));
        } catch (Exception e) {
            Toast.makeText(this, "setting null", Toast.LENGTH_SHORT).show();
        }

        checkWin();

    }

    public void button01OnClick(View view) {
        button01 = findViewById(R.id.button01);
        if (moves.get(1) == null) {
            System.out.println(moves);
            if (turn % 2 == 0) {
                moves.set(1, "X");
                gameState[1] = 0;
            } else {
                gameState[1] = 1;
                moves.set(1, "O");
            }
            turn++;
            checkWin();
        }
        try {
            setButtonSymbol(button01, moves.get(1));
        } catch (Exception e) {
            Toast.makeText(this, "setting null", Toast.LENGTH_SHORT).show();
        }
        checkWin();
    }

    public void button02OnClick(View view) {
        button02 = findViewById(R.id.button02);
        if (moves.get(2) == null) {
            if (turn % 2 == 0) {
                moves.set(2, "X");
                gameState[2] = 0;
            } else {
                gameState[2] = 1;
                moves.set(2, "O");
            }
            turn++;
            checkWin();
        }
        try {
            setButtonSymbol(button02, moves.get(2));
        } catch (Exception e) {
            Toast.makeText(this, "setting null", Toast.LENGTH_SHORT).show();
        }
        checkWin();
        System.out.println(turn);
    }

    public void button10OnClick(View view) {
        button10 = findViewById(R.id.button10);
        if (moves.get(3) == null) {
            if (turn % 2 == 0) {
                moves.set(3, "X");
                gameState[3] = 0;
            } else {
                gameState[3] = 1;
                moves.set(3, "O");
            }
            turn++;
            checkWin();
        }
        try {
            setButtonSymbol(button10, moves.get(3));
        } catch (Exception e) {
            Toast.makeText(this, "setting null", Toast.LENGTH_SHORT).show();
        }
        checkWin();
    }

    public void button11OnClick(View view) {
        button11 = findViewById(R.id.button11);
        if (moves.get(4) == null) {
            if (turn % 2 == 0) {
                moves.set(4, "X");
                gameState[4] = 0;
            } else {
                gameState[4] = 1;
                moves.set(4, "O");
            }
            turn++;
            checkWin();
        }
        try {
            setButtonSymbol(button11, moves.get(4));
        } catch (Exception e) {
            Toast.makeText(this, "setting null", Toast.LENGTH_SHORT).show();
        }
        checkWin();
    }

    public void button12OnClick(View view) {
        button12 = findViewById(R.id.button12);
        if (moves.get(5) == null) {
            if (turn % 2 == 0) {
                moves.set(5, "X");
                gameState[5] = 0;
            } else {
                gameState[5] = 1;
                moves.set(5, "O");
            }
            turn++;
            checkWin();
        }
        try {
            setButtonSymbol(button12, moves.get(5));
        } catch (Exception e) {
            Toast.makeText(this, "setting null", Toast.LENGTH_SHORT).show();
        }
        checkWin();
    }

    public void button22OnClick(View view) {
        button22 = findViewById(R.id.button22);
        if (moves.get(8) == null) {
            if (turn % 2 == 0) {
                moves.set(8, "X");
                gameState[8] = 0;
            } else {
                gameState[8] = 1;
                moves.set(8, "O");
            }
            turn++;
            checkWin();
        }
        try {
            setButtonSymbol(button22, moves.get(8));
        } catch (Exception e) {
            Toast.makeText(this, "setting null", Toast.LENGTH_SHORT).show();
        }
        checkWin();
    }

    public void button21OnClick(View view) {
        button21 = findViewById(R.id.button21);
        if (moves.get(7) == null) {
            if (turn % 2 == 0) {
                moves.set(7, "X");
                gameState[7] = 0;
            } else {
                gameState[7] = 1;
                moves.set(7, "O");
            }
            turn++;
            checkWin();
        }
        try {
            setButtonSymbol(button21, moves.get(7));
        } catch (Exception e) {
            Toast.makeText(this, "setting null", Toast.LENGTH_SHORT).show();
        }
        checkWin();
    }

    public void button20OnClick(View view) {
        button20 = findViewById(R.id.button20);
        if (moves.get(6) == null) {
            if (turn % 2 == 0) {
                moves.set(6, "X");
                gameState[6] = 0;
            } else {
                gameState[6] = 1;
                moves.set(6, "O");
            }
            turn++;
            checkWin();
        }
        try {
            setButtonSymbol(button20, moves.get(6));
        } catch (Exception e) {
            Toast.makeText(this, "setting null", Toast.LENGTH_SHORT).show();
        }
        checkWin();
    }

}