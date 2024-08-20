package seminar2;

public class task1 {

    public static void main(String[] args) {
        int[] array = new int[]{4,2,6,1,3,8,7,10,5,9,0};
        bublesort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    public static void bublesort(int[] array) {
        boolean finish = true;
        do { 
            finish = true;
            for (int i = 0; i < array.length-1; i++) {
                if(array[i] > array[i+1]){
                    int temp= array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    finish = false;
                }
        }
            
        } while (!finish);



       
    }
}