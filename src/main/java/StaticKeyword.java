public class StaticKeyword {
    int empId;
    String name;
    static String empCompany = "Google"; //we have declared this as static
    // because company name will be common(we will use it most of time) and it will save memory

    StaticKeyword(int empId, String name){
        this.empId = empId;
        this.name = name;
        System.out.println("the Employee details are :"+empId+" "+name+" "+StaticKeyword.empCompany);

    }
}

class Define {

    public static void main(String[] args) {
        StaticKeyword emp1 = new StaticKeyword(11,"Bhanu");
        StaticKeyword emp2 = new StaticKeyword(12,"Ramesh");
        StaticKeyword emp3 = new StaticKeyword(13,"Suresh");
    }
}

