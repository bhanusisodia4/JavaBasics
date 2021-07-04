public class JavaVariables {
    //a variable is a location in Memory to hold data or value

    int i; // This is a instance variable. default value will be 0.
    static String name; //this is a static var or class variable.  default value will be null.

    public static void main(String[] args) {
        char ch ='c'; //this is a local variable
        JavaVariables obj = new JavaVariables();
        System.out.println(obj.i);
        System.out.println(ch);
        System.out.println(JavaVariables.name);

    }
}
