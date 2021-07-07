public class ThisKeyword {
    int i;

    public void show(int i){
        this.i=i;
        System.out.println("THe value of if is: "+i);
    }
}

class Test {
    public static void main(String[] args) {
        ThisKeyword obj = new ThisKeyword();
        obj.show(10);
    }
}