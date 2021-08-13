import java.util.Scanner;

public class StringAlphabetOrder {
    //my name is bhanu
    public static void stringAlphabeticalOrder(String str){
        int len = str.length();
        int i=0;
        char arr[] = new char[len];
        Scanner sc = new Scanner(System.in);

        while(i < len){
            if (str.charAt(i)!=' '){
                arr[i] = str.charAt(i);
                i++;
            }
            else i++;
        }
      // char ar1[]= str.toCharArray(); -> we can use line also
        // instead of using code from line 11 to 16

        for(i=0; i < arr.length; i++){
            for(int j=i+1;j< arr.length;j++){
                if(arr[i]> arr[j]){
                    char temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]= temp;
                }
            }
        }
        for (char c : arr) System.out.print(c);

    }

    public static void main(String[] args) {
        String str = "my name is bhanu ";
        stringAlphabeticalOrder(str);
    }

}
