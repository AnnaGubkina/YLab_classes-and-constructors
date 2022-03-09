package tasks1;

public class Main {
    // Задачи на создание своих классов и объектов
    public static void main(String[] args) {


        //4. Создать три объекта типа tasks1.Cat
        Cat cat1 = new Cat(2,"Semen", 5,7);
        Cat cat2 = new Cat(9,"Baks", 7,5);
        Cat cat3 = new Cat(1,"Knopa", 2,3);

        //5. Провести три боя попарно между котами
        //Создать три кота используя класс tasks1.Cat.
        //Провести три боя попарно между котами.
        //Класс tasks1.Cat создавать не надо. Для боя использовать метод boolean fight(tasks1.Cat anotherCat).
        //Результат каждого боя вывести на экран.

        if(cat1.fight(cat2)){
            System.out.println(cat1.getName() + " победил " + cat2.getName());
        }else{
            System.out.println(cat2.getName() + " победил " + cat1.getName());
        }
        if(cat1.fight(cat3)){
            System.out.println(cat1.getName() + " победил " + cat3.getName());
        }else{
            System.out.println(cat3.getName() + " победил " + cat1.getName());
        }
        if(cat3.fight(cat2)){
            System.out.println(cat3.getName() + " победил " + cat2.getName());
        }else{
            System.out.println(cat2.getName() + " победил " + cat3.getName());
        }
    }
}
