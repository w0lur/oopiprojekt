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
        parkimiseSumma();
    }
    public static void parkimiseSumma(){
        System.out.println("Parkimise alustamiseks sisestage oma auto registreerimisnumber ja seejärel parkimisaeg minutites.");
        Scanner scan = new Scanner(System.in);
        System.out.println("Sisestage oma auto registreerimisnumber: ");
        String registreerimisNumber = scan.nextLine();
        System.out.println("Sisestage parkimisaja algus: ");
        String parkimisAlgusAeg = scan.next();
        System.out.println("Sisestage parkimisaja lõpp: ");
        String parkimisLõppAeg = scan.next();
        int aegMinutites = parkimisAegMinutites(parkimisAlgusAeg, parkimisLõppAeg);
        int parkimiseSumma = 0;
        System.out.println("Soovid parkida autot registreerimisnumbriga " + "'" + registreerimisNumber + "'" + " " + aegMinutites + " minutiks ja tasuda tuleb "+ parkimiseSumma +" eurot.");
    }
    public static int parkimisAegMinutites(String algus, String lõpp){
        String algusTunnid = algus.substring(0,2);
        String lõppTunnid = lõpp.substring(0,2);
        String algusMinutid = algus.substring(3,5);
        String lõppMinutid = lõpp.substring(3,5);
        int alguseTunnid = Integer.parseInt(algusTunnid);
        int lõpuTunnid = Integer.parseInt(lõppTunnid);
        int alguseMinutid = Integer.parseInt(algusMinutid);
        int lõpuMinutid = Integer.parseInt(lõppMinutid);
        int tunnidKokku = 0;
        int minutidKokku = 0;
        int parkimiseAegMinutites = 0;
        if(alguseTunnid > lõpuTunnid){
            tunnidKokku = (24 - alguseTunnid) + lõpuTunnid;
        }
        if(alguseTunnid < lõpuTunnid){
            tunnidKokku = lõpuTunnid - alguseTunnid;
        }
        if(alguseMinutid > lõpuMinutid){
            minutidKokku =  lõpuMinutid - alguseMinutid;
        }
        if(alguseTunnid < lõpuTunnid){
            minutidKokku = lõpuMinutid - alguseMinutid;
        }
        parkimiseAegMinutites = 60*tunnidKokku + minutidKokku;

        return parkimiseAegMinutites;
    }
}
