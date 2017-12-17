package arrays;

import java.util.Scanner;

/**
 * Created by Iridium on 12/17/2017.
 */
public class RAINBOWA {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        while(T-->0){
            int n = scanner.nextInt();
            int arr[] = new int[n];
            for(int i = 0;i<n;i++)
                arr[i] = scanner.nextInt();
            System.out.println(solve(arr));
        }
        
    }

    private static String solve(int[] a) {
        int i = 0,j=a.length-1;
        int prev = a[0];
        boolean flags[] = new boolean[8];
        flags[0] = true;
        while(i<=j){

            if(a[i]!=a[j] || a[i]<prev || a[i]>7 || a[j]>7 || a[i]< 1 || a[j] < 1){
                return "no";
            }

            flags[a[i]] = true;
            if(a[i]==7)
                break;

            prev=a[i];
            i++;
            j--;
        }
        while(i<j){
            if(a[i++]!=7)
                return "no";
        }
        for(i=1;i<flags.length;i++)
            if(!flags[i])
                return "no";
        return "yes";
    }
}
