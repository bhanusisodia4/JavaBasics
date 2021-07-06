public class Animal {

    Animal(){
        System.out.println("Hello from parent class");
    }
}

class Dog extends Animal{
    Dog (){
        System.out.println("Hello from child class");
    }

    public static void main(String[] args) {

        Dog d1 = new Dog(); //When we created object of child class,the new keyword invokes def const of child
        //which implicitly invokes const of parent class
        // Fist Parent class const => then child class const will execute
    }
}