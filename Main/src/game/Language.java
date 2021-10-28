package game;

import java.util.Scanner;

public class Language {

    Main game = new Main();
    static Scanner sc = new Scanner(System.in);

    public static void Intro(Player player1, Player player2) {
        System.out.println("Welcome " + player1 + " and " + player2 + " to Matador!");

    }

    public static void Player1InsertName() {
        System.out.println("Please enter your name Player 1: ");

    }
    public static void Player2InsertName() {
        System.out.println("Please enter your name Player 2: ");
    }

    public static void Player1Roll(Player player1) {
        System.out.println("\n"+player1.PlayerName+", press 1 on the keyboard if you want to roll");

    }
    public static void Player2Roll(Player player2) {
        System.out.println("\n"+player2.PlayerName+", press 2 on the keyboard if you want to roll");

    }

    public static void Player1Rolled(Player player1, Cup cup1){
        System.out.println(player1 + " rolled " + cup1.sum());

    }

    public static void Player2Rolled(Player player2, Cup cup2){
        System.out.println(player2 + " rolled " + cup2.sum());

    }

    public static void Arrived(String name, String description, int outcome, Bank bank){

        System.out.println("You landed on: "+name);
        System.out.println(description);
        System.out.println("The effect on your bank-account: "+ outcome);
        System.out.println("Your bank balance is now: " + bank.amount);
    }

    public static void PlayerWon(Player player) {
        System.out.println(player.PlayerName+" WON!");

    }

}