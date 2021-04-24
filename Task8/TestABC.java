package Task8;

public class TestABC {
    public static void main(String[] args) {
        A a1= new C();
        System.out.println("");
        System.out.println(a1);
        System.out.println("");
        B b1= (B)a1;//downcast okay
        System.out.println(b1);//run's
        System.out.println("");
        C c1=(C)b1;//downcast okay
        System.out.println(c1);
    }
}
