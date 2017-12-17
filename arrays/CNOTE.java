package arrays;

import java.util.Scanner;

/**
 * Created by Iridium on 12/17/2017.
 */
public class CNOTE {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0) {
            if(T==0){
                System.out.print(solve(scanner));
                return;
            }
            System.out.println(solve(scanner));
        }

    }

    public static String solve(Scanner scanner) {
        int poetry = scanner.nextInt(),
            pagesLeft = scanner.nextInt(),
            rubles = scanner.nextInt(),
            items = scanner.nextInt(),
                price,pages
        ;
        int requiredPages = poetry - pagesLeft;

        for(int i =0;i<items;i++){
            pages = scanner.nextInt();
            price = scanner.nextInt();
            if(rubles>=price && pages+pagesLeft>= poetry)
            return "LuckyChef";
        }

        return "UnluckyChef";
    }
}
