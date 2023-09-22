import java.util.Arrays;

public class ContainsNumber {

    public static int notContains(int[] array) {
        Arrays.sort(array);
        int index = 0;
        int min_numb = 1;
        boolean found = false;
        boolean check = false;
        for(int i = 0; i < array.length; i++){
            if (array[i] == 1) {
                found = true;
            }
            if(array[i] > 0 && !check) {
                index = i;
                check = true;
            }
        }

        if(!found) {
            return min_numb;
        }
        
        for(int i = index; i < array.length-1; i++){
            if(array[i+1] - array[i] > 1) {
                return array[i]+1;
            }
        }
        return array[array.length-1]+1;

    }
    //for testing
    // public static void main(String[] args) {

    //     int[] array = {1,2,3,4,5,6,8,9,10};
    //     System.out.println(notContains(array));
    // }
}
