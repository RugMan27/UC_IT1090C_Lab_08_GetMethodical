import java.util.Scanner;

public class GetUserName {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String userName = SafeInput.getNonZeroLenString(in, "Enter your User Name");
        System.out.println("Your User Name is " + userName);
    }
}
