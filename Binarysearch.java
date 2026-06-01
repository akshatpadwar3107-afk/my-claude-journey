public class Binarysearch {
    public static void main(String[] args) {
        
        int[] arr={10,20,30,40,50,60,70,80,90};

        int li=0;
        int hi=arr.length-1;
        int element=100;
        boolean found=false;
        
        while (li <= hi) {
            

        int mid=(li + hi)/2;

        if(arr[mid] == element)
        {
            System.out.println("Element found at " +mid+ " index position");
            found=true;
            break;
        }
        if(element > arr[mid]){
            li = mid + 1;
        }
        else{
            hi = mid - 1;
        }
    }
    if (!found) {
        System.out.println("Element not found");
        
    }

    }
    
}
