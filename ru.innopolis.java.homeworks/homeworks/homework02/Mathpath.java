package homework02;

//Задача 2. Напишите программу на Java, которая принимает два целых
//числа от пользователя, а затем печатает сумму, разницу, произведение, среднее
//значение, расстояние (разница между целыми числами), максимум (большее из
//двух целых чисел), минимум (меньшее из двух целых чисел).
//Тестовые данные:
//      Введите 1-е целое число: 25
//      Введите второе целое число: 5
//      Ожидаемый результат :
//      Сумма двух целых чисел: 30
//      Разница двух целых чисел: 20
//      Произведение из двух целых чисел: 125
//      Среднее из двух целых чисел: 15,00
//      Расстояние двух целых чисел: 20
//      Максимальное целое число: 25
//      Минимальное целое число: 5

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