public class AutomaticPromotion {
    /**     Byte
     *       |
     *       short
     *        |
     * char ->int ->float
     *          |       |
     *         Long ->double
     *
     *         int->double
     *         Long->float
     *      One type is promoted to another implicitly if no matching data type is found.
     */

    public void display(int i){
        System.out.println("Hello , how are you");
    }

    public void display (double d){
        System.out.println("i am good. hbu?");
    }

    public static void main(String[] args) {
        AutomaticPromotion obj = new AutomaticPromotion();
        obj.display('c'); // here char type is promoted to int as per above diagram
        obj.display(2.3f); // here float type is promoted to double
    }
}
