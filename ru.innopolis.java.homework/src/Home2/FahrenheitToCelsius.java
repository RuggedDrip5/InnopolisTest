package Home2;

import static java.lang.System.out;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        double fahrenheit = 212.0;
        double celsius = (fahrenheit - 32) / 1.8;
        out.println("Температура в градусах Цельсия: " + celsius);
    }
}
