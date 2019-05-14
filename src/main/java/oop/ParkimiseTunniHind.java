package oop;

//siin klassis määrame parkimise tunni hinna (1.5 eurot tund)
public class ParkimiseTunniHind {
    private static double autoTunniHind = 1.5;
    private static double bussiTunniHind = 2.5;

    public ParkimiseTunniHind() {
    }

    public static double getAutoTunniHind() {
        return autoTunniHind;
    }

    public static double getBussiTunniHind() {
        return bussiTunniHind;
    }
}
