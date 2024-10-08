package com.pluralsight;

public class Main {
    public static void main(String[] args){

        Dice dice = new Dice();

        int roll1, roll2;
        int twoCounter = 0, fourCounter = 0, sixCounter = 0, sevenCounter = 0;

        for (int i = 0; i <= 100; i++ ){
            roll1 = dice.roll();
            roll2 = dice.roll();

            System.out.printf("Roll %d: %d - %d Sum: %d%n", i + 1, roll1, roll2, roll1 + roll2);

            int sum = roll1 + roll2;

            if (sum == 2){
                twoCounter++;
            } else if (sum == 4){
                fourCounter++;
            } else if (sum == 6){
                sixCounter++;
            } else if (sum == 7){
                sevenCounter++;
            }
        }

        System.out.println("The number of times 2 was rolled: " + twoCounter);
        System.out.println("The number of times 4 was rolled: " + fourCounter);
        System.out.println("The number of times 6 was rolled: " + sixCounter);
        System.out.println("The number of times 7 was rolled: " + sevenCounter);


    }






}