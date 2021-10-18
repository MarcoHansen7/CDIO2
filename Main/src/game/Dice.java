package game;
import java.util.Scanner;

public class Dice {

        public static void main(String[] args) {
            int sidesMax, dice, sidesMin;
            sidesMin = 1;
            Scanner sc = new Scanner(System.in);
            do {
                System.out.println("Indtast antal sider på terning (OBS spillet fungerer kun optimalt med 6 sider): ");
                sidesMax = sc.nextInt();
                dice = (int) Math.floor(Math.random() * (sidesMax - sidesMin + 1) + sidesMin);

            }
            while(!isValid(sidesMax));
            System.out.println("Du slog " + dice); return dice;
        }

        static boolean isValid(int sidesMax){
            if(sidesMax == 0 || sidesMax < 0){
                System.out.println("Dette er ikke en reel værdi på en terning, tast en ny )" );
                return false;
            }  else return true;
        }


    }


