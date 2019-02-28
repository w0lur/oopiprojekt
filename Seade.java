package praktikum3;

public class Seade {
    private int kood;
    private String nimetus;
    private double hind;
    static double käibemaks = 20;

    public Seade(int kood, String nimetus, double hind) {
        this.kood = kood;
        this.nimetus = nimetus;
        this.hind = hind;
    }
    public double kmHind() {
        return hind*(käibemaks/100) + hind;
    }

    public int getKood() {
        return kood;
    }

    public void setKood(int kood) {
        this.kood = kood;
    }

    public String getNimetus() {
        return nimetus;
    }

    public void setNimetus(String nimetus) {
        this.nimetus = nimetus;
    }

    public double getHind() {
        return hind;
    }

    public void setHind(double hind) {
        this.hind = hind;
    }

    public static double getKäibemaks() {
        return käibemaks;
    }

    public static void setKäibemaks(double käibemaks) {
        Seade.käibemaks = käibemaks;
    }

    @Override
    public String toString() {
        return "praktikum3.Seade{" +
                "kood=" + kood +
                ", nimetus='" + nimetus + '\'' +
                ", hind=" + hind +
                "Hind käibemaksuga: " + this.kmHind() +
                '}';
    }

}
