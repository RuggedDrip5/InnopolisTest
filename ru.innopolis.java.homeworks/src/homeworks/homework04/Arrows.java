package homework04;
/*
Задача 2. Задана последовательность, состоящая только из символов ‘>’,
‘<’ и ‘-‘. Требуется найти количество стрел, которые спрятаны в этой
последовательности. Стрелы – это подстроки вида ‘>>-->’ и ‘<--<<’.
Входные данные: в первой строке входного потока записана строка,
состоящая из символов ‘>’, ‘<’ и ‘-‘ (без пробелов). Строка может содержать до
106 символов.
Выходные данные: в единственную строку выходного потока нужно
вывести искомое количество стрелок.
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Arrows {
    public static void main(String[] args) {
        String input = ">>-->>-->>->>-->>-->>-->>--><--<<--<<--<<>>-->>-->><--<--<<--<<--<>>--><>>-->>>--<--<<--<<--<<>>--><>>-->>"; // Пример входной строки
        Pattern pattern1 = Pattern.compile(">>-->");
        Pattern pattern2 = Pattern.compile("<--<<");
        int count1 = 0, count2 = 0;
        Matcher matcher1 = pattern1.matcher(input);
        Matcher matcher2 = pattern2.matcher(input);
        while (matcher1.find()) {
            count1++;
        }
        while (matcher2.find()) {
            count2++;
        }
        System.out.println("Количество стрелок >>-->: " + count1);
        System.out.println("Количество стрелок <--<<: " + count2);
    }
}