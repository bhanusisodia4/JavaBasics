abstract class Teacher {
    abstract void eat();

    Teacher(){
        System.out.println("this is abstract class constructor");
    }
    public void display(){
        System.out.println("this method is called from abstract class");
    }
}

class Student extends Teacher{
    Student(){
        System.out.println("This is child default constructor");
    }

     void eat(){
         System.out.println(" i eat pizza");
     }
  public void display(){
      System.out.println("hello from child class");
     }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.display();
        s1.eat();
    }
}