package seminar1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class task2{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(prNum(number));
    }
    public static ArrayList<Integer> prNum(int number){
        ArrayList<Integer> list = new ArrayList<>();
        boolean k = true;
        for(int i = 2; i <= number; i++){
            k = true;
            for (int j = 2; j < i; j++) {
                if (i%j == 0) {
                    k = false;
                    break;
                }
            }
            if (k){
                list.add(i);
            }
        }
        return list;
    }
}