public interface Vehicle {
     public void type();

     default void display(){
         System.out.println("Hello from Interface");
         show();
     }

     public static void run(){
         System.out.println("Hello Static method from Interface");
     }

     private void show(){
         System.out.println("this is private method in Interface");
     }

}
