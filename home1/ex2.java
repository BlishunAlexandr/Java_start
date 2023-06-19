package home1;

import java.io.Console;

import javax.sound.sampled.SourceDataLine;

public class ex2 {
    public static void main(String[] args) {
        for (int number = 2; number <= 1000; number++) {
            boolean isPrime = true;

            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(number);
            }
        }
    }
}
