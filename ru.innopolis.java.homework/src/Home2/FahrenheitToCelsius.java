package Home2;
//Задача 1. Напишите Java-программу для преобразования температуры из
//Фаренгейта в градусы Цельсия.
//Тестовые данные:
//        Введите степень в градусах Фаренгейта: 212
//        Ожидаемый результат :
//        212.0 градусов по Фаренгейту равна 100.0 по Цельсию


import static java.lang.System.*;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        double fahrenheit = 212.0;
        double celsius = (fahrenheit - 32) / 1.8;
        out.println("Температура в градусах Цельсия: " + celsius);
    }
}
