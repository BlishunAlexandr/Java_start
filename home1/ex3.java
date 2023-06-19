package home1;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Double number = null;
        String sign = null;
        double result = 0;
        Scanner iScanner = new Scanner(System.in);
        
        System.out.println("Введите первое число: ");
        result = iScanner.nextDouble();
        
        while (true) {
            System.out.println("Введите знак операции (+, -, *, /) или = для получения результата: ");
            sign = iScanner.next();
            
            if (sign.equals("=")) {
                break;
            }
            
            System.out.println("Введите число: ");
            number = iScanner.nextDouble();
            
            switch (sign) {
                case "+":
                    result += number;
                    break;
                case "-":
                    result -= number;
                    break;
                case "*":
                    result *= number;
                    break;
                case "/":
                    if (number != 0) {
                        result /= number;
                    } else {
                        System.out.println("Ошибка: Деление на ноль!");
                    }
                    break;
                default:
                    System.out.println("Ошибка: Неверный знак операции!");
                    break;
            }
        }
        
        System.out.println("Результат: " + result);
    }
}