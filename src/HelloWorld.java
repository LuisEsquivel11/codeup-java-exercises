public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.print("Hello");
        System.out.print(" World!");
        char myCharacter = 'c';  // A single Unicode character that’s stored in two bytes, need to use single quotes
//      Data Type     Bytes                 Description

//        byte	        1	    Very short integers from -128 to 127
//        short	        2	    Short integers from -32,768 to 32,767
//        int	        4	    Integers from -2,147,483,648 to 2,147,483,647
//        long	        8	    Long integers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
//        float	        4	    Single-precision, floating-point numbers from -3.4E38 to 3.4E38 with up to 7 significant digits
//        double	    8	    Double-precision, floating-point numbers from -1.7E308 to 1.7E308 with up to 16 significant digits
//        char	        2	    A single Unicode character that’s stored in two bytes
//        boolean	    1	    A true or false value
        System.out.println(" Java is \"fun\"");
        String str = "hello";
        System.out.printf("I will say something here: %s" , str);

        //variables

        int favNum = 12;
        boolean whateverIWant = true;
   //   boolean somethingElse = "true"; data-type has to match variable type
        String someString = "Hello again";
    }
}
