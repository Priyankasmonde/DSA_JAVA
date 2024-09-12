import java.util.HashSet;

public class RemoveDuplicates{
    public static void main(String[] args) {
        HashSet<Integer> hs= new HashSet<>();
        int[] arr={ 1, 2, 4, 5,8, 7,4, 5,8, 3, 6};
        for(int i=0; i<arr.length; i++){
            hs.add(arr[i]);//hashset does not store duplicate varibales;
        }
        for(int number:hs){
            System.out.println(number);

        }
    }
}