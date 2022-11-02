package patterns.structural.flyweight;

public class client {
    private static final String[] colors = {"Red", "Green", "Blue", "White", "Black"};

    public static void main(String[] args) {
        for (int i = 0; i < 50; ++i) {
            Circle circle = (Circle) ShapeFactory.getCircle(colors[(int) (Math.random() * colors.length)]);
            circle.setX((int) (Math.random() * 20));
            circle.setY((int) (Math.random() * 20));
            circle.setRadius((int) (Math.random() * 5));
//            circle.draw();
        }
    }
}
