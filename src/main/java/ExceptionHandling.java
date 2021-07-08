public class ExceptionHandling {

    public static void main(String[] args) {
        int i=0;
        int j=10;
        try{
            //In try block we will write risky code
            System.out.println(j/i);
            System.out.println("This line of code will not get execute");

        } catch (ArithmeticException Ae) {
            //In catch block we will write handling code
            System.out.println("Cannot divide by zero");
        }
        finally {
            //Here we will write code for file close, DB close as finally block will always get executed
            System.out.println("DataBase connection is closed ");
        }
    }
}
