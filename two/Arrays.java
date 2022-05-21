package two;

import java.util.Random;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Size of your array: ...");
        int arraySize = scanner.nextInt();

        int [] intArray = new int[arraySize];

        for(int i = 0; i < intArray.length; i++){
            System.out.println("Write your number");
            intArray[i] = scanner.nextInt();
//            System.out.println("Index:" + i + ", value:" + intArray[i]);
        }

        System.out.println("Your array:");
        for(int i = 0; i < intArray.length; i++){
            System.out.println("Index:" + i + ", value:" + intArray[i]);
        }

        // adding values in array
        System.out.println("------Addiction------");
        int addResult = 0;
        for(int i = 0; i < intArray.length; i++){
           addResult += intArray[i];
        }
        System.out.println("Result of adding values from array is " + addResult);

        // bigger array
        System.out.println("-----Next array-----");

        int [][] intArray2 = new int[][] {
                {1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15}
        };
        for(int i = 0; i < intArray2.length; i++){
            System.out.print("Row " + i);
            int res = 0;
            for(int j = 0; j < 5; j++){
//                System.out.print(", values " + intArray2[i][j] + " ");
                res += intArray2[i][j];
            }
            System.out.print(" result  " + res);
            System.out.println();
        }
//        System.out.println(intArray2[0][0]);
//        System.out.println(intArray2[1][2]);
//        System.out.println(intArray2[2][4]);



    }
}
