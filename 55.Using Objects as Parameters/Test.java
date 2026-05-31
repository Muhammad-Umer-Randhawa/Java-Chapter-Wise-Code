public class Test {
    int a;
    int b;
    Test(int i, int j){
        a = i;
        b = j;
    }
    boolean equalTo(Test o){
        if(o.a == a && o.b == b){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Test t1 = new Test(10, 20);
        Test t2 = new Test(10, 20);
        if(t1.equalTo(t2)){
            System.out.println("t1 and t2 are equal");
        }
        else{
            System.out.println("t1 and t2 are not equal");
        }
    }
}
