package example;

public class MainDog {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "Loki";
        dog.breed = "Siba inu";
        dog.weight = 10;
//        System.out.println(dog.getInfo());
//        String info = dog.getInfo();
//        System.out.println(info);
        dog.speed = 10;
        dog.run();

    }
}
