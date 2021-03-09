package org.jonathany23.challenge.arrays;

import java.util.HashMap;

public class CharacterRepograming {

    public static int getMaxDeletions(String s){
        char[] directions = s.toCharArray();
        int row = 0;
        int col = 0;
        int targetRow = 0;
        int targetCol = 0;

        for (char direction : directions) {
            switch (direction){
                case 'U':
                    row--;
                    break;
                case 'D':
                    row++;
                    break;
                case 'L':
                    col--;
                    break;
                case 'R':
                    col++;
                    break;
            }
        }

        targetRow = row;
        targetCol = col;

        row = 0;
        col = 0;

        int count = 0;
        StringBuilder sb = new StringBuilder();
        String resultPath = null;
        for (char direction : directions) {
            switch (direction){
                case 'U':
                    if (targetRow < row){
                        row--;
                        sb.append("U");
                    }
                    break;
                case 'D':
                    if (targetRow > row){
                        row++;
                        sb.append("D");
                    }
                    break;
                case 'L':
                    if (targetCol < col){
                        col--;
                        sb.append("L");
                    }
                    break;
                case 'R':
                    if (targetCol > col){
                        col++;
                        sb.append("R");
                    }
                    break;
            }
        }

        resultPath = sb.toString();
        if (!s.equals(resultPath)){
            count= s.length() - resultPath.length();
        }

        return count;
    }
}
