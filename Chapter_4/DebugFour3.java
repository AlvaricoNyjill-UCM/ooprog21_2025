// This class uses a DebugBox class
// to instantiate two Box objects
import java.util.Scanner;

public class DebugFour3 {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      int w, l, h;

      System.out.print("Enter width of box >> ");
      w = input.nextInt();

      System.out.print("Enter length of box >> ");
      l = input.nextInt();

      System.out.print("Enter height of box >> ");
      h = input.nextInt();
      
      DebugBox box1 = new DebugBox();
      DebugBox box2 = new DebugBox(w, l, h);

      System.out.println("\nThe dimensions of the first box are: " + box1.showData());
      System.out.println("  The volume of the first box is: " + box1.getVolume());

      System.out.println("\nThe dimensions of the second box are: " + box2.showData());
      System.out.println("  The volume of the second box is: " + box2.getVolume());
   }
}
