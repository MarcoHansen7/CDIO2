package game;
import java.util.Scanner;


public class Properties {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 0;
        int[] propertyList = {0, 250, -100, 100, -20, 180, 0, -70, 60, -80, -50, 650};
        int numbers;
        numbers = sc.nextInt();
        System.out.println(numbers);
        System.out.println(propertyList[numbers-1]);


        balance += propertyList [numbers-1];
        System.out.println(balance);

        numbers = sc.nextInt();
        System.out.println(numbers);

        balance += propertyList [numbers-1];
        System.out.println(balance);
    }
}