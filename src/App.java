import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Uppg a)");
        Scanner in = new Scanner(System.in);
        System.out.println("Vad sak din radie vara?");
        double radie = in.nextDouble();
        omkretsCirkel(radie);
        System.out.println("omkrets vara:"+omkretsCirkel(radie));
    }

        static double omkretsCirkel(double radie)
        {
            return radie*2*3.14;
        }

}
