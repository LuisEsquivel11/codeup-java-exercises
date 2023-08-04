public class PersonTest {

    public static void main(String[] args) {

        Person myPerson = new Person("Franklin");
        System.out.println(myPerson.getName());

        myPerson.setName("Benjamin");
        System.out.println(myPerson.getName());
    }
}
