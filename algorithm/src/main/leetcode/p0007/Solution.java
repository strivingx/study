package p0007;

class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().reverse(-2147483648));
        System.out.println(new Solution().reverse(-123));
    }
    public int reverse(int x) {
        int flag = x > 0 ? 1 : -1;
        x = x > 0 ? x : -x;
        int result = 0;
        while (x != 0) {
            if (result * 10L + x % 10 > Integer.MAX_VALUE)
                return 0;
            result = result * 10 + x % 10;
            x /= 10;
        }
        return flag * result;
    }
}