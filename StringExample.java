import java.lang.*;


public class StringExample {
    public static void main(String[] args) {
        String obj1 = new String("AIUB");
        System.out.println(obj1);

        String s1 = "AIUB";
        System.out.println(s1);

        int age = 21;
        String s2 = "I am " + age + " years old";
        System.out.println(s2);

        System.out.println(s1.length());
        System.out.println(s2.charAt(5));
    }
    
}
