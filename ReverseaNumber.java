public class ReverseaNumber {
    public static void main(String[] args){
        int num=3928;
        int rev=0;

        while(num!=0){
            int rem=num % 10;
             rev=rev*10+ rem;
             num=num / 10;
        }
        System.out.println("Reverse of the number is " +rev);
    }
    
}
