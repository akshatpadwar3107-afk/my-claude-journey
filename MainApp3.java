import java.util.Scanner;

interface Payment {

    void pay();
    
}
class UPIPayment implements Payment{

   public void pay(){

        System.out.println("Payed using UPI");
    }
}
class NetBanking implements Payment{

    public void pay(){

        System.out.println("Payed using Net Banking");
    }
}

class Checkout{
    
    void Processpayment(Payment payment){

        payment.pay();
    }


}

public class MainApp3 {

    public static void main(String[] args) {
        
        Payment upi=new UPIPayment();
        Payment netbanking=new NetBanking ();
        Checkout checkout=new Checkout();

         System.out.println("1.Pay using UPI");
    System.out.println("2.Pay using NetBanking");

        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();

      switch (choice) {
        case 1:
            checkout.Processpayment(upi);
            break;
      case 2:
      checkout.Processpayment(netbanking); 
            break;
            default :
            System.out.println("Invalid choice");
      }
      sc.close();
}
}