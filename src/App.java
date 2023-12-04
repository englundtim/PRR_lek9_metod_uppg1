import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Uppg a)");
        Scanner in = new Scanner(System.in);
        System.out.println("Vad sak din radie vara?");
        double radie = in.nextDouble();
        omkretsCirkel(radie);
        System.out.println("omkrets vara:"+omkretsCirkel(radie));

        System.out.println("");
        System.out.println("uppg b)");
        System.out.println("Hur lång ska din linje vara?");
        int längd = in.nextInt();
        ritaLinje(längd);

        System.out.println("");
        System.out.println("uppg c)");
        System.out.println("Hur bred ska din rektangel vara?");
        int width = in.nextInt();
        System.out.println("Hur hög ska din rektangel vara?");
        int height = in.nextInt();
        rectangle(height, width);

        System.out.println("");
        System.out.println("uppg f)");
        System.out.println("Skriv in ett negativt eller positivt tal:");
        double tal = in.nextDouble();
        in.nextLine();
        System.out.println("Är det ett positivt tal: "+tal_positivt(tal));

        System.out.println("");
        System.out.println("uppg g)");
        System.out.println("Skriv någon sort karaktär så ska datorn va magisk och kolla om det är ett tecken eller inte.");
        String text = in.nextLine();
        char tecken = text.charAt(0);
        System.out.println("Är det en char?: "+siffra(tecken));

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

        static void rectangle(int height, int width)
        {
            for(int i=0; i<height; i++)
            {
                System.out.println(" ");
                for (int j = 0; j < width; j++) 
                {
                    System.out.print("*");
                }
                
            }
        }
        static boolean tal_positivt(double tal)
        {
            if (tal>0) 
            {
                return true;
            }
            else{
                return false;
            }
        }
        static boolean siffra(char tecken)
        {
            boolean svar = Character.isDigit(tecken);
            if (svar==true) {
                return true;
            }
            else{
                return false;
            }
        }
}
