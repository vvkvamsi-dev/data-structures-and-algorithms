// Approach 4 - Optimized Version
class Solution {
    public int[] runningSum(int[] nums) {
        int sum = 0;
        for(int i = 1; i < nums.length ; i++){
            nums[i] += nums[i-1];
        }
        return nums;
    }
}

//Approach 3 - optimized but uses extraa space of sum
class Solution {
    public int[] runningSum(int[] nums) {
        int sum = 0;
        for(int i = 0; i < nums.length ; i++){
            sum += nums[i];
            nums[i] = sum;
        }
        return nums;
    }
}

//Approach 2 - optimized in terms of TC but uses extra space
class Solution {
    public int[] runningSum(int[] nums) {
        int[] sumArr = new int[nums.length];
        int sum = 0;

        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
            sumArr[i] = sum;
        }

        return sumArr;
    }
}

//Approach 1 - Brute Force
class Solution {
    public int[] runningSum(int[] nums) {
        int[] sumArr = new int[nums.length];

        for(int i = 0; i < nums.length; i++) {
            int temp = 0;
            int sum = 0;

            while(temp <= i) {
                sum += nums[temp];
                temp++;
            }
            sumArr[i] = sum;
        }
        return sumArr;
    }
}

