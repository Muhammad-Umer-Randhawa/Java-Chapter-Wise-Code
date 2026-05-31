public class Main{
    public static void main(String[] args) {
        //Abstraction = "abstract" --> used to define abstract classesand methods.
        //                             Abstraction is the process of hiding implementation details.
        //                             and showing only the essential features.
        //                             Abstract classes cant be instantiated directly.
        //                             Can contain 'abstract' methods (which must be implemented).
        //                             Can contain 'concrete' methods (which are inherited).
        
        Circle c = new Circle(5);
        Triangle t = new Triangle(2,3);
        Rectangle r = new Rectangle(4,7); 
        
        c.display();
        c.area();

        t.display();
        t.area();

        r.display();
        r.area();
    }
}