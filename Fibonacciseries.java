import java.util.*;

public class Fibonacciseries {
    public static void main(String[] args) {
        int n=10;
        int no1=0,no2=1;
        System.out.print(+no1+ "," +no2);
       
        for(int i=1;i<n;i++){
          int sum=no1 + no2;
             System.out.print("," +sum);
             no1=no2;
             no2=sum;
        }
    }

    
}
// 0,1,1,2,3,5,8,....