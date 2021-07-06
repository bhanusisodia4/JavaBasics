public class TypesCons {
    /** important point
     * A constructor cannot be final , abstract or final
     * A constructor can be overloaded but cannot be overridden
     */
    TypesCons(){
        System.out.println("This is default constructor");
    }
    TypesCons(int a, int b){
        System.out.println("this is parameterised const");
    }
    TypesCons(String name, String surname){
        System.out.println("Full name is "+name+""+surname);
    }

    public static void main(String[] args) {
        TypesCons obj = new TypesCons(); //This will call default cons
        TypesCons obj1 = new TypesCons(2,3); //This obj will call Param Constr
        TypesCons obj2 = new TypesCons("Bhanu","sisodia"); // This is also called Constructor overloading

        //

    }

}
