package com.example.Tic_Tac_Toe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // count = 0 { Chance of X }
    // count = 1 { Chance of O }
    int count = 0;
    int movesLeft = 9;
    int[] grid = {2, 2, 2, 2, 2, 2, 2, 2, 2};
    // 2 in grid represents Empty box.
    // 0 in grid represents X is present.
    // 1 in grid represents 0 is present.

    public void New(View view){
        count = 0;
        movesLeft = 9;
        for(int i = 0;i < 9;i++){
            grid[i]=2;
        }
        TextView status = findViewById(R.id.status);
        status.setText("X's Turn-Tap to play");
        ((ImageView)findViewById(R.id.imageView2)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView3)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView4)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView5)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView6)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView7)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView8)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView9)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView10)).setImageResource(0);
    }

    public void GridClicked(View view){
        if(movesLeft == 0){
            return;
        }
        else {
            ImageView img = (ImageView) view;
            TextView status = (TextView) findViewById(R.id.status);
            int tappedPosition = Integer.parseInt(img.getTag().toString());
            if (grid[tappedPosition] == 0 || grid[tappedPosition] == 1) {

            } else {
                grid[tappedPosition] = count;
                movesLeft--;
                img.setTranslationY(-1000f);
                if (count == 0) {
                    img.setImageResource(R.drawable.x);
                    status.setText("0's Turn-Tap to play");
                    count = 1;
                } else {
                    img.setImageResource(R.drawable.o);
                    status.setText("X's Turn-Tap to play");
                    count = 0;
                }
                img.animate().translationYBy(1000f).setDuration(300);
            }

            //Conditions of Winning and Tie.
            if (grid[0] != 2 && grid[0] == grid[1] && grid[1] == grid[2]) {
                movesLeft = 0;
                if (grid[0] == 0) {
                    status.setText("X is the Winner");
                } else {
                    status.setText("O is the Winner");
                }
            } else if (grid[3] != 2 && grid[3] == grid[4] && grid[4] == grid[5]) {
                movesLeft = 0;
                if (grid[0] == 0) {
                    status.setText("X is the Winner");
                } else {
                    status.setText("O is the Winner");
                }
            } else if (grid[6] != 2 && grid[6] == grid[7] && grid[7] == grid[8]) {
                movesLeft = 0;
                if (grid[0] == 0) {
                    status.setText("X is the Winner");
                } else {
                    status.setText("O is the Winner");
                }
            } else if (grid[0] != 2 && grid[0] == grid[3] && grid[3] == grid[6]) {
                movesLeft = 0;
                if (grid[0] == 0) {
                    status.setText("X is the Winner");
                } else {
                    status.setText("O is the Winner");
                }
            } else if (grid[1] != 2 && grid[1] == grid[4] && grid[4] == grid[7]) {
                movesLeft = 0;
                if (grid[0] == 0) {
                    status.setText("X is the Winner");
                } else {
                    status.setText("O is the Winner");
                }
            } else if (grid[2] != 2 && grid[2] == grid[5] && grid[5] == grid[8]) {
                movesLeft = 0;
                if (grid[0] == 0) {
                    status.setText("X is the Winner");
                } else {
                    status.setText("O is the Winner");
                }
            } else if (grid[0] != 2 && grid[0] == grid[4] && grid[4] == grid[8]) {
                movesLeft = 0;
                if (grid[0] == 0) {
                    status.setText("X is the Winner");
                } else {
                    status.setText("O is the Winner");
                }
            } else if (grid[2] != 2 && grid[2] == grid[4] && grid[4] == grid[6]) {
                movesLeft = 0;
                if (grid[0] == 0) {
                    status.setText("X is the Winner");
                } else {
                    status.setText("O is the Winner");
                }
            } else if (movesLeft == 0) {
                status.setText("Game Draw");
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}