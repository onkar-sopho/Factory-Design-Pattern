public class Client {

    public static void main(String[] args) {
        /*
        This is the 2nd implementation of Factory Design Pattern.
        Here we use just a single FactoryMethod that accepts a string as argument and returns the
        corresponding object. No need to create Factory subclasses here. This is the most common implementation.
         */

        System.out.println("Most common implementation of Factory Design Pattern");

        // Creates an object of Rectangle and then calls its draw method
        Shape shape1 = new ShapeFactory().getShape("rectangle");
        shape1.draw();

        // Creates an object of Circle and then calls its draw method
        Shape shape2 = new ShapeFactory().getShape("circle");
        shape2.draw();

        // Creates an object of Square and then calls its draw method
        Shape shape3 = new ShapeFactory().getShape("square");
        shape3.draw();

    }

}
