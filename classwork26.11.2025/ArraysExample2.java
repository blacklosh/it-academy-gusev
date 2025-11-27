import java.util.Scanner;

public class ArraysExample2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            arr[i] = arr[i] % 2 == 0 ? arr[i]/2 : arr[i]*3;
        }

        for(int x : arr) {
            System.out.print(x + " ");
        }
    }
}
