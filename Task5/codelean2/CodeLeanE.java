package codelean2;
import codelean.CodeLeanB;
public class CodeLeanE extends CodeLeanB{
    public static void main(String[] args) {
        new CodeLeanB().methodPublic();
       // new CodeLeanB().methodProtected();
        //works, accessing super class protected method using subclass
        new CodeLeanE().methodProtected();
    }
}
