public class MainPerson {
    public static void main(String[] args) {
        Person john = new Person();
        Person fill = new Person();
        Person lara = new Person();
        john.name = "John";
        john.age = 25;
        john.weight = 89;
        fill.name = "Fill";
        fill.age = 20;
        fill.weight = 81;
        lara.name = "Lara";
        lara.age = 21;
        lara.weight = 50;
        double sum = john.age + fill.age + lara.age;
        double average = sum / 3;
        System.out.println(average);
    }
}
