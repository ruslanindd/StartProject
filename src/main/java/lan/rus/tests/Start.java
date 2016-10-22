package lan.rus.tests;

import lan.rus.objects.Adress;
import lan.rus.objects.Person;
import lan.rus.objects.Utils;

/**
 * Created by ruslan on 22.10.2016.
 */
public class Start {

    public static void main (String [] args){
        Utils.print("Start test");

        Person person_1 = new Person("Ruslan",39,new Adress("Dnepr","Vak","222"));
        Person person_2 = new Person("Galina",35,new Adress("Dnepr","Vak","3333"));
        Person person_3 = new Person("Katya",9,new Adress("Dnepr","Vak","4444444"));

        person_1.print();

        person_2.print();

        person_3.print();


        Utils.print("Stop test test");
    }
}
