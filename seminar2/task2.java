package seminar2;

public class task2 {
    public static void main(String[] args) {
        int[] array = new int[]{4,2,6,1,3,8,7,10,5,9,0};
        directSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    public static void directSort(int[] array){
        for (int i = 0; i < array.length-1; i++) {
            int minPos = i;
            for(int j = i+1; j < array.length; j++){
                if (array[j] < array[minPos]) {
                    minPos = j;
                }
            }
            if(i != minPos){
                int temp = array[i];
                array[i] = array[minPos];
                array[minPos] = temp;
            }
        }
    }
}
