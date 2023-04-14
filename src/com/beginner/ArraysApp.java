package com.beginner;

import java.util.Random;

public class ArraysApp {

    public static void main(String[] args) {

        int[] lotteryNumbers = new int[5];

        Random randomNumberGenerator = new Random();

        lotteryNumbers[0]= randomNumberGenerator.nextInt(90)+1;
        lotteryNumbers[1]=randomNumberGenerator.nextInt(90)+1;
        lotteryNumbers[2]=randomNumberGenerator.nextInt(90)+1;
        lotteryNumbers[3]=randomNumberGenerator.nextInt(90)+1;
        lotteryNumbers[4]=randomNumberGenerator.nextInt(90)+1;

        for(int loterryNumber:lotteryNumbers){

            System.out.println(loterryNumber);

        }

        int[][] weeklyLotteryNumbers = {
                {randomNumberGenerator.nextInt(90)+1, randomNumberGenerator.nextInt(90)+1, randomNumberGenerator.nextInt(90)+1, randomNumberGenerator.nextInt(90)+1, randomNumberGenerator.nextInt(90)+1},
                {randomNumberGenerator.nextInt(90)+1, randomNumberGenerator.nextInt(90)+1, randomNumberGenerator.nextInt(90)+1, randomNumberGenerator.nextInt(90)+1, randomNumberGenerator.nextInt(90)+1},
                {randomNumberGenerator.nextInt(90)+1, randomNumberGenerator.nextInt(90)+1, randomNumberGenerator.nextInt(90)+1, randomNumberGenerator.nextInt(90)+1, randomNumberGenerator.nextInt(90)+1},
                {randomNumberGenerator.nextInt(90)+1, randomNumberGenerator.nextInt(90)+1, randomNumberGenerator.nextInt(90)+1, randomNumberGenerator.nextInt(90)+1, randomNumberGenerator.nextInt(90)+1},
        };

        for (int i = 0; i < weeklyLotteryNumbers.length; i++) {
            for (int j = 0; j < weeklyLotteryNumbers[i].length; j++) {

                System.out.print(weeklyLotteryNumbers[i][j]+" ");

            }
            System.out.println();

        }

    }

}
