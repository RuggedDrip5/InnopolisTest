package homeworks.homework06;

import java.util.ArrayList;

public class Person {
    private String name;
    private int money;
    private ArrayList<Product> products;

    public Person(String name, int money) {
        this.name = name;
        this.money = money;
        products = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        if (money >= 0) {
            this.money = money;
        } else {
            throw new IllegalArgumentException("Деньги не могут быть отрицательными");
        }
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void addProduct(Product product) {
        if (product != null && money >= product.getCost()) {
            products.add(product);
        }
    }

    @Override
    public String toString() {
        return "Покупатель: " + name + ", деньги: " + money + ", продукты: " + products;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Person)) {
            return false;
        }
        Person person = (Person) obj;
        return name.equals(person.name) && money == person.money;
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + money;
        return result;
    }
}

