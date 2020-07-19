class Solution {
	public int[] twoSum(int[] nums, int target) {
        int [] result = new int[2];
        Map<Integer,String> numsMap = new HashMap();
        for(int i=0; i<nums.length; i++){
            if(numsMap.containsKey(nums[i])){
                numsMap.put(nums[i],numsMap.get(nums[i])+","+String.valueOf(i));
            }else{
                numsMap.put(nums[i],String.valueOf(i));
            }
        }
        for(int j=0; j<nums.length; j++){
            if(numsMap.containsKey(target-nums[j])){
                String[] resultString = numsMap.get(target-nums[j]).split(",");
                int tmp = Integer.valueOf(resultString[0]);
                if(j != tmp){
                    result[0] = j;
                    result[1] = tmp;
                    return result;
                }
            }
        }
        return result;
    }
}