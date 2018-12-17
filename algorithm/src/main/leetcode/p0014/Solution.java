package p0014;

class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
        System.out.println(new Solution().longestCommonPrefix(new String[]{"dog", "racecar", "car"}));
    }

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        String str = strs[0];
        int len = str.length();
        for (int i = 1, j; i < strs.length; i++) {
            len = len > strs[i].length() ? strs[i].length() : len;
            for (j = 0; j < len && str.charAt(j) == strs[i].charAt(j); j++) ;
            len = j;
        }
        return str.substring(0, len);
    }
}