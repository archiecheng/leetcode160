public class ReverseBits {
    public static void main(String[] args) {
        int n3 = 5; // 二进制: 00000000 00000000 00000000 00000101
        int reversed3 = reverseBits(n3);
        System.out.println("Input: " + n3 + ", Reversed: " + reversed3);
    }
    public static int reverseBits(int n) {
        int ans = 0;
        for(int i = 0; i < 32; i++){
            int t = (n >> i) & 1;
            if(t == 1){
                ans |= (1 << (31 - i));
            }
        }
        return ans;
    }
}
