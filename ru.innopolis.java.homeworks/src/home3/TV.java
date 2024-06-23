package home3;
/*
Формулировка задания:
Реализовать класс Телевизор. У класса есть поля, свойства и методы.
Проверить работу в классе App, методе main.
Обратить внимание на переопределение метода toString.
Ожидаемый результат:
1. Создан класс Телевизор;
2. У класса есть поля, свойства и методы. Поля желательно сделать
private. Задать новые значения полям класса можно через конструктор и setters.
3. В классе переопределен метод toString.
4. Создан класс App с методом main.
5. В методе main класса App создано несколько экземпляров класса
Телевизор и проверено, как распечатываются заполненные данные об
экземплярах класса.
6. Дополнительно. Задавать параметры класса Телевизор с клавиатуры
или случайным числом.
 */
    class TV {
        private String model;
        private int screenSize;
        private boolean smartTV;

        public TV(String model, int screenSize, boolean smartTV) {
            this.model = model;
            this.screenSize = screenSize;
            this.smartTV = smartTV;
        }

        public String getModel() {
            return model;
        }

        public int getScreenSize() {
            return screenSize;
        }

        public boolean isSmartTV() {
            return smartTV;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public void setScreenSize(int screenSize) {
            this.screenSize = screenSize;
        }

        public void setSmartTV(boolean smartTV) {
            this.smartTV = smartTV;
        }

        @Override
        public String toString() {
            return "Модель: " + model + ", размер экрана: " + screenSize + " дюймов, SmartTV: " + smartTV;
        }
    }

