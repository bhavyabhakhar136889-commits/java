import java.util.Scanner;

public class Threearray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 2 blocks, 2 rows, 2 columns
        int[][][] arr = new int[2][2][2];

        System.out.println("Enter 8 elements:");

        // Input
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    arr[i][j][k] = sc.nextInt();
                }
            }
        }

        // Display
        System.out.println("3D Array Elements:");

        for (int i = 0; i < 2; i++) {
            System.out.println("Block " + (i + 1) + ":");
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.println();
            }
        }

        sc.close();
    }
}
