import java.util.jar.Attributes.Name;
class Address {

    String city;
    String state;

   Address(String city1,String state1){
    city=city1;
    state=state1;
}
  void StdAddress(){
    System.out.println(" "+city+ "("+state+")");
  }
}
      

 class Student {
    int Rollno;
    String Name;
    Address addr=new Address("Pali"," Chhattisgarh");
    
   
    Student(String n,int rn){
        Name=n;
        Rollno=rn;
           
        
    }
    void details(){
        System.out.println(" " +Name);
        System.out.println(" " +Rollno);
        addr.StdAddress();
        
    }
}
    public class MainApp1 {
    
    
   public static void main(String[] args) {
        
        Student std1=new Student("Shubhangi Padwar",45);
        std1.details();

    
        
    }}
    

