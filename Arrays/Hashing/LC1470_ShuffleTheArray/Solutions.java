class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] temp = new int[2*n];
        temp[0] = nums[0];
        temp[2*n-1] = nums[2*n-1];
        for(int i = 1; i <= n-1 ; i++){
            temp[2*i] = nums[i];
            temp[2*i - 1] = nums[i + n -1];
        }
        return temp;
    }
}