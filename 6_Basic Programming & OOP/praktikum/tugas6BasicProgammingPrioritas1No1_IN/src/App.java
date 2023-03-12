public class App {
    public static void main(String[] args) {
        // segitiga
        float alas = 20;
        float tinggi = 25;
        double luasSegitiga;

        // hitung luas segitiga
        luasSegitiga = 0.5*alas*tinggi;
        System.out.println("Luas Segitiga : " + luasSegitiga);

        // persegi panjang
        float panjang = 40;
        float lebar = 6;
        double luasPersegiPanjang;

        // hitung luas persegi panjang
        luasPersegiPanjang = panjang*lebar;
        System.out.println("Luas Persegi Panjang : " + luasPersegiPanjang);

        // lingkaran
        double jari2 = 7;
        double phi = 3.14;
        double luasLingkaran;

        // hitung luas lingkaran
        luasLingkaran = phi*jari2*jari2;
        System.out.println("Luas Lingkaran : "+luasLingkaran);


    }
}
