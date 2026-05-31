public class ReturnObj { //class showing we can return an object too.
    int a;
    ReturnObj(int i){
        a=i;
    }
    ReturnObj incrByTen(){
        ReturnObj temp = new ReturnObj(a+10);
        return temp;
    }
    public static void main(String[] args){
        ReturnObj ob1 = new ReturnObj(2);
        ReturnObj ob2;
        ob2 = ob1.incrByTen();
        System.out.println("ob1.a = " + ob1.a);
        System.out.println("ob2.a = " + ob2.a);
        ob2 = ob2.incrByTen();
        System.out.println("ob2.a after second increase = " + ob2.a);
    }
}
