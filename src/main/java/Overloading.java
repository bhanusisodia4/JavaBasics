public class Overloading {
    //Static polymorphism or compile time polymorphism. it is handled by compiler

    void show(){
        System.out.println("Hello");
    }
    void show(int a){
        System.out.println("The value is :"+a);
    }

    void show (int a, int b){
        System.out.println("the value is: "+a*b);
    }

    void show (String b, int a){
        System.out.println("Hello Again");
    }

    public static void main(String[] args) {
        Overloading o1 = new Overloading();
        o1.show("Bhanu",22);
    }

    }


