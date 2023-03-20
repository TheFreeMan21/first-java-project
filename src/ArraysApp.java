public class ArraysApp {

    public static void main(String[] args) {

        int[] lotteryNumbers = new int[5];

        lotteryNumbers[0]=17;
        lotteryNumbers[1]=23;
        lotteryNumbers[2]=41;
        lotteryNumbers[3]=54;
        lotteryNumbers[4]=12;

        for(int loterryNumber:lotteryNumbers){

            System.out.println(loterryNumber);

        }

        int[][] weeklyLotteryNumbers = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
        };

        for (int i = 0; i < weeklyLotteryNumbers.length; i++) {
            for (int j = 0; j < weeklyLotteryNumbers[i].length; j++) {

                System.out.print(weeklyLotteryNumbers[i][j]+" ");

            }
            System.out.println();

        }

    }

}
