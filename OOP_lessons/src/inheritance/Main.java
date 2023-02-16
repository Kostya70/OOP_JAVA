package inheritance;

public class Main {
    public static void main(String[] args) {
        Rect rect = new Rect(10,20);
        Triangle triangle = new Triangle(10,10,10);
        ColoredRect coloredRect = new ColoredRect(10,20);
        rect.showPerimeter();
        triangle.showPerimeter();
        coloredRect.showPerimeter();
    }
}
