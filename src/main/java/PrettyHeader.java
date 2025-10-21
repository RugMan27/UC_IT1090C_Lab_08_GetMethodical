public class PrettyHeader {
    public static void prettyHeader(String msg) {
        boolean odd = msg.length() % 2 != 0;



        System.out.println();
        for (int i = 0; i < 60; i++){
            System.out.print("*");
        }




        int spacing = (60 - msg.length()) / 2;
        System.out.print("\n***");

        for (int i = 0; i < spacing-3; i++){
            System.out.print(" ");
        }
        System.out.print(msg);
        for (int i = 0; i < spacing-3; i++){
            System.out.print(" ");
        }
        if(odd){
            System.out.print(" ");
        }
        System.out.print("***\n");
        for (int i = 0; i < 60; i++){
            System.out.print("*");
        }

    }
}
