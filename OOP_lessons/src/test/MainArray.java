package test;

import java.util.ArrayList;

public class MainArray {
    public static void main(String[] args) {
//        ArrayList<String> employees = getEmployees();
//        employees.add("James");
//        employees.remove("Bob");
//        employees.remove(0);
//        for (String employee : employees) {
//            System.out.println(employee);
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 6; i++){
            numbers.add(i);
        }
        ArrayList<String> names = getEmployees();
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < names.size(); i++){
            result.add(numbers.get(i) + " - " + names.get(i));
        }
        for (String s : result){
            System.out.println(s);
        }
    }





    private static ArrayList<String> getEmployees(){
        ArrayList<String> employees = new ArrayList<>();
        employees.add("John");
        employees.add("Sam");
        employees.add("Den");
        employees.add("Jimm");
        employees.add("Fill");
        employees.add("Bob");
        return employees;
    }

}


