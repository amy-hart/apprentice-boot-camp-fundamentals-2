package bowling;

import java.util.ArrayList;
import java.util.List;

public class Game {

    public int score(int[] rolls) {

        int score = 0;

        for (int i = 0; i < rolls.length; i+=2) {

            // Handle strikes
            if(rolls[i] == 10){
                if(i == 10) {
                    score += 10;
                } else {
                    score += 10 + rolls[i+1] + rolls[i+2];
                    i -= 1;
                }

            }
            // Handle spares
            else if(rolls[i] + rolls[i+1] == 10) {
                score += rolls[i] + rolls[i+1] + rolls[i+2];
            }
            // Handle basic scores
            else {
                score += (rolls[i] + rolls[i+1]);
            }
        }

        return score;
    }

    public ArrayList<int[]> convertRollsToFrames(int[] rolls) {

        ArrayList<int[]> frames = new ArrayList<int[]>();

        for (int i = 0; i < rolls.length; i++) {
            if(rolls[i] == 10) {
                int[] frame = {rolls[i]};
                frames.add(frame);
            } else{

            }
        }

        return frames;
    }
}


/*
List<int[]> frames = new ArrayList<int[]>;

        // split rolls into frames
        for (int i = 0; i <= rolls.length; i++) {
            // if int is even
            if(i % 2 == 0) {
                frames.add(int[] = {i,i+1});
                // something append new int array with i, and i+1
            }
        }
* */


  /*
            int rollOneOfCurrentFrame = rolls[i];
            int rollTwoOfCurrentFrame = rolls[i+1];
            int rollOneOfNextFrame = rolls[i+2];
            */