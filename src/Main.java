import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Start coding here!

        say("What's your name?");
        String name = getLine();
        // Player types their name

        say(name + " walks into a cave. There is a giant spider on the left and a tunnel on the right.");
        // Example output: Omar walks into a cave...
        say("Do you go left or right?");
        String choice = getLine();
        // Player types "left" or "right"

        if (isEqual(choice, "left")) {
            // If they chose to go to the left
            say("The spider eats you. The end!");
            return; // End the game
        } else if (isEqual(choice, "right")) {
            // If they chose to go to the right
            say("You continue walking through the tunnel.");
        } else {
            // If they didn't choose
            say("Please say left or right.");
            return; // End the game
        }

        say("You see a snake on the left and another tunnel on the right.");
        say("Do you go left or right?");
        String choice2 = getLine();
        // Player types "left" or "right"

        if (isEqual(choice2, "left")) {
            // If they chose to go to the left
            say("The snake eats you. The end!");
            return; // End the game
        } else if (isEqual(choice2, "right")) {
            // If they chose to go to the right
            say("You reached the end of the cave! The end.");
            return;
        } else {
            // If they didn't choose
            say("Please say left or right.");
            return; // End the game
        }




        // Don't touch anything below here.
    }






    private static final Scanner scanner = new Scanner(System.in);

    public static String getLine() {
        return scanner.nextLine();
    }

    public static boolean isEqual(Object object1, Object object2) {
        String object1String;
        String object2String;

        if (!(object1 instanceof String))
            object1String = String.valueOf(object1);
        else
            object1String = (String) object1;

        if (!(object2 instanceof String))
            object2String = String.valueOf(object2);
        else
            object2String = (String) object2;


        return object1String.equals(object2String);
    }

    public static void say(String message) {
        System.out.println(message);
    }
}
