
public class MinimumCoins {
    public static int minCoins(int amount) {
        int[] coins = {1,5,10,20,50};
        int minCoins = 0;
        int i = 4;
        while(amount > 0 && i >= 0) {
            minCoins += amount/coins[i];
            amount %= coins[i];
            i--;
        }
        
        
        return minCoins;
    }

    // public static void main(String[] args) {
    //     int minCoins = minCoins(680);
    //     System.out.println("min is: " + minCoins);
    // }
}

