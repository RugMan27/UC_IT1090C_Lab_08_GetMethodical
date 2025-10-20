import java.util.Scanner;

public class SafeInput {
    public static String getNonZeroLenString(Scanner pipe, String prompt) {
        while (true) {
            System.out.print(prompt + ": ");
            String input = pipe.nextLine();
            if (input.length() > 0) {
                return input;
            } else {
                System.out.println("You must enter a non-zero length input!");
            }
        }
    }

    public static int getInt(Scanner pipe, String prompt) {
        while (true) {
            System.out.print(prompt + ": ");
            if (pipe.hasNextInt()) {
                int val = pipe.nextInt();
                pipe.nextLine();
                return val;
            } else {
                System.out.println("You must enter a valid integer!");
                pipe.nextLine();
            }
        }
    }

    public static double getDouble(Scanner pipe, String prompt) {
        while (true) {
            System.out.print(prompt + ": ");
            if (pipe.hasNextDouble()) {
                double val = pipe.nextDouble();
                pipe.nextLine();
                return val;
            } else {
                System.out.println("You must enter a valid double!");
                pipe.nextLine();
            }
        }
    }

    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
        while (true) {
            System.out.print(prompt + " [" + low + "-" + high + "]: ");
            if (pipe.hasNextInt()) {
                int input = pipe.nextInt();
                pipe.nextLine();
                if (input >= low && input <= high) {
                    return input;
                }
                System.out.println("You must enter within the range " + low + " to " + high + "!");
            } else {
                System.out.println("You must enter a valid integer!");
                pipe.nextLine();
            }
        }
    }

    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high) {
        while (true) {
            System.out.print(prompt + " [" + low + "-" + high + "]: ");
            if (pipe.hasNextDouble()) {
                double input = pipe.nextDouble();
                pipe.nextLine();
                if (input >= low && input <= high) {
                    return input;
                }
                System.out.println("You must enter within the range " + low + " to " + high + "!");
            } else {
                System.out.println("You must enter a valid double!");
                pipe.nextLine();
            }
        }
    }

    public static boolean YNConfirm(Scanner pipe, String prompt) {
        while (true) {
            String input = getNonZeroLenString(pipe, prompt + " [Y/N]");
            if (input.equalsIgnoreCase("Y")) {
                return true;
            } else if (input.equalsIgnoreCase("N")) {
                return false;
            } else {
                System.out.println("You must enter Y or N!");
            }
        }
    }

    public static String getRegExString(Scanner pipe, String prompt, String regEx) {
        while (true) {
            System.out.print(prompt + ": ");
            String input = pipe.nextLine();
            if (input.matches(regEx)) {
                return input;
            } else {
                System.out.println("You must enter using the correct pattern!");
            }
        }
    }
}
