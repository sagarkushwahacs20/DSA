import java.util.*;
public class SelectionSort {
    void selectionsort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] < arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        
    }
    public static void main(String[] args) {
        SelectionSort obj = new SelectionSort();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size :");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        obj.selectionsort(arr);
        System.out.println("Array : ");
        for (int i = n-1; i >= 0; i--) {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
