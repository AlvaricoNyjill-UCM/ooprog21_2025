import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name > ");
        String name = sc.nextLine();

        if (name.equals("Carmen"))
            System.out.println("Carmen equals Carmen");
        else
            System.out.println("Carmen does not equal Carmen");
    }
}
