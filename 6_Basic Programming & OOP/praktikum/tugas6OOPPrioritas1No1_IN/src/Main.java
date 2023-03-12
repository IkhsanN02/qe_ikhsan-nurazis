public class Main {
    public static void main(String[] args) {
        Product p1 = new Product();
        p1.setNama("coffee");
        p1.setDeskripsi("this is coffee");
        p1.setHarga(15000);
        p1.setJumlah(10);
        p1.getInfo();

        Product p2 = new Product();
        p2.setNama("milk");
        p2.setDeskripsi("this is fresh milk");
        p2.setHarga(25000);
        p2.setJumlah(10);
        p2.getInfo();

        Product p3 = new Product();
        p3.setNama("apple juice");
        p3.setDeskripsi("this is juice");
        p3.setHarga(18000);
        p3.setJumlah(20);
        p3.getInfo();
    }
}