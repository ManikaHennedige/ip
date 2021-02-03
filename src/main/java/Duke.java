import java.util.Scanner;

public class Duke {

    public static void main(String[] args) {
        UI.showWelcomeScreen();
        Scanner sc = new Scanner(System.in);
        String input;

        do {
            input = sc.nextLine();
            switch (input) {
            case "list":
                System.out.println("This is your current list:");
                for (int i = 0; i < Task.getTaskCounter(); i++){
                    int displayedTask = i + 1;
                    System.out.println(displayedTask + ": " + Task.getTaskList()[i]);
                }
                UI.showDivider();
                break;
            case "bye":
                System.out.println(UI.divider);
                System.out.println("Bye! Hope to hear from you again soon!");
                System.out.println(UI.divider);
                break;
            default:
                // todo make the heavy lifting be done by another processing class instead of here
                Parser.processTask(input);

            }
        } while (!input.equals("bye"));


    }
}
