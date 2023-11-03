package Tugas;
class Phone {
    public String brand;
    private String getBrand;
    private boolean powerOn;
    private int volume;

    public Phone(String brand) {
        this.brand = brand;
        powerOn = false;
        volume = 0;
    }

    public void hidupkanHP() {
        if (!powerOn) {
            powerOn = true;
            System.out.println(brand + " HP dinyalakan.");
        } else {
            System.out.println(brand + " HP sudah dalam keadaan menyala.");
        }
    }

    public void matikanHP() {
        if (powerOn) {
            powerOn = false;
            System.out.println(brand + " HP dimatikan.");
        } else {
            System.out.println(brand + " HP sudah dalam keadaan mati.");
        }
    }

    public void naikkanVolume() {
        if (powerOn) {
            if (volume < 10) {
                volume++;
                System.out.println(brand + " Volume dinaikkan menjadi " + volume);
            } else {
                System.out.println(brand + " Volume sudah mencapai batas maksimal.");
            }
        } else {
            System.out.println(brand + " HP harus dalam keadaan menyala untuk mengatur volume.");
        }
    }

    public void turunkanVolume() {
        if (powerOn) {
            if (volume > 0) {
                volume--;
                System.out.println(brand + " Volume diturunkan menjadi " + volume);
            } else {
                System.out.println(brand + " Volume sudah mencapai batas minimal.");
            }
        } else {
            System.out.println(brand + " HP harus dalam keadaan menyala untuk mengatur volume.");
        }
    }

    public int getVolume() {
        return volume;
    }
}