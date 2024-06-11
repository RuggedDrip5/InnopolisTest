package basic1_7.example1;

//Класс лампочка
public class Bulb {
    private boolean toggle;

    public Bulb() {
        this.toggle = false;
    }

    public Bulb(boolean toggle) {
        this.toggle = false;
    }

    public boolean isShining(){
        return this.toggle;
    }

    public void turnOn() {
        this.toggle = true;
    }

    public void turnOff() {
        this.toggle = false;
    }
}
