package p0013;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().romanToInt("MCMXCIV"));
        System.out.println(new Solution().romanToInt("IV"));
        System.out.println(new Solution().romanToInt("VI"));
    }

    public int romanToInt(String s) {
        if (s.length() == 0) return 0;
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = map.get(s.charAt(s.length() - 1));
        int last = result, current;
        for (int i = s.length() - 2; i >= 0; i--) {
            current = map.get(s.charAt(i));
            if (last <= current) {
                result += current;
            } else {
                result -= current;
            }
            last = current;
        }
        return result;
    }
}