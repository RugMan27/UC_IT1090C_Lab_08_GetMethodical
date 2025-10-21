public class CtoFTableDisplay {
    public static void main(String[] args) {
        System.out.printf("%-10s %-10s%n", "C", "F");
        System.out.printf("%-10s %-10s%n", "-----", "-----");
        for(int i=-100; i<=100; i++){
            System.out.printf("%-10d %-15.2f%n", i, CtoF(i));
        }
    }
    public static double CtoF(double Celsius){
        return (Celsius * 1.8) + 32;
    }
}
