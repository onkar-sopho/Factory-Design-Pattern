public interface Shape {
    void draw();
}

class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Rectangle -> draw()");
    }
}

class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Circle -> draw()");
    }
}

class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square -> draw()");
    }
}
