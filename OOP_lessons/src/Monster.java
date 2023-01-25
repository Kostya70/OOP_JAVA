//Перегрузка методов и конструктора посмотреть какие параметры принимает комбинация ctrl + p

public class Monster {
    int eyes;
    int legs;
    int arms;

    Monster(int eyes, int legs, int arms) {
        this.eyes = eyes;
        this.legs = legs;
        this.arms = arms;
    }

    Monster(int count){
        this(count,count,count);
    }

    Monster(){
        this(2);
    }

    void voice(){
        voice(1);
    }

    void voice(int count){
          voice(count,"Grrrrrrrr ");

    }

    void voice(int count, String word){
        for (int i = 0; i < count; i++){
            System.out.println(word);
        }
    }
}
