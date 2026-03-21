public class PQ {
    public static void main(String[] args) {

         //****************question 1. Find Sum of Array********************/
        int[] arr = {1, 2, 3, 4};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum = " + sum);

         //****************question 2. Find Maximum Element********************/
            int[] arr2 = {10, 5, 20, 8};
        int max = arr2[0];

        for (int i = 1; i < arr2.length; i++) {
            if (arr2[i] > max) {
                max = arr2[i];
            } 
        }
        System.out.println("Max = " + max);

        //****************question 3. Prefix Sum (Basic)********************/
        int[] arr3 = {1, 2, 3, 4};
        int n = arr3.length;

        int[] prefix = new int[n];

        prefix[0] = arr3[0];
        System.out.print("prefix sum = ");
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr3[i];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(prefix[i] + " ");
        }
    }

}
