public class Rectangle extends Shape {
    double length;
    double width;

    Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    @Override
    double area(){
        double a = length * width;
        System.out.println(a);
        return a;
    }
}
