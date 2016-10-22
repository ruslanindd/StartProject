package lan.rus.objects;

import javax.rmi.CORBA.Util;

/**
 * Created by ruslan on 22.10.2016.
 */
public class Person {
    private String name;
    private int age;
    private String adress;

    public Person(String name,int age,String adress){
        setName(name);
        setAge(age);
        setAdress(adress);
    }

    public void print(){
        Utils.print(getName());
        Utils.print(String.valueOf(getAge()));
        Utils.print(getAdress());
        Utils.print("============================");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
