public class GrayCode {
    public static int gray(boolean encode, int n) {
        if (encode) {
            // Binary to Gray
            return n ^ (n >>> 1);
        } else {
            // Gray to Binary
            int b = n;
            while (n != 0) {
                n >>>= 1;
                b ^= n;
            }
            return b;
        }
    }

    public static void main(String[] args) {
        System.out.println("Decimal | Binary  | Gray    | Decoded");
        for (int i = 0; i < 32; i++) {
            int g = gray(true, i);
            int decoded = gray(false, g);
            System.out.printf("%7d | %7s | %7s | %d%n",
                i,
                Integer.toBinaryString(i),
                Integer.toBinaryString(g),
                decoded);
        }
    }
}
