import java.util.Scanner;

public class StarPattern {

    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of pyramid");
        size = sc.nextInt();
        for(int i=1; i <= size; i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1; i <= size; i++){
            for(int j=i;j<=size;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
