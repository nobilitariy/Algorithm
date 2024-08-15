package seminar1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class dztask1 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chiclo = scanner.nextInt();
        ArrayList<Integer> list = generateRandomNumbers(chiclo);
        System.out.println(list);
        System.out.println(countDivisors(list));
    }

    public static ArrayList<Integer> generateRandomNumbers(int number) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < number; i++) {
            list.add(random.nextInt(1000000) + 1); // избегаем 0
        }
        return list;
    }

    public static ArrayList<Integer> countDivisors(ArrayList<Integer> list) {
        ArrayList<Integer> divisorCounts = new ArrayList<>();
        for (Integer object : list) {
            int count = 0;
            for (int i = 1; i * i <= object; i++) { // начинаем с 1, чтобы включить все делители
                if (object % i == 0) {
                    count++;
                    if(i * i != object){
                        count++;
                    }
                }
            }
            divisorCounts.add(count);
        }
        return divisorCounts;
    }

}
