// Emmanuel
/*
 Notes 
**************
  Data type= The type of the data. How the computer interprets the data.
  Statically typed = variables are given data types up front.
  dynamically typed = variables do not have types.
  objects = this is the instance of a class ( class the data type )
  primitive types = boolean, byte, char, short, int, long, float, double, casting.


*/



import java.util.Scanner;

public class Greeting {  // This is a class and this class name is called Hello World.


    public static void main(String[] args) {  // Step #1 this is a method.  you can create an object with out using the static key world.
        System.out.println("what is your name ?" ); //statement
        
        //type(scanner) identifier = new type();
        Scanner scanner = new Scanner(System.in); // Using this line to have the user type in the data of their name

        String fname = scanner.nextLine(); // This line helps to save the input of the user and give it to (name)
        String lname = scanner.nextLine();

        System.out.println(" Good Morning "+ fname + "" +""+ lname + " Hope you are doing well today !");

        //Now using the data type int
        int x = 10; // primitive
        Integer y = 10; //object (10 is autoboxed to y)
        System.out.println(x + y);
        System.out.println(y +x);

        //variable - stores some value
        // + sign is an operatior

        // Different type of string. --> new string makes you create a defult string.
        String string = new String("Is rainning out side");

        String rain =" make sure to wear your coat .."; // This is the value which is a litral.

        System.out.println(string + " " + rain); // This is an expression --> evaluates to a value
        

    }
     
}

    

