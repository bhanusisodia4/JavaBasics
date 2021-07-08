public class Fact {

    static int factorial(int n){
        if (n==0 || n==1)
            return 1;

        int result = 1;

        for(int i =1; i <=n; i++){
            result = result *i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
