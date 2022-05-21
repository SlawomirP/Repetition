package three;

import java.util.Scanner;

public class Instr {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write your number, I will check does it even number...");

        int userNumber = scanner.nextInt();

        if (userNumber % 2 == 0) {
            System.out.println("Your number --> " + userNumber + ", is even.");
        } else {
            System.out.println(userNumber + " is not even number.");
        }

        // task 2

        System.out.println("-------------Bigger number ??-------------");

        System.out.println("Write first number...");
        int a = scanner.nextInt();
        System.out.println("Write second number...");
        int b = scanner.nextInt();

        System.out.println("Bigger is " + whichBigger(a,b));

        // task 3
        System.out.println("--------------------------");

        System.out.println("Write sign: +, -, *, /");

        char sign = scanner.next(). charAt(0);

        switch (sign){
            case '+': System.out.println("Addiction result: " + (a+b));
            break;
            case '-': System.out.println("Subtraction result: " + (a-b));
            break;
            case '*': System.out.println("Multiplication result: " + (a*b));
            break;
            case '/': System.out.println("Division result: " + (a/b));
            break;
        }

    }

    public static int whichBigger (int a, int b){
        if (a > b ) {
            return a;
        } else {
            return b;
        }
    }
}

