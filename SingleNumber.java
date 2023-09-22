public class SingleNumber {
    public static int singleNumber(int[] nums) {
        int singleNumber = 0;
        for (int i : nums) {
            singleNumber ^= i;        //we use xor operator as if its with itself it gives 0
        }
        return singleNumber;
    }

    //for testing
    // public static void main(String[] args) {
    //     int[] nums = {5,7,6,7,1,6,5};
    //     int single = singleNumber(nums);
    //     System.out.println("The single number is: " + single); // Output: 4
    // }
}
