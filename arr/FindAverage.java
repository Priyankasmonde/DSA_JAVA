public class FindAverage {
    public static void main(String[] args) {
        int arr[] = {1, 2, -3, 4, 5};
        average(arr);
    }

    public static void average(int[] arr) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                sum += arr[i];
                count++;
            }
        }
        
        if (count > 0) {
            double average = (double) sum / count;
            System.out.println(average);
        } else {
            System.out.println("No positive numbers in the array.");
        }
    }
}
