package Exam;

import java.util.ArrayList;
import java.util.Arrays;

public class Level2Question2 {
    public static void main(String[] args) {
        int[] list1 = {1, 3, 4, 5};
        int [] list2 = {2,6,7,8};
        System.out.println(Arrays.toString(ascendingOrder(list1, list2)));

    }

    public static int[] ascendingOrder(int[] numbers, int[] list1) {
        ArrayList<Integer> elementHOlder = new ArrayList<>();
        for (int element : numbers) {
            elementHOlder.add(element);
        }
        for (int element : list1){
            elementHOlder.add(element);
        }
        int [] newArray = new int [elementHOlder.size()];
        for (int index = 0; index < newArray.length; index++) {
            newArray [index] = elementHOlder.get(index);
        }
        return addElementInTheArray(newArray);
    }
    public static int [] addElementInTheArray(int [] numbers){
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        return numbers;
    }
}