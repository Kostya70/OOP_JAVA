package test;

import example.MyMath;
import example.Person;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        System.out.println(MyMath.lenght(10));
//        System.out.println(MyMath.area(10));
//        System.out.println(MyMath.lenght(10));
//        System.out.println(MyMath.sum(1,3));
//        MyArrayList employees = getEmployees();
//        employees.add("James");
//        employees.remove("James");
//        for (int i= 0; i < employees.getSize(); i++){
//            System.out.println(employees.get(i));
//        }
//    }
//
//
//    private static MyArrayList getEmployees(){
//        MyArrayList employees = new MyArrayList();
//        employees.add("John");
//        employees.add("Fill");
//        employees.add("Kate");
//        employees.add("Fred");
//        return employees;


//        Person person = new Person("John", 17);
//        System.out.println(person);
//
//        Random random = new Random();
//        for (int i = 0; i<100; i++){
//            int a = random.nextInt(5, 11);
//            System.out.print(a + " ");
        Random random = new Random();
        for (int i = 0; i<100; i++){
            int number = random.nextInt(1,7);
            String result = String.format("Ваше число %S", number);
            System.out.println(result);
        }
    }
}