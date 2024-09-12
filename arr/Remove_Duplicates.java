import java.util.*;

public class Remove_Duplicates {
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 5,8, 7,4, 5,8, 3, 6};
        int[] result = removeDuplicates(array);
        
        System.out.println("Array after removing duplicates: " + Arrays.toString(result));
    }

    public static int[] removeDuplicates(int[] array) {
        // Using LinkedHashSet to maintain insertion order and remove duplicates
        HashSet<Integer> set = new LinkedHashSet<>();
        for (int element : array) {
            set.add(element);
        }
        
        // Convert the set back to an array
        int[] resultArray = new int[set.size()];
        int i = 0;
        for (int element : set) {
            resultArray[i++] = element;
        }
        
        return resultArray;
    }
}
