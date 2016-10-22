package lan.rus.objects;

/**
 * Created by ruslan on 22.10.2016.
 */

public class Person {
    private String name;
    private int age;
    private Adress adress;

    public Person(String name,int age,Adress adress){
        setName(name);
        setAge(age);
        setAdress(adress);
    }

    public void print(){
        Utils.print(getName());
        Utils.print(String.valueOf(getAge()));
       getAdress().print();
        Utils.print("============================");
    }

    private String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    private int getAge() {
        return age;
    }

    private void setAge(int age) {
        this.age = age;
    }


    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }
}
