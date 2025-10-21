import java.util.Scanner;

public class Reggie {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String ssn = SafeInput.getRegExString(in, "Enter SSN [XXX-XX-XXXX]", "^\\d{3}-\\d{2}-\\d{4}$");
        String studentMNumber = SafeInput.getRegExString(in, "Enter M Number", "^(M|m)\\d{5}$");
        String menuChoice = SafeInput.getRegExString(in, "Enter Your Choice [O,S,V,Q]", "^[OoSsVvQq]$");

        System.out.println("Your SSN is " + ssn);
        System.out.println("Your Student M Number is " + studentMNumber);

        switch (menuChoice.toLowerCase()) {
            case "o":
                System.out.print("Open");
                break;
            case "s":
                System.out.print("Save");
                break;
            case "v":
                System.out.print("View");
            case "q":
                System.out.print("Quit");
        }
    }
}
