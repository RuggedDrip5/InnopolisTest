package basic1_7.example1;

/*
Создать класс, описывающий лампочку.
Нужно учесть ее состояние
 */
public class Main {
       public static void main(String[] args) {
        Bulb bulb = new Bulb();
        System.out.println(Bulb.isShining());
        Bulb bulb1 = new Bulb(toggle: true);
        System.out.println(bulb1.isShining());
        bulb1.turnOff();
        System.out.println(bulb1.isShining());
    }
}
