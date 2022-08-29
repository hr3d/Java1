package trofimova.java1.lesson2;

public class HomeWorkApp2 {
    public static void main(String[] args){
        System.out.println(within10and20(12, 6));
        isPositiveOrNegative (-5);
        System.out.println(checkNumberIsPositiveOrNegative (-7));
        printWordSeveralTimes("cat", 5);
        System.out.println(checkLeapYear (5));
        System.out.println(checkLeapYear (8));
        System.out.println(checkLeapYear (100));
        System.out.println(checkLeapYear (400));
        System.out.println(checkLeapYear (2022));
    }

    public static boolean within10and20(int a, int b){
        int sum = a + b;
        return (sum >= 10 && sum <= 20);
    }

    public static void isPositiveOrNegative (int a){
        if (a >= 0){
            System.out.println("Это положительное число");
        } else {
            System.out.println("Это отрицательное число");
        }
    }

    public static boolean checkNumberIsPositiveOrNegative (int a){
        return (a < 0);
    }

    public static void printWordSeveralTimes(String word, int times){
        for (int i = 0; i < times; i++){
            System.out.println(word);
        }
    }

    public static boolean checkLeapYear (int year){
        return (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0));
    }
}
