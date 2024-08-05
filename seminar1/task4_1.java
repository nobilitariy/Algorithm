package seminar1;

public class task4_1 {
    public static void main(String[] args) {
        System.out.println(f(10));
    }
    public static int f(int number){
        if (number == 1) {
            return 1;
        }
        if (number == 2) {
            return 1;
        }
        return f(number - 1) + f(number - 2);
    }
}
