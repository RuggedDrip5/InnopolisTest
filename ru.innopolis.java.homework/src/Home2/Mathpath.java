package Home2;

import java.util.Scanner;

import static java.lang.System.*;

public class Mathpath {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        out.print("Введите 1-е целое число: ");
        int FN;
        FN = scanner.nextInt();
        out.print("Введите второе целое число: ");
        int SN;
        SN = scanner.nextInt();

        out.println("Сумма: " + (FN + SN));
        out.println("Разность: " + (FN - SN));
        out.println("Произведение: " + (FN * SN));
        out.println("Среднее значение: " + ((FN + SN) / 2));
        out.println("Расстояние (разница между целыми числами): " + Math.abs(FN - SN));
        out.println("Максимум (большее из двух целых чисел): " + (Math.max(FN, SN)));
        out.println("Минимум (меньшее из двух целых чисел): " + (Math.min(FN, SN)));
    }
}