package test;

import example.Person;

// оболочки типов
public class MainType {
    public static void main(String[] args) {
//        String s = "1000";
//        String s1 = "2000";
//        int a = Integer.parseInt(s);
//        int b = Integer.parseInt(s1);
//        System.out.println(a + b);

        String s = "This is John. He is 27 years old.";
        String name = s.substring(8,12);
        String ageString = s.substring(20,22);
        int age = Integer.parseInt(ageString);
        Person person = new Person(name,age);
        System.out.println(person.getName() + " " + person.getAge());
    }
}
