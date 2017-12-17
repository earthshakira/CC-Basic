package arrays;

import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by Iridium on 12/17/2017.
 */
public class FRGTNLNG {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-->0){
            int k = scanner.nextInt(),n = scanner.nextInt();
            String dic[] = new String[k];
            HashSet<String> phrasewords = new HashSet<String>();
            for(int i = 0 ;i<k;i++)
                dic[i] = scanner.next();

            while(n-->0){

                String[] phrase = new String[scanner.nextInt()];
                for(int i = 0;i<phrase.length;i++)
                    phrasewords.add(scanner.next());
            }
            for(String t:dic){
                if(phrasewords.contains(t))
                    System.out.print("YES ");
                else System.out.print("NO ");
            }
            System.out.println();
        }

    }
}
