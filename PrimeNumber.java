import java.util.*;
public class PrimeNumber {
    public static void main(String[] args) {
        
        for(int num=2;num<100;num++){
            boolean IsPrime=true;
            for(int i=2;i<num;i++){
            if (num%i==0) {
                IsPrime=false;
                break;
            }
    }
    if (IsPrime){
    System.out.println( +num);
} 
}
}
}
