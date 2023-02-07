package example;//Перегрузка методов и конструктора

public class MyMath {

    private static final double PI = 3.14; // создание константы

    public static int sum(int... numbers){ //аргумент переменной длины varargs
        int sum = 0;
        for (int number : numbers){
            sum += number;
        }
        return sum;
    }

     public static double lenght(double radius){
        return  2 * PI * radius;
     }

     public static double area(double radius){
         return PI * radius * radius;
     }

     public static int nultiple(int a, int b){

        return a * b;
    }

    public static double nultiple(double a, double b){

        return a * b;
    }

    public static int nultiple(int a){
        return a * a;
    }
}
