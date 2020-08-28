public class Client {

    public static void main(String[] args) {
        /*
        This is a strict implementation of Factory Design Pattern.
        Here we need to make subclasses of the factoryClass for each product.
         */
        System.out.println("Strict implementation of Factory Design Pattern");

        // Creates an object of Rectangle and then calls its draw method
        Shape shape1 = new RectangleFactory().getShape();
        shape1.draw();

        // Creates an object of Circle and then calls its draw method
        Shape shape2 = new CircleFactory().getShape();
        shape2.draw();

        // Creates an object of Square and then calls its draw method
        Shape shape3 = new SquareFactory().getShape();
        shape3.draw();

    }

}
