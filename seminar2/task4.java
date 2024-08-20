package seminar2;

public class task4 {
    public static void main(String[] args) {
        int[] array = new int[]{0,1,2,3,4,5,6,7,8,9,10};
       System.out.println(dinFind(array, 4, 0, 10));
    }
    public static int find(int[] array, int value){
        for (int i = 0; i < array.length; i++) {
            if(array[i] == value){
                return 1;
            }
        }
        return -1;
    }
}
