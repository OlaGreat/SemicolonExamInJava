package Exam;

import java.util.Scanner;

public class SecondHighestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers 0r -0 to quit");
        int userInput = input.nextInt();
        int highestNumber = userInput;
        int secondHighestNumber;
        System.out.println("Enter numbers 0r -0 to quit");
         userInput = input.nextInt();
        int secondNumber = userInput;
        if (highestNumber > secondNumber){
            secondHighestNumber = secondNumber;
        }
        else
            secondHighestNumber = highestNumber;
        while (userInput != -0){
            System.out.println("Enter another number or -0 to quit");
            userInput = input.nextInt();
             secondNumber = userInput;
            if (highestNumber > secondNumber){
                secondHighestNumber = secondNumber;
            }
        }
        System.out.println(secondHighestNumber);

    }
}
