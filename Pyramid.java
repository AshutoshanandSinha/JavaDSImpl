public class Pyramid {
    public static void main(String[] args) {
        int freq = 30, count=1;


        while (freq > 0) {
            for (int index = 1; index < freq; index++) {
                System.out.printf(" ");
            }
        freq--;

            for (int i =1; i<= count; i++)
            System.out.print("*");

            count += 2;

            System.out.println(" ");
        }
    }
}
