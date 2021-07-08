public class StaticMethodExample {
    int i= 10;
    static int j = 20;
    static String name = "Bhanu";

    void display(){
        System.out.println(+i+" "+j+" "+name); // non static method can access both static and non static variable
    }
    static void show(){
      //  System.out.println(i); // this line will throw error as static method can access only static variable
        System.out.println(name);
        System.out.println(j);
    }

    public static void main(String[] args) {
        StaticMethodExample obj = new StaticMethodExample();
        obj.display();
        StaticMethodExample.show();
    }
}
