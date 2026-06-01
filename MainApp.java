import java.util.*;
 class Calculator1 {
    
   public void Addition(int a,int b){

        System.out.println("a + b=" +(a + b));
    }
   public void Subtraction(int a,int b){

        System.out.println("a - b=" +(a-b));
    }
   public void Multiplication(int a,int b){
        System.out.println("a * b=" +(a*b));
    }
   public void Divison(int a,int b){
        System.out.println("a / b=" +(a/b));
    }}
   public class MainApp{
    public static void main(String[] args) {
       
 
        Calculator1 result=new Calculator1();
        result.Addition(2,3);
        result.Subtraction(5,4);
        result.Multiplication(2,3);
        result.Divison(4,2);
        
    
   }
}

    
