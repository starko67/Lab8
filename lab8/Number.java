package lab8;
import java.util.Scanner;
public class Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество членов последовательности (n): ");
        int n = scanner.nextInt();

        int currentNumber = 1; // Текущее число последовательности
        int count = 0; // Счетчик для повторений текущего числа

        for (int i = 0; i < n; i++) {
            if (count < currentNumber) {
                System.out.print(currentNumber + " ");
                count++;
            } else {
                currentNumber++;
                count = 1;
                System.out.print(currentNumber + " ");
            }
        }
    }
}





