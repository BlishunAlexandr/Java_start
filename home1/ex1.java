package home1;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("число n: ");
        double n = iScanner.nextDouble();
        iScanner.close();
        int i = 2;
        int itog = 0;
        if (n == 1) System.out.println(1);
        if (n >= 2) {
            while (i < n + 2) {
                itog = itog - 1 + i;
                i++;
                System.out.println(itog);
            }
        }
    }
}
