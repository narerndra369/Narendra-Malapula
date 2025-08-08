//Program-3 Java:

// Input && Output:

// Enter the no of series to Generate:
// 10
// 1, 3, 5, 7, 9, 11, 13, 15, 17


import java.util.*;
public class OddSeriesGenerator {

    public void generateSeries(int a) {

        if (a <= 0) {
            System.out.println("Input must be a positive integer.");
            return;
        }

        if (a % 2 == 0) {
           a -= 1;
        }

        for (int i = 1; i <= a; i++) {

            int oddNumber = 2 * i - 1;
            System.out.print(oddNumber);

            if (i < a) {
                System.out.print(", ");
            }
        }

        System.out.println();
    }


    public static void main(String[] args) {

        OddSeriesGenerator generator = new OddSeriesGenerator();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of series to Generate:");
        int n = sc.nextInt();
        generator.generateSeries(n);
    }
}
