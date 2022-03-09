package tasks3_constructors;
//1.Создать класс Friend (друг) с тремя конструкторами:
public class Friend {

    private String name;
    private int age;
    private String gender;


    public Friend(String name)
    {
        this.name = name;
    }

    public Friend( String name, int age)
    {
        this.name = name;
        this.age = age;

    }

    public Friend( String name, int age,String gender )
    {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}
