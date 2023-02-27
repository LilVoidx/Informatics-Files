package lab.lab02;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){

        int[] a = {-46 , 9 , 78 , 6 , -12 , 67};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

            Person[] persons = {
            new Person ("Kate",40,true),
            new Person ("Dan", 24,true),
            new Person ("Vasya",19,false),
            new Person ("Max",27,false)
        };

        Arrays.sort(persons);
        System.out.println(Arrays.toString(persons));

        Person oldest = persons[0];
        for (int i = 0; i < persons.length; i++) {
            if(persons[i].compareTo(oldest) > 0)
            oldest = persons[i];
        }
        System.out.println("The oldest : " + oldest);
    }
}
