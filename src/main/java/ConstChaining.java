public class ConstChaining {
    //Const Chaining is process through single object creation will invoke all const one by one(chaining).

    ConstChaining(){
        this(9);
        System.out.println("default const is called:");
    }
    ConstChaining(int a){
        this(5,6);
        System.out.println("Single Para const is called:"+a);
    }

    ConstChaining(int a, int b){
        System.out.println("double para const is called: "+a*b);
    }

    public static void main(String[] args) {
        ConstChaining obj = new ConstChaining();
    }

}
