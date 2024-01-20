public class polymorphismexample {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);
        
        printArea(circle);     // Output: Area: 78.53981633974483
        printArea(rectangle);  // Output: Area: 24.0
    }
    
    public static void printArea(Shape shape) {
        System.out.println("Area: " + shape.calculateArea());
    }
}
    class Shape {
    public double calculateArea() {
        return 0.0;
      }
    }

    class Circle extends Shape {
    private double radius;
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;
    
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
    @Override
    public double calculateArea() {
        return width * height;
    }
}




 
