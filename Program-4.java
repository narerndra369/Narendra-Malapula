// Program-4 Java:

// Input && Output:

// Enter the number of Elements in the list:
// 11
// Enter the list:
// 1 2 8 9 12 46 76 82 15 20 30
// Output:
// {1=11, 2=8, 3=4, 4=4, 5=3, 6=2, 7=0, 8=1, 9=1}

import java.util.*;;

public class MultipleCounter {

    public Map<Integer, Integer> countMultiples(List<Integer> numbers) {

        Map<Integer, Integer> counts = new LinkedHashMap<>();
        
        int[] divisors = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int divisor : divisors) {
            int currentCount = 0;
            for (int number : numbers) {

                if (number % divisor == 0) {
                    currentCount++;
                }
            }

            counts.put(divisor, currentCount);
        }

        return counts;
    }


    public static void main(String[] args) {

        MultipleCounter counter = new MultipleCounter();
        
        List<Integer> list = new ArrayList<>();
        
        System.out.println("Enter the number of Elements in the list:");
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        System.out.println("Enter the list:");
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }


        Map<Integer, Integer> result = counter.countMultiples(list);
        System.out.println("Output:");
        System.out.println(result);
    }
}
