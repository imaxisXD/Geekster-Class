package Class10;
import java.util.*;

public class SelectionSort {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of arr");
        int n = sc.nextInt();
        int [] arr = new int[n];
        // input of arr
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        // selecting a min element and then swaping it with the mini element
        for (int p=0;p<n-1;p++){
            // selecting the min element [0th|[1,2,3,4,5]] 0th ele as min
            int min = p;
            for(int q=p+1;q<n;q++){
                // looping through all the element to find min and swap with 0th element
                if (arr[min]>arr[q]){
                    min = q;
             }
             swap(min,q,arr);
            }
    }// For displaying the array
        for(int z : arr){
            System.out.print(z+" ");
        }
}
// swap function
    private static void swap(int i, int i1, int []arr) {
        int temp = arr[i];
        arr[i] = arr[i1];
        arr[i1] = temp;
    }

    }
