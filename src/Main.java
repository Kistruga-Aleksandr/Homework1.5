public class Main {
    public static void main(String[] args) {
        task();
    }

    public static void task() {
        int[] integerArrays = new int[3];
        integerArrays[0] = 1;
        integerArrays[1] = 2;
        integerArrays[2] = 3;
        double[] fractionalArray = {1.57, 7.654, 9.986};
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        System.out.print(integerArrays[0]);
        for (int i = 1; i < integerArrays.length; i++) {
            System.out.print("," + integerArrays[i]);
        }
        System.out.println();
        System.out.print(fractionalArray[0]);
        for (int i = 1; i < fractionalArray.length; i++) {
            System.out.print("," + fractionalArray[i]);
        }
        System.out.println();
        System.out.print(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            System.out.print("," + arr[i]);
        }
        System.out.println();
        for (int i = integerArrays.length - 1; i >= 0; i--) {
            System.out.print(integerArrays[i] + ",");
        }
        System.out.println();
        for (int i = fractionalArray.length - 1; i >= 0; i--) {
            System.out.print(fractionalArray[i] + ",");
        }
        System.out.println();
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + ",");
        }
        System.out.println();
        for (int i = 0; i < integerArrays.length; i++){
            int sum;
            if(integerArrays[i] % 2 != 0){
                 sum = integerArrays[i] + 1;
                System.out.print(sum + ",");
            }
        }
    }

}
