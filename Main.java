import java.util.Scanner;
/**
 * Help the user classify an animal
 * @author Thomas Quigley
 */
public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // ask if it has feathers or not
    System.out.println("Does the animal have feathers?");
    String feather = input.nextLine();
    
    if (feather.equals("yes")) {
      // the animal is a bird, ask if it swims or not
      System.out.println("Does the animal swim?");
      String swims = input.nextLine();
      
      if (swims.equals("yes")) {
        // the animal is a duck
        System.out.println("This is a duck");
      } else {
        // the animal is a hen
        System.out.println("This is a hen");
      }
    } else {
      // the animal is a reptile, ask if it has legs or not
      System.out.println("Does the animal have legs?");
      String legs = input.nextLine();
      if (legs.equals("yes")) {
        // the animal is a lizard
        System.out.println("This is a lizard");
      } else {
        // the animal is a snake
        System.out.println("This is a snake");
      }
    }
    
  }
}
