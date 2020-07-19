class Solution {
	public boolean isAnagram(String s, String t) {
        if( s.length() != t.length() ) {
            return false;
        }
        int[] result = new int[26];
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();
        for(int i=0; i<s.length(); i++){
            result[sChar[i] - 'a'] ++;
            result[tChar[i] - 'a'] --;
        }
        for(int j=0; j<result.length; j++){
            if(result[j] != 0){
                return false;
            }
        }
        return true;
    }
}