import java.io.Serializable;

public class Printer <T extends Animal & Serializable> { //we can also extend classes, bound the "T" to be a subclass of "Animal"
    T thingtoPrint;
    public Printer(T thingtoPrint) {
        this.thingtoPrint = thingtoPrint;
    }
    public void print(){
        System.out.println(thingtoPrint);
    }
}
