package Lab_programs;

public class Odd_hallow_square {
    public static void main(String[] args) {
        int num = 1;
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.printf("%-4d", num);
                    num += 2;
                } else {
                    System.out.print("    ");
                }
            }
            System.out.println();
        }
    }
}