import java.util.Scanner;

public class DevTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        SafeInput.getNonZeroLenString(in, "Enter Your Name");
        SafeInput.getInt(in, "Enter Your Age");
        SafeInput.getDouble(in, "Enter Your Weight");
        SafeInput.getRangedInt(in, "Enter Grade", 1,12);
        SafeInput.getRangedDouble(in, "Enter some price", 0.31,14.5);
        SafeInput.YNConfirm(in, "Continue?");
        SafeInput.getRegExString(in, "SSN [XXX-XX-XXXX]", "^(?!000|666|9\\d{2})\\d{3}-(?!00)\\d{2}-(?!0000)\\d{4}$");
    }
}
