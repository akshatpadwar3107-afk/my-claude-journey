import java.util.*;

public class GCDoftwonumbers {
    public static void main(String[] args) {
        int no1=12;
        int no2=18;
        int gcd =1;

        for(int i=1;i<=12;i++){
            if((no1 % i==0) && (no2 % i==0)){
                gcd = i;
            }
            
        }
        System.out.println("GCD= " +gcd);
    }
    
}
