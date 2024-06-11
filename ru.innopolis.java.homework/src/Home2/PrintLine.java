package Home2;

import java.util.Scanner;

public class PrintLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число строк и столбцов сетки: ");
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        System.out.print("Введите повторяемый элемент сетки: ");
        String element = scanner.next();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("%s ", element);
            }
            System.out.println();
        }
    }
}
