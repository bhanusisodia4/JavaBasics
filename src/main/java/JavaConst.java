public class JavaConst {
    /**A Java constructor is used to instantiate instance variables.
    A constructor is invoked whenever we create a object of that particular class.
    A unlike methods which can have different name. A constructor should have same name as of class.
    A Constructor can be default, parameterised or no argument
     A constructor should not return any value as it is not directly called by our code.it is called by
     memory allocation.
     Whenever we doesnt create any const, java automatically create a default const to intialised class instance var

    **/
    int a; // for this instance var java will create a default const

    public static void main(String[] args) {
        JavaConst jc = new JavaConst();
        System.out.println(jc.a); //Default constructor should assign default value as it is uninitialized.

    }
}

