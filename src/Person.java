public class Person {
    private String name = "Luis";

    public static void main(String[] args) {

    }

    // Constructor
    public Person(String name) {
        this.name = name;
    }


    //Getter and setters
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello, " + name);
    }




}
