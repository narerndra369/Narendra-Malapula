// Program-2 Java:

// Input && Output:

// Enter the no of series to Generate:
// 5
// 1, 3, 5, 7, 9


import java.util.*;
public class OddSeriesGenerator {

    public void generateSeries(int count) {
        if (count <= 0) {
            System.out.println("Input must be a positive integer.");
            return;
        }

        for (int i = 1; i <= count; i++) {

            int oddNumber = 2 * i - 1;
            System.out.print(oddNumber);

            if (i < count) {
                System.out.print(", ");
            }
        }

    }

    public static void main(String[] args) {

        OddSeriesGenerator generator = new OddSeriesGenerator();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of series to Generate:");
        int n = sc.nextInt();
        generator.generateSeries(n);
    }
}
