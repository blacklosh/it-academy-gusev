public class ArraysExample3 {

    public static void main(String[] args) {
        int n = 8;
        int m = 16;

        int[][] arr = new int[n][m];
        for(int x = 0; x < m; x++) {
            for(int y = 0; y < n; y++) {
                arr[y][x] = y + x;
            }
        }

        for(int[] a : arr) {
            for(int x : a) {
                if(x < 10) {
                    System.out.print(" ");
                }
                System.out.print(x + " ");
            }
            System.out.println("");
        }
    }

    /**
     * Программа:
     * Считываем число N от пользователя (1 <= N <= 50)
     * Необходимо построить двумерный массив N * N
     * Заполнить полученный массив ""
     *
     * Пример N = 3
     * Массив:
     * 1 2 4
     * 3 5 7
     * 6 8 9
     */

}
