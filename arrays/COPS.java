package arrays;

import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * Created by Iridium on 12/17/2017.
 */
public class COPS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();
        while (T-->0){
            int M=scanner.nextInt(),x = scanner.nextInt(),y=scanner.nextInt();
            PriorityQueue<Integer> cops= new PriorityQueue<Integer>();
            while (M-->0)
                cops.add(scanner.nextInt());
            System.out.println(solve(x*y,cops));
        }
    }

    private static int solve(int range, PriorityQueue<Integer> cops) {
        boolean houses[] = new boolean[101];

        while (!cops.isEmpty()){
            int cop = cops.poll();
            int low = cop-range;
            if(low < 1)
                low = 1;

            int high = cop+range;
            if(high>100)
                high = 100;

            while(low<=high)
                houses[low++] = true;
        }

        int house = 0;
        for(int i =1;i<=100;i++)
            if(!houses[i])
                house++;
        return house;
    }
}
