public class NumberOf1Bits {
    public static void main(String[] args) {
        int n = 11;
        System.out.println(hammingWeight(n));
    }

    public static int hammingWeight(int n) {
        /**
         * 传入的 n 是一个十进制数（整数）。但需要注意的是，计算机内部存储数字时，实际上是将其表示为二进制格式。
         * 所以尽管我们看到的是十进制输入，程序处理时已经将其转换为二进制格式，
         * 这使得按位操作（如按位与 &）可以直接作用于这些数字的二进制表示
         */
        int res = 0;
        while (n != 0){
            res += n & 1; // 最低位是 1, 结果为 1, 最低为为 0, 结尾为 0
            n >>>=1;
        }
        return res;
    }
}
