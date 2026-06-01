public class Selectionsort {
    public static void main(String[] args) {
        
        String[] arr={"amit","deepak","rahul","sumit","mohan"};
        
        for(int i=0;i<arr.length;i++){

            int min=i;
            for(int j=i+1;j<arr.length;j++){

                if(arr[min].compareTo(arr[j]) >0){

                   min=j;
                }
            }
            String temp=arr[min];
                arr[min]=arr[i];
                arr[i]=temp;
        }
        for (String no : arr) {

            System.out.print(no+" ");
            
        }
    }
    
}
