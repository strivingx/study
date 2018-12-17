package p0026;
class Solution {
    public static void main(String[] args) {
    }

    public int removeDuplicates(int[] nums) {
        int index = 0;
        int i = 1;
        while(true ) {
            while(i < nums.length && nums[index] == nums[i] ) i++;
            if(i < nums.length) nums[++index] = nums[i];else break;
        }
        return index + 1;
    }
}