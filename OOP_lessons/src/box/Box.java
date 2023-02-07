package box;

public class Box {
   private double lenght;
    private double width;
    private double height;


    public Box(){
        this(10);
    }

//    Конструктор может быть без параметров и с параметрами
    public Box(double lenght, double width, double height){
        this.lenght = lenght;
        this.width = width;
        this.height = height;

    }

// перезагрузка конструктора
    public Box(double size){
        this(size,size,size);
    }

//    параметризированный метод

    public void setDimens(double lenght, double width, double height){
        this.lenght = lenght;
        this.width = width;
        this.height = height;

    }


    private double getVolume(){ // метод пишется так
//        double volume = lenght * width * height;
//        return volume;
//или так
          return lenght * width * height;
    }

//    double showVolume(){
//        double volume = lenght * width * height;
//        System.out.println(volume);
//        return volume;

//    если метод ничего не возвращает и нигде не используется а просто выполняется то использовать void и return не указывается. Не сохраняет в переменную результат метода

//    void showVolume(){
//        double volume = lenght * width * height;
//        System.out.println(volume);

//        так же можно из одного метода вызвать другой

//        void showVolume(){
//            double volume = getVolume();
//            System.out.println(volume);
//или так
           public void showVolume(){
                System.out.println(getVolume());
    }
}
