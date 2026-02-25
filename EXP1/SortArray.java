import java.util.Scanner;
import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);  // Sort array in ascending order

        System.out.println("Sorted numbers:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}
