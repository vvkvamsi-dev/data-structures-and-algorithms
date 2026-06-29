// Optimal - Two Pointer
class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for(int j = 0;j<nums.length;j++){
            if(nums[i] != nums[j]){
                nums[i+1] = nums[j];
                i++;
            }
        }
        return i+1;
    }
}

// using LinkedHashMap
class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 0;

        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for(int i = 0;i<nums.length;i++){
            set.add(nums[i]);
        }
        for(int i : set){
            nums[count] = i;
            count++;
        }
        return count;
    }
}

