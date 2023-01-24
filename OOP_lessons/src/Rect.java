public class Rect {
    double lenght;
    double width;

    void setDimens(double lenght, double width){
        this.lenght = lenght;
        this.width = width;
    }

    double getArea(){
        return lenght * width;
    }
}
