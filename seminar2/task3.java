package seminar2;

public class task3 {
    public static void main(String[] args) {
        int[] array = new int[]{4,2,6,1,3,8,7,10,5,9,0};
        insterSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    
    public static void insterSort(int[] array){
        for (int i = 0; i < array.length - 1; i++) {
            for (int index = i +1; index < array.length; index++) {
                if (array[i] > array[index]) {
                    int temp = array[i];
                    array[i] = array[index];
                    array[index] = temp;
                }
            }
        }
    }
}
