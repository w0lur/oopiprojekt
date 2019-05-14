package oop;

import java.time.LocalDateTime;
import java.util.Scanner;

//siin klassis leiame parkimise aja, küsides kasutajalt parkimisalgusaega ja lõppaega (kujul XX:YY)
public class ParkimiseAeg {
    private LocalDateTime parkimisAlgusAeg ;
    private LocalDateTime parkimisLõppAeg;


    static String getParkimisAlgusAeg() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Sisestage parkimisaja algus: ");
        String parkimisAlgusAeg = scan.next();
        System.out.println("Parkimise algusajaks on: " + parkimisAlgusAeg);
        return parkimisAlgusAeg;
    }
    static String getParkimisLõppAeg() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Sisestage parkimisaja lõpp: ");
        String parkimisLõppAeg = scan.next();
        System.out.println("Parkimise lõppaeg on: " + parkimisLõppAeg);
        return parkimisLõppAeg;
    }
    public static int getParkimiseAegMinutites(String parkimisAlgusAeg, String parkimisLõppAeg) {
        String algusTunnid = parkimisAlgusAeg.substring(0, 2);
        String lõppTunnid = parkimisLõppAeg.substring(0, 2);
        String algusMinutid = parkimisAlgusAeg.substring(3, 5);
        String lõppMinutid = parkimisLõppAeg.substring(3, 5);
        int alguseTunnid = Integer.parseInt(algusTunnid);
        int lõpuTunnid = Integer.parseInt(lõppTunnid);
        int alguseMinutid = Integer.parseInt(algusMinutid);
        int lõpuMinutid = Integer.parseInt(lõppMinutid);
        int tunnidKokku = 0;
        int minutidKokku = 0;
        int parkimiseAegMinutites = 0;
        if (alguseTunnid > lõpuTunnid) {
            tunnidKokku = (24 - alguseTunnid) + lõpuTunnid;
        }
        if (alguseTunnid < lõpuTunnid) {
            tunnidKokku = lõpuTunnid - alguseTunnid;
        }
        if (alguseMinutid > lõpuMinutid) {
            minutidKokku = lõpuMinutid - alguseMinutid;
        }
        if (alguseMinutid < lõpuMinutid) {
            minutidKokku = lõpuMinutid - alguseMinutid;
        }
        parkimiseAegMinutites = 60 * tunnidKokku + minutidKokku - 90;

        return parkimiseAegMinutites;
    }
    @Override
    public String toString() {
        return "ParkimiseAeg{" +
                ", parkimisAlgusAeg='" + parkimisAlgusAeg + '\'' +
                ", parkimisLõppAeg='" + parkimisLõppAeg + '\'' +
                '}';
    }
}
