public class RecTest {
    int values[];
    RecTest(int i){
        values = new int[i];
    }
    void printArray(int i){
        if(i==0) return;
        else printArray(i-1);
        System.out.println("[ " + (i-1) + " ]" + values[i-1]);
    }
    public static void main(String[] args) {
        RecTest ob = new RecTest(10);
        int j;
        for(j=0; j<10; j++){
            ob.values[j] = j;
        }
        ob.printArray(10);
    }
}
