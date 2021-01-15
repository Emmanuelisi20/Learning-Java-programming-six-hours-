import java.math.BigDecimal;
import java.util.Scanner;

/*
  Emmanuel Isidahomen

  Notes.

  Conseant this are variable that cant be changed. eg: final int Y = 5; 
                                                       Y = 10;  this would give an error becasue Y cannot change.

      int x = 5; // two step process  : we can declare a variable by saying int x : we can initializing a variable by saying x = 5.
      boolean isPizzaBad = true;
      byte   b = 'C';
      byte   e = 127;
      char   a = 'E';
      short  s = -32768; // this is for small numbers.
      long   l = 747474874747l;  // working with longer number. : using L to show is a long number.
      float  f = 20.5f; // always have an F close to your float number.
      double d = 20.5; // This is just a regual double.

*/

public class numbers {

    // declaring a global variable that can be used everywhere in the program.
    public static final double PI = 3.14159; // Now PI is a GV that can be used everywhere in our program.


    public static void main(String[] args) {
     
        Scanner number = new Scanner(System.in); // This lets the user type in their data!

        // This is for the input of data in strings 
        String x = number.nextLine(); // new line provided 
        System.out.println(x);

        // This is for the input of data in ints 
        int y = number.nextInt(); // new number provided 
        System.out.println(y);

        // This is bigger deciemal points and we need to let the user write their data. : This can be a fixed way of working with money and is very reliable on decimal numbers.
        BigDecimal money = number.nextBigDecimal();
        System.out.println(money);

        // This is just to give you a True or false answer from your user.
        boolean T = number.nextBoolean();
        System.out.println(T);

        //casting is the ablity to change data types like int casing to double.
        // int x = (int)scanner.nextDouble();
        // System.out.println(x);

       


    }
}
