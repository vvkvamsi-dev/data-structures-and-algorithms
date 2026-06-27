class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(Integer i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        Integer len = nums.length/2;
        Integer ans = 0;
        for(Integer i : map.keySet()){
            if(map.get(i) > len){
                ans = i;
                break;
            }
        }
        return ans;
    }
}