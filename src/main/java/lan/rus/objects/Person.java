package lan.rus.objects;

import lan.rus.types.petType;

/**
 * Created by ruslan on 22.10.2016.
 */

public class Person {
    private String name;
    private int age;
    private Adress adress;
    /**
     * имя кошки
     */
    private String catName;
    private petType pet;

    public Person(String name,int age,Adress adress){
        setName(name);
        setAge(age);
        setAdress(adress);
        setAdress(adress);
        setAdress(adress);
        setAdress(adress);
        setAdress(adress);

    }

    public void addPet(petType pet){
        setPet(pet);

        petType pt;
        switch (pt = getPet() ){

            case DOG:
                break;
            case CAT:
                break;
            case PARROT:
                break;
        }
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

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public petType getPet() {
        return pet;
    }

    public void setPet(petType pet) {
        this.pet = pet;
    }
}
