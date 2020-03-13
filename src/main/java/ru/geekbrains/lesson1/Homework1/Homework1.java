package ru.geekbrains.lesson1.Homework1;

public class Homework1 {

        byte a1 = -110;
        short b1 = 15674;
        int c1 = 2000;
        long d1 = 10000L;

        float f = 3.402F;
        double e = 14.54;

        char m = '\t';
        boolean n = true;


        public static void main(String[] args) {
            System.out.println(calculate(3.402F,4.52F,3.6809F,10.61F));
            System.out.println(task10and20(5,8));
            isPositiveOrNegative(0);
            System.out.println(isNegative(7));
            greetings("Лена");
            visokos(1998);
        }
        public static float calculate( float a, float b, float c, float d) {
            return a * (b + (c / d));

        }
        public static boolean task10and20(int a, int b){
            int c = a + b;
            if(c >= 10 && c <= 20){
                return true;
            } else {
                return false;
            }
        }
        public static void isPositiveOrNegative(int x) {
            if (x < 0) {
                System.out.println(x + " - отрицательное число");
            } else {
                System.out.println(x + " - положительное число");
            }
        }

        public static boolean isNegative(int y) {
            if(y < 0) {
                return true;
            } else {
                return false;
            }
        }
        public static void greetings(String name) {
            System.out.println("Привет, " + name + "!");
        }

        public static void visokos(int year) {
            if(year%4==0 && year%100 !=0 || year%400==0){
                System.out.println(year + " - високосный год");
            } else {
                System.out.println(year + " - невисокосный год");
            }
        }
    }

