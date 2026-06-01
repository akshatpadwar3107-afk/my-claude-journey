import java.util.Scanner;


public class UserInput{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your name");
        String name=sc.next();

        System.out.println("Enter roll no");
        int rollno=sc.nextInt();

        System.out.println("Enter the marks");
        float marks=sc.nextFloat();

        System.out.println("Hello : "+name+",Your roll no is : "+rollno+" and your marks are : "+marks);
    }
    
}