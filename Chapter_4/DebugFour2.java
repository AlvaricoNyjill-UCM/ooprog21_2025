// This class uses a DebugPen class
// to instantiate two Pen objects
// One with default values
// and the other with user-supplied values

import java.util.Scanner;

public class DebugFour2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a color ink for the pen >> ");
        String color = input.nextLine();

        System.out.print("Enter a point size - fine, medium, or thick >> ");
        String point = input.nextLine();

        DebugPen pen1 = new DebugPen();

        DebugPen pen2 = new DebugPen(color, point);

        System.out.println("\nDefault value pen:");
        display(pen1);

        System.out.println("\nUser value pen:");
        display(pen2);
    }

    public static void display(DebugPen pen) {
        System.out.println("   The pen has ink color " + pen.getColor());
        System.out.println("      and a " + pen.getPoint() + " point.");
    }
}
