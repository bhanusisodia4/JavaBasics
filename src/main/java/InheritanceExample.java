public class InheritanceExample {
    String name="Jhony";
    int age = 30;

    public void display(){
        System.out.println("The name of person is: "+name+" and his age is: "+age);
    }
}

class Runner extends InheritanceExample{
     void show(){
        System.out.println("This Method is in child class");
    }
}

class Main{
public static void main(String[]args){

    Runner c1 = new Runner(); //object of child class which can inherit all the properties of parent class
    InheritanceExample i1 = new InheritanceExample(); //object of parent class
    c1.show();
    c1.display();
    i1.display();
   // i1.show(); this will throw error as parent class object cannot call child class methods/var
        }
        }