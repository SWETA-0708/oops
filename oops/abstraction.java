public class abstraction {
    public static void main(String[]args){
        Circle c=new Circle(5);
        rectangle r=new rectangle(4,5);

        c.display();
        System.out.println("circle area:" + c.calculatearea());

        r.display();
        System.out.println("Rectangle area:"+r.calculatearea());
    }
}
abstract class Shape {
    abstract double calculatearea();//method
    void display (){
       System.out.println("this is a shape");
    }
}
class Circle extends Shape{
 double radius;
  Circle(double radius){
    this.radius=radius;
  }
  double calculatearea(){
    return Math.PI *radius*radius;
  }
}
class rectangle extends Shape{
    double length;
    double width;

    rectangle(double length,double width){
        this.length=length;
        this.width=width;
    }
    double calculatearea(){
        return length*width;
    }
}
