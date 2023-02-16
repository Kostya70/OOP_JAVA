package inheritance;

public class Cat extends CatFamily{

    public Cat(){
        super(4,2,false);
        legs = 5;

    }
    @Override
    public void eat(){
        super.eat();
        System.out.println("вискас");
    }
}
