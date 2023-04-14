package Exam;

public class Level2Question3 {
    public static void main(String[] args) {
        int [] numbers = {1,2,3,4};


        for (int i = 0; i < numbers.length; i++) {
            for (int j =0; j < numbers.length; j++) {
                int ne = 1;
                if (i == j)continue;
                ne =ne * numbers[j];
            }
            //System.out.println(ne);

        }
    }
}
