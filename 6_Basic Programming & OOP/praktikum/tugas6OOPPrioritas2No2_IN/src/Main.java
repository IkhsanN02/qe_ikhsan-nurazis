public class Main {
    public static void main(String[] args) {
        int additionResult = add(3,4);
        int subtractionResult = subtract(15,4);
        int multiplicationResult = multiply(10,10);
        int divisionResult = divide(12,3);

        System.out.println("Penjumlahan: " + additionResult);
        System.out.println("Pengurangan: " + subtractionResult);
        System.out.println("Perkalian: " + multiplicationResult);
        System.out.println("Pembagian: " + divisionResult);
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            System.out.println("Pembagian dengan nol tidak dapat dilakukan.");
            return 0;
        } else {
            return a / b;
        }
    }
}