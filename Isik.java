package praktikum3;

public class Isik {
    private String nimi;
    private double pikkus;

    public Isik(String isikuNimi, double isikuPikkus) {
        nimi = isikuNimi;
        pikkus = isikuPikkus;
    }

    public int suusakepiPikkus() {
        return (int) Math.round(0.85 * pikkus * 100);
    }

    public static void main(String[] args) {
        Isik mirko = new Isik("Mirko Muhe", 1.8);
        System.out.println("suusakepi pikkus on " + mirko.suusakepiPikkus());
    }
}