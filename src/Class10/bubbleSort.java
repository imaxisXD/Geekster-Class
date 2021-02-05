package Class10;
import java.util.*;

public class bubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of an array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        int i;
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // n-1 iteration
        for (i = 0; i < n - 1; i++) {
            // n-1-i iteration
            for (int j = 0; j < n - 1 - i; j++) {
                //compare adjacent element
                if (arr[j] > arr[j + 1]) {
                    //swap the elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }
        System.out.println("Sorted array is :");
        for(i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
}