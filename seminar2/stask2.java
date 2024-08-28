package seminar2;

import java.util.Scanner;

public class stask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int[] array = new int[number];
        for (int i = 0; i < number; i++) {
            array[i] = (int)(Math.random()*100);
            System.out.println(array[i]);
        }
        System.out.println();
        fastSort(array);
        for (int i = 0; i < number; i++) {
            System.out.println(array[i]); 
        }
    }
    public static void fastSort( int[] array){
        fastSort(array, 0, array.length-1);
    }

    private static void fastSort(int[] array, int left, int right){
        int i = left;
        int j = right;
        int pivot = array[(left + right) / 2];
        do {
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if(i <= j){
                if(i < j){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
                i++;
                j--;
            }
        } while (i <= j);
        if (left < j) {
            fastSort(array, left, j);
        }
        if (i <= right) {
            fastSort(array, i, right);
        }
    }
}
