import java.util.StringTokenizer;

public class SentenceReverse {
    //my name is Bhanu.

    public static void sentenceReverse(String str){
        StringTokenizer st = new StringTokenizer(str," ");
        String arr[] = new String[st.countTokens()];
        int len = arr.length-1;

        while(st.hasMoreTokens()){
            arr[len]= st.nextToken();
            len--;
        }

        for(String s:arr){
            System.out.print(s+" ");
        }
    }

    public static void main(String[] args) {
        sentenceReverse("My name is Bhanu");
    }
}
