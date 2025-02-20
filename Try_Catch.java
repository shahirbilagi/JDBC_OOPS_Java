package JDBC_OOPS_Java;

public class Try_Catch {
    public static void main(String[] args) {
        System.out.println("Hello");
        String a = "Shahir";
        if(a.equals("Shahir")) {
            try {
                throw new Exception("Shahir is Exception");
            } catch (Exception e) {
                e.getStackTrace();
            }
        }
        System.out.println("World");
    }
}
