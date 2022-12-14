package com.example.tic_tac_toe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SetPlayer extends AppCompatActivity {

    private EditText player1;
    private EditText player2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_players);

        player1 = findViewById(R.id.editTextTextPersonName1);
        player2 = findViewById(R.id.editTextTextPersonName2);

    }
    public void submitButtonClick (View view){
        String player1Name = player1.getText().toString();
        String player2Name = player2.getText().toString();

        Intent intent = new Intent(this, GameDisplay.class);
        intent.putExtra("PLAYER NAMES", new String[] {player1Name, player2Name});
        startActivity(intent);
    }
}