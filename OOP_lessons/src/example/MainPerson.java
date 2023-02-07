package example;

public class MainPerson {
    public static void main(String[] args) {
//        example.Person john = new example.Person();
//        example.Person fill = new example.Person();
//        example.Person lara = new example.Person();
//        john.name = "John";
//        john.age = 25;
//        john.weight = 89;
//        fill.name = "Fill";
//        fill.age = 20;
//        fill.weight = 81;
//        lara.name = "Lara";
//        lara.age = 21;
//        lara.weight = 50;
//        double sum = john.age + fill.age + lara.age;
//        double average = sum / 3;
//        System.out.println(average);

        Person person = new Person("john", 25);
        person.setAge(-40);
        System.out.println("name: "+person.getName()+" age " + person.getAge());
    }
}
