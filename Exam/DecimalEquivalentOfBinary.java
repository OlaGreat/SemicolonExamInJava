package Exam;

import java.util.Scanner;

public class DecimalEquivalentOfBinary {
    public static void main(String[] args) {


    Scanner input = new Scanner(System.in);
        System.out.println("Enter a binary number");
    int binaryNumber = input.nextInt();
        System.out.println(binaryProcessor(binaryNumber));
}

    public static int binaryProcessor(int binaryNumber){
        int loopController = (int) (Math.log10(binaryNumber)+1);
        int number = 0;
        int placeValue = 1;
        int decimalNumberMultiplier= 1;
        for (int counter = 1; counter <= loopController; counter++) {
            if (counter == 1) {
                int modulusHolder = (binaryNumber / placeValue) % 10;
                number += modulusHolder * decimalNumberMultiplier;
                placeValue*=10;
                decimalNumberMultiplier*=2;
            } else if (counter > 1) {
                int modulusHolder = (binaryNumber / placeValue) % 10;
                number += modulusHolder * decimalNumberMultiplier;
                placeValue *= 10;
                decimalNumberMultiplier*=2;
            }
        }
        return number;
    }
}
