public class SimpleArrayProg {

    public static void main(String[] args) {
        int arr [] ; //declaring any array
        arr = new int[10]; //Allocating memory

        for(int i=0; i < arr.length;i++){
            arr[i]= i*2;
            System.out.println(arr[i]);
        }

    }
}
