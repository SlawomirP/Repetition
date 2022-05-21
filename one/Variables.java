package one;

import java.util.Scanner;

public class Variables {
    public static void main(String[] args){

        int randomNumb;

        Bmi edward = new Bmi("Edward", 35, 1.80f, 80);
        Bmi ann = new Bmi("Ann", 30, 1.55f, 60);

        System.out.println(ann.dane());
        System.out.println("BMI: " + (int)ann.bmi());

        /// task 2, random int, check %

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write random int number...");
        randomNumb = scanner.nextInt();
        System.out.println(randomNumb % 2);
        System.out.println(randomNumb % 3);
        System.out.println(randomNumb % 11);

    }
}
