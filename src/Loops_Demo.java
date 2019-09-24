import java.util.Scanner;

public class Loops_Demo {
    public static void main(String[] args) {
        for (int i = -1; i >= -1000; i = i - 2) {
            System.out.println(i);

        }

        for (int i = -42; i <= 77; i = i + 5) {

        }
        int w = 0;
        while (w < 10) {
            w = w + 1;
            System.out.println("Hej" + w);
        }
        Scanner scanner = new Scanner(System.in);
        String besked;
        besked = "";
        while (!besked.equals("exit")) {
            besked = scanner.nextLine();
            System.out.println(besked + besked);
        }
        /*denne køres ikke
        //while(false) {
        //System.out,println("noget hemmeligt"
         */

        int r = 1;
        while (r < 20) {
            r = r + 2;
            System.out.println("udregnet til " + r);
        }
        Scanner rumble = new Scanner(System.in);
        String ready;
        besked = "";
        while (!besked.equals("get")) {
            ready = scanner.nextLine();
            System.out.println((ready + " ready to rumble!" ));
    }

    //Foreach//
    String[] strArray = {"Sune", "Mathias", "Anders", "Toge", "Tommy"};

    }
}
