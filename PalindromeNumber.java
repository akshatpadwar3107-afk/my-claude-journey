import java.util.*;


 public class PalindromeNumber {
    public static void main(String[] args){

        int num=111;
        int rev=0;
        int temp=num;

        while(temp!=0){
            int rem=temp % 10;
            rev=rev * 10 + rem;
            temp=temp/10;
        }
        if(num==rev){
            System.out.println("Palindrome Number");
        }
        else{
            System.out.println("Not A Palindrome Number");
        }
        
    }
    
    
    
    
}
