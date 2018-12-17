package p0027;
class Solution {
    public static void main(String[] args) {
    }

    public int removeElement(int[] nums, int val) {
        int index = 0;
        for (int v : nums) {
            if (v != val) nums[index++] = v;
        }
        return index;
    }
}