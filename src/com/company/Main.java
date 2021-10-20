package com.company;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        while (true) {
            int bankMoney = 9999;
            int secretRandNum1 = random.nextInt(11) + 1;
            int secretRandNum2 = random.nextInt(11) + 1;
            int combSecretRandNum1 = secretRandNum1 + secretRandNum2;

            int shownRandNum1 = random.nextInt(11) + 1;
            int shownRandNum2 = random.nextInt(11) + 1;
            int combinedRandNum1 = shownRandNum1 + shownRandNum2;
            System.out.println("You are currently on: " + combinedRandNum1);


            while (combinedRandNum1 < 22 && combSecretRandNum1 < 22) {
                System.out.println("Do you want to hit or stand ( h / s)?");
                String answer = input.next();
                if (answer.equals("h")) {
                    int shownRandNum3 = random.nextInt(11) + 1;
                    combinedRandNum1 += shownRandNum3;
                    System.out.println("You are currently on: " + combinedRandNum1);


                } else if (answer.equals("s")) break;


                int choice = random.nextInt(2);
                if (choice == 1) {
                    int secretRandNum3 = random.nextInt(11) + 1;
                    combSecretRandNum1 += secretRandNum3;
                }
            }
            //System.out.println(combSecretRandNum1);
            if (combSecretRandNum1 > 21) {
                System.out.println("User has won!");
            } else if (combinedRandNum1 > 21) {
                System.out.println("Computer has won!");
            } else if (combinedRandNum1 == combSecretRandNum1) {
                System.out.println("It's a draw");
            } else if (combinedRandNum1 > combSecretRandNum1) {
                System.out.println("User has won");
            } else if (combinedRandNum1 < combSecretRandNum1) {
                System.out.println("Computer has won");
            }
            System.out.println("The computer got: " + combSecretRandNum1);
            System.out.println("Do you want to play again? (y/n)");
            String trashVariableName = input.next();
            if (trashVariableName.equals("n")) break;


        }
    }
}