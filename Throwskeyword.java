package JDBC_OOPS_Java;

public class ThrowsKeyword {
    public void foo() throws ArithmeticException {
        float a = 10/0; //Exception  Method

    }

    public void bar() throws ArithmeticException {
        try {
            foo();
        }catch (Exception e) {

        }
    }
public static void main(String[] args)  throws ArithmeticException {
    ThrowsKeyword t = new ThrowsKeyword();
    t.bar();
    System.out.println("ABC");
    }
}
