package homework04;
/*
Задача 1. Для введенной с клавиатуры буквы английского алфавита
нужно вывести слева стоящую букву на стандартной клавиатуре. При этом
клавиатура замкнута, т.е. справа от буквы «p» стоит буква «a», а слева от "а"
буква "р", также соседними считаются буквы «l» и буква «z», а буква «m» с
буквой «q».
Входные данные: строка входного потока содержит один символ —
маленькую букву английского алфавита.
Выходные данные: следует вывести букву стоящую слева от заданной
буквы, с учетом замкнутости клавиатуры.
 */
import java.util.Scanner;

public class KeyboardTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите букву: ");
        char input = scanner.next().charAt(0);
        if (!Character.isLowerCase(input)) {
            System.err.println("Введена не маленькая английская буква!");
            return;
        }
        String keyboard = "qwertyuiopasdfghjklzxcvbnm";
        int index = keyboard.indexOf(input);
        if (index == -1) {
            System.err.println("Такой буквы нет на клавиатуре!");
            return;
        }
        index--; // Переходим к предыдущей букве
        if (index < 0) {
            index = keyboard.length() - 1; // Если дошли до конца, переходим к началу
        }
        System.out.println("Буква слева: " + keyboard.charAt(index));
    }
}