package seminar2;

public class stask3 {
    public static void main(String[] args) {
        int[] array = new int[2000000];
        int[] array2 = new int[2000000];
        for (int i = 0; i < 20000; i++) {
            array[i] = (int)(Math.random()*100);
            array2[i] = array[i];
        }
    }
    public static Integer BinSearch(int[] array, int value){
        int left = 0, right = array.length - 1;
        while (right - left > 1) {
            int mid = (left + right)/2;
            if(array[mid] < value){
                left = mid;

            } else{
                right = mid;
            }
        }
        if(array[left] == value) return left;
        if (array[right] == value) {
            return right;
        }
        return null;
    }
}
