public class Circle extends Shape{
    double radius;

    Circle(double radius){
        this.radius = radius;
    }
    
    @Override
    double area(){
        double a = Math.PI * radius * radius;
        System.out.println(a);
        return a;
    }
}
