package homework03;

class App {
    public static void main(String[] args) {
        // Создание нескольких экземпляров класса TV
        TV tv1 = new TV("Samsung QE55Q60BAU", 55, true);
        TV tv2 = new TV("LG 43UN71006LA", 43, false);
        TV tv3 = new TV("Xiaomi 43a", 1050, true);

        // Вывод информации о телевизорах
        System.out.println(tv1);
        System.out.println(tv2);
        System.out.println(tv3);
    }
}