public class MethodOverriding {

    void show(){
        System.out.println("This method is called from Parent class");
    }

}

class Subclass extends MethodOverriding{
    void show(){
        System.out.println("This method is called from child class");
    }
}

class Run{
    public static void main(String[] args) {
        Subclass s1 = new Subclass();
        s1.show(); // This will override the parent method and will call child method
    }
}
