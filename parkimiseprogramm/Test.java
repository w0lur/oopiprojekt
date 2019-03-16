package parkimiseprogramm;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        System.out.println("Tere tulemast! Parkmispileti ostmiseks tuleb sisestada oma auto registreerimisnumber ning parkimise kestvuse aeg minutites.");
        System.out.println();
        System.out.println("Parkimispileti hinnakiri on järgmine: ");
        System.out.println("Ajavahemikul 8.00-12.00 maksab 1 tund parkimist 2.50 eurot.");
        System.out.println("Ajavahemikul 12.00-18.00 maksab 1 tund parkimist 1.50 eurot.");
        System.out.println();
        System.out.println("Esimesed 90 minutit on võimalik parkida tasuta. Selleks jätke auto tuuleklaasile parkimiskell koos parkimise algusajaga");
        System.out.println("Juhul, kui soovite parkida üle 90 minuti, tuleb osta parkimispilet. Parkimispileti hinnast arvestatakse maha 90-minutiline tasuta parkimisaeg.");
        System.out.println("Kellaaegadel 8.00-12.00 on parkimispileti summalt mahaarvestatav summa 3.75 eurot.");
        System.out.println("Kellaaegadel 12.00-18.00 on parkimispileti summalt mahaarvestatav summa 2.25 eurot");
        System.out.println();
        System.out.println("Parkimise alustamiseks sisestage oma auto registreerimisnumber ja seejärel parkimisaeg minutites.");
        Scanner scan = new Scanner(System.in);
        System.out.println("Sisestage oma auto registreerimisnumber: ");
        String registreerimisNumber = scan.nextLine();
        System.out.println("Sisestage parkimisaeg minutites: ");
        int parkimisAegMinutites = scan.nextInt();
        System.out.println("Soovid parkida autot registreerimisnumbriga " + "'" + registreerimisNumber + "'" + " " + parkimisAegMinutites + " minutiks");
    }
}
