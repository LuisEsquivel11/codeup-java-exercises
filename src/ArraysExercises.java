import java.lang.reflect.Array;
import java.util.Arrays;


public class ArraysExercises {

    public static void main(String[] args) {

        Person people[] = new Person[3];

        people[0] = new Person("Luis");
        people[1] = new Person("John");
        people[2] = new Person("Makee");

        for (int i = 0; i < people.length; i++ ) {
            System.out.println(people[i].getName());
        }

        Person[] morePeople = addPerson(people, new Person("luis"));
            for (int i = 0; i < morePeople.length; i++) {
                System.out.println(morePeople[i].getName());
            }

    }

    public static Person[] addPerson(Person[] people, Person personToAdd) {
        Person[] newArray = Arrays.copyOf(people, people.length + 1);
        newArray[newArray.length - 1] = personToAdd;
        return newArray;
    }
}
