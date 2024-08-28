package seminar1;

import java.sql.Date;

public class task4_2 {
    public static void main(String[] args) {
        Date start = new Date()
        System.out.println(f1(1000));
        Date end = new Date();
        long time = end.getTime() - start.getTime();
        System.out.println(time);
    }
    public static double f1(int number){
        double number0 = 0;
        double number1 = 1;
        double result = 0;
        while (number-2 > 0) {
            result = number1 + number0;
            number0 = number1;
            number1 = result;
            number -= 1;
        }
        return result;
    }
}
