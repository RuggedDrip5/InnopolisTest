package Home2;

import java.util.Scanner;

public class Mathpath {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите 1-е целое число: ");
        int FN = scanner.nextInt();
        System.out.print("Введите второе целое число: ");
        int SN = scanner.nextInt();

        System.out.println("Сумма: " + (FN + SN));
        System.out.println("Разность: " + (FN - SN));
        System.out.println("Произведение: " + (FN * SN));
        System.out.println("Среднее значение: " + ((FN + SN) / 2));
        System.out.println("Расстояние (разница между целыми числами): " + Math.abs(FN - SN));
        System.out.println("Максимум (большее из двух целых чисел): " + (FN > SN ? FN : SN));
        System.out.println("Минимум (меньшее из двух целых чисел): " + (FN < SN ? FN : SN));
    }
}