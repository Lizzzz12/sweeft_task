public class BinarySum {
    public static String addBinary(String a, String b) {
        
        //this converts string to integer
        
        int bin1 = Integer.parseInt(a, 2);
        int bin2 = Integer.parseInt(b, 2);
        
        // Calculates sum
        
        int sum = bin1 + bin2;

        // converts the sum to the binary string back
        
        String answ = Integer.toBinaryString(sum);

        return answ;
    }

    //for testing the code
// public static void main(String[] args) {
//         
//         String a = "1010";
//         String b = "1011";
//         String sum = addBinary(a, b);
//         System.out.println("Sum: " + sum); 
//     }

}
