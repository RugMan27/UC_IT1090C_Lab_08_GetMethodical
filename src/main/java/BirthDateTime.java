import java.util.Scanner;

public class BirthDateTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int birthYear = SafeInput.getRangedInt(in, "Enter your birth year", 1950, 2015);
        int birthMonth = SafeInput.getRangedInt(in, "Enter Your Birth Month", 1, 12);
        int daysInMonth = 0;

        switch (birthMonth) {
            case 1, 3, 5, 7, 8, 10, 12:
                daysInMonth = 31;
                break;
            case 4, 6, 9, 11:
                daysInMonth = 30;
                break;
            case 2:
                if(birthYear % 4 == 0){
                    daysInMonth = 29;
                }
                break;
        }

        int BirthDay = SafeInput.getRangedInt(in, "Enter your birth day", 1, daysInMonth);

        int BirthHour = SafeInput.getRangedInt(in, "Enter your birth hour", 1, 24);
        int BirthMinute = SafeInput.getRangedInt(in, "Enter your birth minute", 0, 59);


        System.out.println("You where born " + birthMonth + "/" + BirthDay + "/" + birthYear + " at " + BirthHour + ":" + BirthMinute);
    }
}
