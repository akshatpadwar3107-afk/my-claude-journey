public class Bubblesort {
    public static void main(String[] args) {
        
        int[] arr={55,32,44,25,16};
        int leng=arr.length;
        int temp;

        for(int i=1;i<leng;i++){
            boolean swapped=false;

            for(int j=0;j<leng-i;j++){

                if (arr[j] > arr[j+1]) {

                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;


                    
                }
            }
            if (swapped==false) {
                break;
                
            }
        }
        for (int no : arr) {
            System.out.print(+no+ " ");
            
        }
       
    }
    
}
