public class Loop {
    public static void main(String[] args) {
        double index = 0;
        double index2 = 0;

        while (index <= 30) {
            System.out.printf("%.1f ", index / 10);
            index = index + 1;
        }

        System.out.println("\n");

        do {
            System.out.printf("%.1f ", index2 / 10);
            index2++;
        }
        while (index2 <= 30);
        }
    }