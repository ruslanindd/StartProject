package lan.rus.tests;

import lan.rus.objects.Person;
import lan.rus.objects.Utils;

/**
 * Created by ruslan on 22.10.2016.
 */
public class Start {

    public static void main (String [] args){
        Utils.print("Start test");

        Person person_1 = new Person("Ruslan",39,"Vakyl 2");
        Person person_2 = new Person("Galina",35,"Vakyl 2");
        Person person_3 = new Person("Katya",9,"Vakyl 2");

        person_1.print();

        person_2.print();

        person_3.print();


        Utils.print("Stop test test");
    }
}
