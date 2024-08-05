package seminar1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class dztask1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chiclo = scanner.nextInt();
        ArrayList list = Number(chiclo);
        System.out.println(list);
        System.out.println(delNumber(list));

    }
    public static ArrayList<Integer> Number(int number){
        ArrayList list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < number; i++) {
            list.add(random.nextInt(1000000));
        }
        return list;
    }
    public static ArrayList<Integer> delNumber(ArrayList<Integer> list){
        ArrayList list2 = new ArrayList<>();
        for (Integer object : list) {
            int count = 0;
            for(int i = 2; i < object; i++){
                if(object % i == 0){
                    count++;
                }
            }
            list2.add(count);
        }
        return list2;
    }
}
