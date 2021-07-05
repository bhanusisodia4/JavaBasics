import java.util.Scanner;

public class JavaScanner {
    /** Scanner class in java.util package is used to take input of prmitive data
     * types such as int, float, double , String , char etc
     *
     * Scanner class is slow as compared to BufferedReader class
     */
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a integer value");
        int i = sc.nextInt();
        System.out.println("The integer value is: "+i);

        System.out.println("Enter a String");
        String name = sc.next();
        System.out.println("The String is:"+name);

        System.out.println("Enter a character:");
        char ch = sc.next().charAt(0);
        System.out.println("The Character is:"+ch);


    }
}
