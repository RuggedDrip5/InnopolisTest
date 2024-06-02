package Home2;

import java.util.Scanner;

import static java.lang.System.*;

public class Repetitions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        out.print("Введите строку: ");
        String inputString = scanner.nextLine();
        out.print("Введите количество повторений: ");
        int repetitions = scanner.nextInt();

        for (int i = 0; i < repetitions; i++) {
            out.print(inputString);
        }
    }
}
