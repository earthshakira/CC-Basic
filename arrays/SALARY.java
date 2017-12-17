package arrays;

import java.util.*;

/**
 * Created by Iridium on 12/17/2017.
 */
public class SALARY {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        while (T-- > 0) {
            int n = scanner.nextInt();
            int arr[] = new int[n];
            while (n-- > 0) {
                arr[n] = scanner.nextInt();
            }
            System.out.println(new Calculate(arr).calculate());
        }

    }
}

class Pair{
    int a,b;

    public Pair(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getKey() {
        return a;
    }

    public int getValue() {
        return b;
    }
}
class Calculate {
    int[] salaryList;
    int turns;

    public Calculate(int[] list) {
        this.salaryList = list;
        turns = 0;
    }


    public int calculate() {
        if(salaryList.length == 1)
            return turns;
        while(true) {
            Pair maxes = getMaxIndexes();
            if (maxes.getValue() < 0) {
                return turns;
            }
            int first = salaryList[maxes.getKey()];
            int second = salaryList[maxes.getValue()];
            turns += first - second;
            incrBy(first - second, maxes.getKey());
        }
    }

    Pair getMaxIndexes(){
        int maxi = 0,max2i=-1;
        int max1 = salaryList[0];
        int max2 = -1;
        for(int i = 1;i<salaryList.length;i++){
            if(salaryList[i]>max1){
                max2 = max1;
                max2i = maxi;
                max1 = salaryList[i];
                maxi = i;
            }else if(salaryList[i]!=max1 && salaryList[i]>max2){
                max2i = i;
                max2 = salaryList[i];
            }
        }
        return new Pair(maxi,max2i);
    }

    void incrBy(int n,int exclude){
        for(int i=0;i<salaryList.length;i++){
            salaryList[i]+=n;
        }
        salaryList[exclude]-=n;
    }

}
