public class SuperKeyword {
    int i=10;

    SuperKeyword(){
        System.out.println("Parent no argument const is called");
    }

    SuperKeyword(int i){
        this.i=i;
        System.out.println("the new value of 'i' is :"+i);
    }

    public void check(){
        System.out.println("This Method is called from Parent class");
    }
}

class Duper extends SuperKeyword{
    int i=20;

    Duper(){
        //super(30);
        System.out.println("Child no argument constructor is called");
    }


    public void check(){
        System.out.println("This method is called from child");
    }

    void call() {
        System.out.println(this.i); //it will show current class instance value which is 20
        System.out.println(super.i);

    }

    public static void main(String[] args) {
       Duper d1 = new Duper();
       d1.call();
    }
}
