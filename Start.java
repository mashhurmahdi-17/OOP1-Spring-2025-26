import java.lang.*;

public class Start {
    public static void main(String[] args) {
        
    Account obj1 = new Account();
    obj1.setAccountNumber(34343);
    obj1.setAccountHolderName("Mahdi");
    obj1.setBalance(454545.44);
    obj1.Show();

    Account obj2 = new Account( 171717, "Mashhur" , 2000000.22);
    obj2.Show();

    }

}