package box;

public class WeightBox extends Box{

    private double weight;
    public WeightBox() {
        this.weight = 10;
    }

    public WeightBox(Box another, double weight) {
        super(another);
        this.weight = weight;
    }

    public WeightBox(double lenght, double width, double height, double weight) {
        super(lenght, width, height);
        this.weight = weight;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Weight " + weight);
    }

    public WeightBox(double size, double weight) {
        super(size);
        this.weight = weight;


    }
}
