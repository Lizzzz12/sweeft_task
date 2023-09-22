public class StaircaseClimbing {
    public static int countVariants(int stairsCount) {
        if (stairsCount <= 1) {
            return 1;
        }

        // in this array we will store the number of ways to reach each step
        int[] number_of_ways = new int[stairsCount + 1];

        // base case (one way to reach 0th floor and one way to reach 1st floor)
        number_of_ways[0] = 1;
        // base case
        number_of_ways[1] = 1;

        // we start from 2 as we know 1st and 0th floor and we need to find out ways to reach from 2nd to nth)
        for (int i = 2; i <= stairsCount; i++) {
           //You can reach the current step by either taking 1 step or 2 steps from the previous step.
            number_of_ways[i] = number_of_ways[i - 1] + number_of_ways[i - 2];
        }

        // lastly, store in dp
        return number_of_ways[stairsCount];
    }

    //for testing
    // public static void main(String[] args) {
    //     int stairsCount = 10; // Change this value to the number of stairs you want to climb
    //     int ways = countVariants(stairsCount);
    //     System.out.println("Number of ways to climb " + stairsCount + " stairs: " + ways);
    // }
}
