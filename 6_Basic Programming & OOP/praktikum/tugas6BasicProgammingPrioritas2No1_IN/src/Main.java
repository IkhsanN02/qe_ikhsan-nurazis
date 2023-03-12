public class Main {
    public static void drawXYZ(int n) {
        int count = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (count % 3 == 0) {
                    System.out.print("X ");
                } else if (count % 2 == 1) {
                    System.out.print("Y ");
                } else {
                    System.out.print("Z ");
                }
                count++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        drawXYZ(5);
    }
}