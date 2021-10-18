package game;
import java.util.Scanner;

public class Dice {

        public int Dice(){
            int sidesMax, dice, sidesMin;
            sidesMin = 1;
            sidesMax = 6;
            Scanner sc = new Scanner(System.in);
            do {
                dice = (int) Math.floor(Math.random() * (sidesMax - sidesMin + 1) + sidesMin);
            }
            while(!isValid(sidesMax));
            return dice;
        }

        static boolean isValid(int sidesMax){
            if(sidesMax == 0 || sidesMax < 0){
                return false;
            }  else return true;
        }


    }


