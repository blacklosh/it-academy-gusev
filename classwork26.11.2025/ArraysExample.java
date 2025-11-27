import java.util.Scanner;

public class ArraysExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = n-1; i >= 0; i--) {
            arr[i] = n - i;
        }

        for(int x : arr) {
            System.out.print(x + " ");
        }
    }
}
