public class MainBox {
    public static void main(String[] args) {
        Box box1 = new Box();// ссылочный тип
        Box box2 = new Box();// ссылочный тип
//        параметризированные методы
        box1.setDimens(15,15,15);
        box2.setDimens(20,20,20);


//        box1.height = 10;
//        box1.lenght = 10;
//        box1.width = 10;

//        Box box3 = box2;
//        box2.height = 20;
//        box2.lenght = 20;
//        box2.width = 20;
//        box3.width = 0;
//        double volume = box1.height * box1.lenght * box1.width;
//        double volume2 = box2.height * box2.lenght * box2.width;
//        double volume = box1.getVolume();
//        double volume2 = box2.getVolume();
//        System.out.println(volume);
//        System.out.println(volume2);
        box1.showVolume();
        box2.showVolume();
    }
}
