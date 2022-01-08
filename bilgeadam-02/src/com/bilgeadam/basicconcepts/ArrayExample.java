package com.bilgeadam.basicconcepts;

public class ArrayExample {
    public static void main(String[] args) {

        int[] myIntArr = new int[5];
        int myIntArr2[] = new int[5];
        int[] myIntArr3 = {1, 2, 3, 4};
        int[] myIntArr4 = new int[]{1, 2, 3, 4};

        myIntArr[0] = 10;
        myIntArr[1] = 20;
        myIntArr[2] = 50;
        myIntArr[3] = 70;
        myIntArr[4] = 90;

        System.out.println("Lenght of myIntArr : " + myIntArr.length);

        // for (int i = 0; i < myIntArr.length; i++) {
        //     System.out.println((i + 1) + " : " + myIntArr[i]);
        // }

        // enhanced for & for-each
        for (int i : myIntArr) {
            System.out.println(i);
        }

        //  System.out.println(myIntArr[5]); --> ArrayIndexOutOfBoundsException

        int myarray[][] = new int[6][3];
        myarray[0][0] = 10;
        myarray[0][1] = 20;
        myarray[0][2] = 30;

        myarray[1][0] = 11;
        myarray[1][1] = 22;
        myarray[1][2] = 33;

        myarray[2][0] = 100;
        myarray[2][1] = 200;
        myarray[2][2] = 300;

        myarray[3][0] = 111;
        myarray[3][1] = 222;
        myarray[3][2] = 333;
        myarray[5][2] = 1;

        System.out.println(myarray[3][0]);


    }
}
