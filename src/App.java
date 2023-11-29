import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Uppg a)");
        Scanner in = new Scanner(System.in);
        System.out.println("Vad sak din radie vara?");
        double radie = in.nextDouble();
        omkretsCirkel(radie);
        System.out.println("omkrets vara:"+omkretsCirkel(radie));
        System.out.println("Hur lång ska din linje vara?");
        int längd = in.nextInt();
        ritaLinje(längd);
        


    }

        static double omkretsCirkel(double radie)
        {
            return radie*2*3.14;
        }


        static void ritaLinje(int längd)
        {
            
            for(int i=0; i<längd; i++)
            {
                System.out.print("-");
            }
        }
}
