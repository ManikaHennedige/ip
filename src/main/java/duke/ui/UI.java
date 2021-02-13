package duke.ui;

import duke.task.Task;

public class UI {
    public static String logo = " ____        _        \n"
            + "|  _ \\ _   _| | _____ \n"
            + "| | | | | | | |/ / _ \\\n"
            + "| |_| | |_| |   <  __/\n"
            + "|____/ \\__,_|_|\\_\\___|\n";

    public static String divider = "-----------------------------------";

    public static void showWelcomeScreen() {
        System.out.println("Hello from\n" + logo);
        System.out.println(divider);
        System.out.println("Hello there! I'm duke.controller.Duke");
        System.out.println("I have the high ground! How may I help you?");
        System.out.println(divider);
    }

    public static void showDivider() {
        System.out.println(divider);
        System.out.println("What is thy bidding, my master?");
        System.out.println(divider);
    }

    public static void taskAddedSuccessfully() {
        System.out.println("Roger Roger. The following task has been added:");
        System.out.println(Task.getLatestTask(false));
        System.out.println("You now have " + Task.getTaskCounter() + " tasks in your list!");
        UI.showDivider();
    }

    public static void taskCompletedSuccessfully() {
        System.out.println("The Force is with you! The following task has been marked as done:");
        System.out.println(Task.getLatestTask(true));
        System.out.println("You still have " + Task.getRemainingTasks() + " tasks to complete in your list!");
        UI.showDivider();
    }
}