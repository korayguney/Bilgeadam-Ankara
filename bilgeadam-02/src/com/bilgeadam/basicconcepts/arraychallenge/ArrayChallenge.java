package com.bilgeadam.basicconcepts.arraychallenge;

import java.util.Arrays;

public class ArrayChallenge {
    public static void main(String[] args) {
        int[] arr = {23, 33, 12, 43, 56, 32, 45, 67, 78, 90};
        int givenNumber  = 35;
        int[] newArr = findNumbersLessThan(arr, givenNumber);

        /*
        for (int i : newArr) {
            System.out.print(i + " ");
        }
         */

        System.out.println(Arrays.toString(newArr));
    }

    static int[] findNumbersLessThan(int[] intArray, int givenNumber) {
        int lenghtOfNewArray = 0;

        for (int i = 0; i < intArray.length; i++) {
            if(intArray[i] < givenNumber){
                lenghtOfNewArray++;
            }
        }

        int[] newArray = new int[lenghtOfNewArray];
        int indexOfNewArr = 0;

        for (int i = 0; i < intArray.length; i++) {
            if(intArray[i] < givenNumber){
                newArray[indexOfNewArr] = intArray[i];
                indexOfNewArr++;
            }
        }

       // System.out.println(newArray.length);
        return newArray;
    }

}
