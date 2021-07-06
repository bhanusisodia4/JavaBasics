public class JavaMethods {
    //A method is a block of code that performs certain task.
    // we use methods due to code re-usability

    public int sum(int a, int b){ //sum is a method
        return a+b;
    }

    public static void main(String[] args) {
        JavaMethods obj = new JavaMethods();
        System.out.println(obj.sum(3,6));
        System.out.println(obj.sum(3,116));
    }
}
