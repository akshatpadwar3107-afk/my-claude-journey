import java.util.Scanner;

public class Calculator {

   public static void main(String[] args){
   double a;
   double b;
    int choice;
    Scanner sc=new Scanner(System.in);
    do{
    System.out.print("Enter the value of a=");
     a=sc.nextDouble();
    System.out.print("b=");
     b=sc.nextDouble();
    System.out.println("1.Addition");
    System.out.println("2.Subtraction");
    System.out.println("3.Multiplication");
    System.out.println("4.Divison");
    System.out.println("Enter the choice");
     choice=sc.nextInt();

    switch(choice){
        case 1:
            double result=a+b;
            System.out.println("a + b=" +result);
            break;
         
            case 2:
            result=a-b;
            System.out.println("a - b" +result);
             break;

             case 3:
             result=a*b;
             System.out.println("a * b=" +result);
             break;

             case 4:
                result=a/b;
                if(b==0){
                    System.out.println("Not Defined");
                }
                else{
                    System.out.println("a / b=" +result);
                }
                break;
                default:
            System.out.println("Exit");

        }
        
    }while(choice!=4);
sc.close();
}

   }
    


