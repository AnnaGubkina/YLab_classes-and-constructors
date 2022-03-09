package tasks1;

// Задачи на создание своих классов и объектов
//1. Создать класс tasks1.Cat. У кота должно быть имя (name, String), возраст (age, int),
// вес (weight, int), сила (strength, int).

public class Cat {

    private final int age;
    private final String name;
    private final int weight;
    private final int strength;

    public Cat(int age, String name, int weight, int strength) {
        this.age = age;
        this.name = name;
        this.weight = weight;
        this.strength = strength;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getStrength() {
        return strength;
    }

    //2.Реализовать метод boolean fight(tasks1.Cat anotherCat): реализовать механизм драки котов в зависимости от их веса,
    // возраста и силы. Зависимость придумать самому. Метод должен определять, выиграли ли мы (this) бой или нет,
    // т.е. возвращать true, если выиграли и false - если нет.
    //Должно выполняться условие:
    //если cat1.fight(cat2) == true , то cat2.fight(cat1) == false
    public static void main(String[] args) {
        //2.Реализовать метод boolean fight(tasks1.Cat anotherCat)
        Cat cat1 = new Cat(2, "Tomas", 5, 7);
        Cat cat2 = new Cat(5, "Vasya", 6, 6);
        System.out.println(cat1.fight(cat2));
        System.out.println(cat2.fight(cat1));
    }

        boolean fight(Cat anotherCat) {
        if (this.weight > anotherCat.weight && this.age < anotherCat.age && this.strength > anotherCat.strength) {
            return true;
        } else if (this.weight < anotherCat.weight && this.age < anotherCat.age && this.strength > anotherCat.strength){
            return true;
        } else if (this.weight > anotherCat.weight && this.age > anotherCat.age && this.strength > anotherCat.strength) {
            return true;
        } else {
            return false;
        }


    }
}