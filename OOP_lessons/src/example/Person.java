package example;

public class Person {
    private String name;
    private int age;
    double weight;

    public Person(String name, int age){
            this.name = name;
            this.age = age;
    }

    public void setAge(int age){
        if (age >= 0){
            this.age = age;
        }
    }
//сеттер чтобы передавать значение
    public String getName(){
        return name;
    }
//геттер чтобы читать значение
    public int getAge(){
        return age;
    }

    @Override
    public String toString() {
        return "Name: " + name + " Age: " + age;
    }
}
