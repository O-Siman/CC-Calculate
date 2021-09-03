import java.util.Scanner;

public class Start {
    public static void start() {

        say("Hello there, what's your name?");

        String name = getLine();

        if (isEqual(name, "Omar"))
            say("You rock!");
        
        else say("Hello, " + name);

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
