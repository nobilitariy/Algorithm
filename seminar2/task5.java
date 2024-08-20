package seminar2;

public class task5 {
    public static void main(String[] args) {
        int[] array = new int[]{0,1,2,3,4,5,6,7,8,9,10};
       System.out.println(dinFind(array, 0, 0, 10));
    }
    public static int dinFind(int[] array, int value, int min, int max){
        int mindpoint; 
        if(max < min){
            return -1;
        } else {
            mindpoint = ( max - min)/2 + min;
        }
        if (array[mindpoint]< value) {
            return dinFind(array, value, mindpoint + 1, max);
        }else{
            if(array[mindpoint] > value){
                return dinFind(array, value, min, mindpoint-1);
            }else {
            return mindpoint;
            }
        }
    
            

    }
}
