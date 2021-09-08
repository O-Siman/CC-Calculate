import java.util.Scanner;

public class Start {
    public static void start() {
        say("What's your name?");
        String name = getLine();

        say(name + " walks into a cave. There is a giant spider on the left and a tunnel on the right.");
        say("Do you go left or right?");
        String choice = getLine();

        if (isEqual(choice, "left")) {
            say("The spider eats you. The end!");
            return;
        } else if (isEqual(choice, "right")) {
            say("You continue walking through the tunnel.");
        } else {
            say("Please say left or right.");
            return;
        }

        say("You see a snake on the left and another tunnel on the right.");
        say("Do you go left or right?");
        String choice2 = getLine();

        if (isEqual(choice2, "left")) {
            say("The snake eats you. The end!");
            return;
        } else if (isEqual(choice2, "right")) {
            say("You reached the end of the cave! The end.");
            return;
        } else {
            say("Please say left or right.");
            return;
        }


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
