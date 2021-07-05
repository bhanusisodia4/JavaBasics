import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInput {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        //BufferReader class is another way of reading text from character input steam
        //it is faster then Scanner class
        System.out.println("Enter a String:");
        String name = br.readLine();
        System.out.println("The Entered String is: "+name);

        System.out.println("Enter a number");
        int num = Integer.parseInt(br.readLine());
        System.out.println("The Entered number is: "+num);

        System.out.println("Enter a character");
        char ch = br.readLine().charAt(0);
        System.out.println("Entered Characrer is: "+ch);

    }
}
