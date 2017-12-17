package arrays;

import java.util.Scanner;

/**
 * Created by Iridium on 12/17/2017.
 */
public class LECANDY {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-->0){
            int n = scanner.nextInt();
            int c = scanner.nextInt();
            int A[] = new int[n];

            for(int i = 0;i<n;i++)
                A[i] = scanner.nextInt();
            System.out.println(solve(A,c));
        }
    }

    public static String solve(int[] A,int C){
        for(int a:A){
            C-=a;
            if(C<0)
                return "No";
        }
        return "Yes";
    }
}
