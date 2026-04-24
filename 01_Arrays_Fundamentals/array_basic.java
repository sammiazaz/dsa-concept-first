public class array_basic {
    public static void main(String[] args) {
        // Declaration
        int[] a;
        // Construction
        a = new int[3];
        // Initialization
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        // Print
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println(" ");

       // 2. ********************************READ ARRAY ********************************/
    System.out.println("2. Read Array");
        int[] arr = {10, 20, 30, 40, 50};

        // Read element at index 2
        System.out.println(arr[2] + " ->value of 2 index"); 

        // traversing array
        for (int i = 0; i <arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");

        //3. update array ***************************************************************
        int[] arr3 = {10, 20, 30, 40, 50};

        // Update element at index 2 
        arr3[2] = 100;

        // Print array   
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
    }
}