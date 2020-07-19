class Solution {
	public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> resultMap = new HashMap<>();
        int[] count = new int[26];
        StringBuilder key;
        for(String str : strs){
            Arrays.fill(count,0);
            for(char cstr : str.toCharArray()){
                count[cstr-'a']++;
            }
            key = new StringBuilder();
            for(int tmp : count) {
                key.append(tmp).append("#");
            }
            if(resultMap.containsKey(key.toString())) {
                resultMap.get(key.toString()).add(str);
            }else{
                resultMap.put(key.toString(),new ArrayList<String>());
                resultMap.get(key.toString()).add(str);
            }
        }
        return new  ArrayList(resultMap.values());
    }
}