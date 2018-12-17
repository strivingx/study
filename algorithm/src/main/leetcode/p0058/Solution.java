package p0058;
class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().lengthOfLastWord(""));
        System.out.println(new Solution().lengthOfLastWord("111"));
        System.out.println(new Solution().lengthOfLastWord("11 11"));
        System.out.println(new Solution().lengthOfLastWord("a "));
        System.out.println(new Solution().lengthOfLastWord(" "));
    }

    public int lengthOfLastWord(String s) {
        int len = s.length() - 1;
        while (len >= 0 && s.charAt(len) == ' ') len--;
        int i = len;
        while (i >= 0 && s.charAt(i) != ' ') i--;
        return len - i;
    }
}