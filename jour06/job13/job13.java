package jour06.job13;

import java.util.Scanner;

public class job13 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Saisir un nombre : ");
        int n = input.nextInt();

        for (int i = 0; i <= n; i ++) {
            if (i%2 == 0 && i != 0 ) {
                System.out.print(i + " - ");
            }
        }

        input.close();

    }
    
}