package p0035;
class Solution {
    public static void main(String[] args) {
    }

    public int searchInsert(int[] nums, int target) {
        int mid = 0, left = 0, right = nums.length - 1;
        while(left <= right){
            mid = (left + right) >> 1;
            if(target <= nums[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}