package arrays;

import java.util.Scanner;

/**
 * Created by Iridium on 12/17/2017.
 */
public class CHN15A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0) {
            int n = scanner.nextInt();
            int t = scanner.nextInt();
            int k = 0;
            while (n-- > 0) {
                int x = scanner.nextInt();
                if (( (x + t) % 7) == 0)
                    k++;
            }
            System.out.println(k);
        }
    }
}
