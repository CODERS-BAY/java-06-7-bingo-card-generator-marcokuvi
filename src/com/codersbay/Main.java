package com.codersbay;

import java.util.Random;


public class Main {

    //check if there is a duplicate in the array
    public static void checkDuplicate(int[] duplicateArray, int factor) {

        Random random = new Random();

        for (int i = 0; i < duplicateArray.length; i++) {
            for (int j = 0; j < duplicateArray.length; j++) {
                for (int k = 0; k < duplicateArray.length; k++) {

                    if ((duplicateArray[i] == duplicateArray[j]) && (i != j)) {
                        duplicateArray[j] = factor + random.nextInt(15);
                        if ((duplicateArray[j] == duplicateArray[k]) && (j != k)) {
                            duplicateArray[k] = factor + random.nextInt(15);
                        }
                    }
                }
            }
        }
    }

    //fill the array with random numbers
    public static void fillWithNumbers(int[] numbersArray, int factor) {

        Random random = new Random();

        for (int i = 0; i < numbersArray.length; i++) {
            numbersArray[i] = factor + random.nextInt(15);
        }
    }

    //create the bingo field
    public static void createBingo(int[][] field) {

        System.out.println('B' + "\t" + 'I' + "\t" + 'N' + "\t" + 'G' + "\t" + 'O');

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                field[2][2] = 0;
                System.out.print(field[j][i] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[] bArray = new int[5];
        int[] iArray = new int[5];
        int[] nArray = new int[5];
        int[] gArray = new int[5];
        int[] oArray = new int[5];

        fillWithNumbers(bArray, 1);
        fillWithNumbers(iArray, 15);
        fillWithNumbers(nArray, 30);
        fillWithNumbers(gArray, 45);
        fillWithNumbers(oArray, 60);

        checkDuplicate(bArray, 1);
        checkDuplicate(iArray, 15);
        checkDuplicate(nArray, 30);
        checkDuplicate(gArray, 45);
        checkDuplicate(oArray, 60);

        int[][] bingo = {bArray, iArray, nArray, gArray, oArray};

        createBingo(bingo);

    }
}
