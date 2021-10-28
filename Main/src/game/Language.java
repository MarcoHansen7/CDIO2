package game;

import java.util.Scanner;

public class Language {

    static Scanner sc = new Scanner(System.in);
    public static final String TEXT_RED = "\u001B[31m";
    public static final String TEXT_RESET = "\u001B[0m";
    public static final String TEXT_CYAN = "\u001B[36m";

    public static void Intro(Player player1, Player player2) {
        System.out.println("Welcome " + player1 + " and " + player2 + " to Matador!");
        System.out.println("The first player to get 3000, wins. Good luck!");

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
        // Using the constructor from properties class to add the outcome of the dice throw with the system.out.println

        System.out.println("You landed on: "+name);
        System.out.println(description);
        System.out.println("The effect on your bank-account: "+ outcome);
        if (bank.amount < 0) {
            bank.amount = 0;
            System.out.println("\n"+TEXT_RED +"Your bank balance is now: " + bank.amount+ TEXT_RESET);
        }
        else {
            System.out.println("\n" + TEXT_RED + "Your bank balance is now: " + bank.amount + TEXT_RESET);
        }
    }

    public static void PlayerWon(Player player) {
        System.out.println("\n"+player.PlayerName+TEXT_CYAN+" WON!"+TEXT_RESET);
    }

}