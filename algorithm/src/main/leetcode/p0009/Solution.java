package p0009;

class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().isPalindrome(-2147483648));
        System.out.println(new Solution().isPalindrome(123321));
        System.out.println(new Solution().isPalindrome(12321));
        System.out.println(new Solution().isPalindrome(1000021));
    }

    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        else {
            int i = 1,j = 1,  n = x / 10;
            while (n > 0) {
                n /= 10;
                i *= 10;
            }
            while (true) {
                int left = x / i % 10;
                int right = x / j % 10;
                if (left != right) return false;
                if (i <= j) break;
                i /= 10;
                j *= 10;
            }
            return true;
        }
    }
}