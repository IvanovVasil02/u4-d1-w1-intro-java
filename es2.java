import java.util.Scanner;

public class es2 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("Inserisci la prima stringa da concatenare: ");
        String primaStringa = inp.nextLine();

        System.out.println("Inserisci la seconda stringa da concatenare: ");
        String secondaStringa = inp.nextLine();

        System.out.println("Inserisci la terrza stringa da concatenare: ");
        String terzaStringa = inp.nextLine();
        concatString(primaStringa, secondaStringa, terzaStringa);
        reverseConcatString(primaStringa, secondaStringa, terzaStringa);


    }

    public static void concatString(String a, String b, String c) {
        System.out.println("Stringa: " + a + b + c);
    }

    public static void reverseConcatString(String a, String b, String c) {
        System.out.println("Stringa invertita: " + c + b + a);
    }
}
