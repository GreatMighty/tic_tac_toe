package com.example.tic_tac_toe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GameDisplay extends AppCompatActivity {
    private TicTacToeBoard ticTacToeBoard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_display);
        Button playAgainBTN = findViewById(R.id.playAgain);
        Button hameBTN = findViewById(R.id.home);
        TextView playerTurn = findViewById(R.id.player_Turn);
        String[] playerNames = getIntent().getStringArrayExtra("PLAYER NAMES");

        playAgainBTN.setVisibility(View.GONE);
        hameBTN.setVisibility(View.GONE);

        if (playerNames != null){
            playerTurn.setText((playerNames[0] + " твой ход"));
        }

        ticTacToeBoard = findViewById(R.id.ticTacToeBoard2);

        ticTacToeBoard.setUpGame(playAgainBTN, hameBTN, playerTurn, playerNames);
    }
    public void homeButtonClick (View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void playAnainButtonClick (View view){
        ticTacToeBoard.resetGame();
        ticTacToeBoard.invalidate();
    }
}