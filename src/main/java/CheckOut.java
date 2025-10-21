import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double total = 0;
        do{
            total += SafeInput.getRangedDouble(in, "Enter Price Of Item $", 0.5,10);
        } while (SafeInput.YNConfirm(in,"Would you like to add another item?"));
        System.out.printf("Your total price is $%.2f%n", total);
    }
}
