class Test{

    int i;
    void M1(int a){

        i=a;
}
 

    void M2(){

         System.out.println(i);
    }
    }
 

public class Mainapps {
    public static void main(String[] args) {

        Test obj=new Test();
        obj.M1(10);
        

    }
    
}
