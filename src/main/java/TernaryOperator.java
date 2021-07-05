import java.util.Scanner;

public class TernaryOperator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int max = (a > b)? a : b;
        System.out.println("The Max of two number is: "+max);

    }

}
