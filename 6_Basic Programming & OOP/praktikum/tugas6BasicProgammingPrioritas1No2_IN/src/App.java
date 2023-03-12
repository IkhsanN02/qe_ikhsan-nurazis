public class App {
    public static void main(String[] args) {
        int hargaBeli = 12000;
        int hargaJual = 12000;
        int out;

        if (hargaJual > hargaBeli){
            out = hargaJual - hargaBeli;
            System.out.println("untung sebesar : " + out);
        } else if (hargaJual < hargaBeli) {
            out = hargaJual - hargaBeli;
            System.out.println("rugi sebesar : " + out);
        } else {
            System.out.println("sama saja");
        }
    }
}
