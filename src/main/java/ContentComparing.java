public class ContentComparing {
    public static void main(String[] args) {
        String str1 = new String("Bhanu");
        String str2 = new String ("Bhanu");

        Boolean result =  str1==str2; //this will return false as str1 and str2 refers to diff address in string pool
        System.out.println(result);

      Boolean result2 = str1.equals(str2); //This is comparing content so it will be true
        System.out.println(result2);
    }
}
