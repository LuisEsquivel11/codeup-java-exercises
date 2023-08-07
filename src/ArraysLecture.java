public class ArraysLecture {

    public static void main(String[] args) {
        // Declaring an array
        String[] names;

        // Create names array with a set length
        names = new String[4];

        // you could also declare it like this
//        String[] names = {
//                "Dave",
//                "Luis",
//                "Guy",
//                "Dude"
//        };


        // You do not have to fill the array in order
        names[2] = "Dave";
        names[1] = "Luis";
        names[0] = "Guy";
        names[3] = "Dude";

        for (String name : names) {
            System.out.println(name);
        }

        // Arrays.fill will replace the default value
//        String[] names = new String[6];
//        Arrays.fill(names, "John Smith");
//        System.out.println(Arrays.toString(names));

        // Arrays.copyOf
//        String[] namesCopy = Arrays.copyOf(names, names.length);
    }
}
