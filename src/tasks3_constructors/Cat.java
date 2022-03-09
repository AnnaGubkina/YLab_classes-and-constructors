package tasks3_constructors;
//2. Создать класс Cat (кот) с пятью конструкторами
public class Cat {

    private String catName = null;
    private int catAge = 5;
    private int catWeight = 4;
    private String catColor = null;
    private String catAddress = null;


    public Cat(String name) {
        this.catName = name;
    }

    public Cat(String name, int weight, int age) {
        this.catName = name;
        this.catWeight = weight;
        this.catAge = age;
    }

    public Cat(String name, int age) {
        this.catName = name;
        this.catAge = age;
    }

    public Cat(int weight, String color) {
        this.catWeight = weight;
        this.catColor = color;

    }

    public Cat(int weight, String color, String address) {
        this.catWeight = weight;
        this.catColor = color;
        this.catAddress = address;

    }
}
