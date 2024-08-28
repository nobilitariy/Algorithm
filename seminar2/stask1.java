package seminar2;

import java.util.Date;
import java.util.Scanner;

public class stask1 {
    public static void main(String[] args) {
        int[] array = new int[2000000];
        int[] array2 = new int[2000000];
        for (int i = 0; i < 20000; i++) {
            array[i] = (int)(Math.random()*100);
            array2[i] = array[i];
        }
        System.out.println();
        Date start = new Date();
        BubbleSort(array);
        Date end = new Date();
        long time1 = end.getTime() - start.getTime();
        start = new Date();
        fastSort(array2);
        end = new Date();
        long time2 = end.getTime() - start.getTime();
        System.out.println(time1);
        System.out.println(time2);
    }
    public static void BubbleSort(int[] array){
        boolean vi;
        do {
            vi = false;
            for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i+1]) {
                int temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                    vi = true;

            }
        }
        } while (vi);
        
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
