package com.codersbay;

import java.util.Random;


public class Main {

    public static void sortArray(int[] array) {

        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }

    public static void checkDuplicate(int[] firstArray, int[] secondArray, int[] thirdArray, int[] fourthArray, int[] fifthArray) {

        Random random = new Random();

        for (int i = 0; i < firstArray.length; i++) {
            for (int j = 0; j < firstArray.length; j++) {
                for (int k = 0; k < firstArray.length; k++) {

                    if ((firstArray[i] == firstArray[j]) && (i != j)) {
                        firstArray[j] = 1 + random.nextInt(15);
                        if ((firstArray[j] == firstArray[k]) && (j != k)) {
                            firstArray[k] = 1 + random.nextInt(15);
                        }
                    }
                }
            }
        }


        for (int i = 0; i < secondArray.length; i++) {
            for (int j = 0; j < secondArray.length; j++) {
                for (int k = 0; k < secondArray.length; k++) {

                    if ((secondArray[i] == secondArray[j]) && (i != j)) {
                        secondArray[j] = 15 + random.nextInt(15);
                        if ((secondArray[j] == secondArray[k]) && (j != k)) {
                            secondArray[k] = 15 + random.nextInt(15);
                        }
                    }
                }
            }
        }

        for (int i = 0; i < thirdArray.length; i++) {
            for (int j = 0; j < thirdArray.length; j++) {
                for (int k = 0; k < thirdArray.length; k++) {

                    if ((thirdArray[i] == thirdArray[j]) && (i != j)) {
                        thirdArray[j] = 30 + random.nextInt(15);
                        if ((thirdArray[j] == thirdArray[k]) && (j != k)) {
                            thirdArray[k] = 30 + random.nextInt(15);
                        }
                    }
                }
            }
        }

        for (int i = 0; i < fourthArray.length; i++) {
            for (int j = 0; j < fourthArray.length; j++) {
                for (int k = 0; k < fourthArray.length; k++) {

                    if ((fourthArray[i] == fourthArray[j]) && (i != j)) {
                        fourthArray[j] = 45 + random.nextInt(15);
                        if ((fourthArray[j] == fourthArray[k]) && (j != k)) {
                            fourthArray[k] = 45 + random.nextInt(15);
                        }
                    }
                }
            }
        }

        for (int i = 0; i < fifthArray.length; i++) {
            for (int j = 0; j < fifthArray.length; j++) {
                for (int k = 0; k < fifthArray.length; k++) {

                    if ((fifthArray[i] == fifthArray[j]) && (i != j)) {
                        fifthArray[j] = 60 + random.nextInt(15);
                        if ((fifthArray[j] == fifthArray[k]) && (j != k)) {
                            fifthArray[k] = 60 + random.nextInt(15);

                        }
                    }
                }
            }
        }
    }


    public static void main(String[] args) {

        Random random = new Random();

        int[] bArray = new int[5];
        for (int i = 0; i < bArray.length; i++) {
            bArray[i] = 1 + random.nextInt(15);
        }
        int[] iArray = new int[5];
        for (int i = 0; i < iArray.length; i++) {
            iArray[i] = 15 + random.nextInt(15);
        }
        int[] nArray = new int[5];
        for (int i = 0; i < nArray.length; i++) {
            nArray[i] = 30 + random.nextInt(15);
        }
        int[] gArray = new int[5];
        for (int i = 0; i < gArray.length; i++) {
            gArray[i] = 45 + random.nextInt(15);
        }
        int[] oArray = new int[5];
        for (int i = 0; i < oArray.length; i++) {
            oArray[i] = 60 + random.nextInt(15);
        }

        checkDuplicate(bArray, iArray, nArray, gArray, oArray);

        sortArray(bArray);
        sortArray(iArray);
        sortArray(nArray);
        sortArray(gArray);
        sortArray(oArray);

        int[][] bingo = {bArray, iArray, nArray, gArray, oArray};

        System.out.println('B' + "\t" + 'I' + "\t" + 'N' + "\t" + 'G' + "\t" + 'O');

        for (int i = 0; i < bingo.length; i++) {
            for (int j = 0; j < bingo.length; j++) {
                bingo[2][2] = 0;
                System.out.print(bingo[j][i] + "\t");
            }
            System.out.println();
        }
    }
}
