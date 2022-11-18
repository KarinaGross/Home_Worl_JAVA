package home_work_6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Task1 {
    public static void main(String[] args) {
        Cat cat1 = new Cat(1, "Барсик", "рыжий", 2);
        Cat cat2 = new Cat(2, "Борис", "полосатый", 1);
        Cat cat3 = new Cat(1, "Барсик", "рыжий", 2);
        Cat cat4 = new Cat(3, "Василий", "серый", 2);
        Cat cat5 = new Cat(4, "Чубака", "коричневый", 4);
        Cat cat6 = new Cat(5, "Бегемот", "черный", 7);
        Cat cat7 = new Cat(5, "Бегемот", "черный", 7);
        
        Set<Cat> catSet = new HashSet<>(Arrays.asList(cat1, cat2, cat3, cat4, cat5, cat6, cat7));

        System.out.println(catSet);
        System.out.println(cat1.equals(cat3));
    }
}

class Cat {
    private int id;
    private String name;
    private String color;
    private int age;

    public Cat(int id, String name, String color, int age) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("имя:%s, цвет:%s, возраст:%d", name, color, age); 
    }

    @Override
    public boolean equals(Object obj) {
        var c = (Cat) obj;
        return id == c.id && name == c.name && color == c.color && age == c.age;
    }

    @Override
    public int hashCode() {
        return id;
    }



}
