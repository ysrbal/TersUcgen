import java.util.Scanner;

public class reverseTriangle {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n;

        System.out.print("Basamak Sayisini Giriniz : ");
        n = inp.nextInt();

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= ((2 * i) - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
