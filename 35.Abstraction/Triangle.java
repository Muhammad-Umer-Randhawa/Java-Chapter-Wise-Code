public class Triangle extends Shape {
    double base;
    double height;

    Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    @Override
    double area(){
        double a = 0.5 * base * height;
        System.out.println(a);
        return a;
    }
}
