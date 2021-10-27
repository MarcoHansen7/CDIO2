package game;

import java.util.Scanner;

public class Language {

    Main game = new Main();
    static Scanner sc = new Scanner(System.in);

    public static void Intro(Player p1, Player p2) {
        System.out.println("Welcome " + p1 + " and " + p2);

    }

    public static void Player1InsertName() {
        System.out.println("Enter your name Player 1: ");

    }
    public static void Player2InsertName() {
        System.out.println("Enter your name Player 2: ");
    }

    public static void Player1Roll(Player p1) {
        System.out.println("\n"+p1.PlayerName+", press 1 to roll");

    }
    public static void Player2Roll(Player p2) {
        System.out.println("\n"+p2.PlayerName+", press 2 to roll");

    }

    public static void Player1Rolled(Player p1, Cup c1){
        System.out.println(p1 + " rolled " + c1.sum());

    }

    public static void Player2Rolled(Player p2, Cup c2){
        System.out.println(p2 + " rolled " + c2.sum());

    }

    public static void Arrived(String name, String description, int outcome, Bank bank){

        System.out.println("You landed on: "+name);
        System.out.println(description);
        System.out.println("Effect on bank: "+ outcome);
        System.out.println("Your bank balance is now: " + bank.amount);
    }

    public static void PlayerWon(Player p) {
        System.out.println(p.PlayerName+" WON!");

    }

}