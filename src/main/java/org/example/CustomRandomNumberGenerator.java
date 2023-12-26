package org.example;

import java.util.Scanner;

public class CustomRandomNumberGenerator {

    public static long generateRandomNumber(long min, long max, long seed) {

        long range = max - min + 1;
        seed = (seed * 32719 + 12889) % 2147483647; //  seed=(seed * a +c) mod m

        return min + (seed % range);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int option;
        do {
            System.out.print("Enter the minimum value: ");
            int min = scanner.nextInt();

            System.out.print("Enter the maximum value: ");
            int max = scanner.nextInt();


            if (min >= max) {
                System.out.println("Invalid input. The minimum value must be less than the maximum value.");
                System.out.print("\n");

            }



            else {

                long randomNumber = generateRandomNumber(min, max,System.currentTimeMillis());
                System.out.println("Random Number: " + randomNumber);
                System.out.println("----------------------------");
                System.out.print("\n");
            }
            System.out.println("To start or end the process\n 1 -- start \n 0 -- end");
            option = scanner.nextInt();
            System.out.print("\n");




        }while(option!=0 && option==1);

        System.out.println("Thank youuu...");
    }
}