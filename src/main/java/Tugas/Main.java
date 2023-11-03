package Tugas;

public class Main {
    public static void main(String[] args) {
        Phone hpXiaomi = new Phone("Xiaomi");
        Phone hpVivo = new Phone("Vivo");

        hpXiaomi.hidupkanHP();
        hpXiaomi.naikkanVolume();
        hpXiaomi.naikkanVolume();
        hpXiaomi.turunkanVolume();
        hpXiaomi.matikanHP();

        System.out.println("Volume " + hpXiaomi.brand + ": " + hpXiaomi.getVolume());

        hpVivo.hidupkanHP();
        hpVivo.naikkanVolume();
        hpVivo.turunkanVolume();
        hpVivo.matikanHP();

        System.out.println("Volume " + hpVivo.brand + ": " + hpVivo.getVolume());
    }
}