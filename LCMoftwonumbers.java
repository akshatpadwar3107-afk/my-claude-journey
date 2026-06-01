public class LCMoftwonumbers {
    public static void main(String[] args) {
        int no1=12;
        int no2=15;
        int lcm=no1;
        if (no2>no1){
            lcm=no2;
            
        }
        while (true) {
            if (lcm%no1==0 && lcm%no2==0) {
            
               System.out.println("Lcm=" +lcm); 
               break;  
            }
         lcm++;   
        }

        
        
       
        
        
    }
    
}
