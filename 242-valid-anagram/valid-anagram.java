class Solution {
    public boolean isAnagram(String s, String t) {
      /*if(s.length() != t.length())
      return false;
      HashMap <Character, Integer> freqMap = new HashMap<Character, Integer>();
      for(char ch : s.toCharArray()){
        freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
      }
      for(char ch : t.toCharArray()){
      if (!freqMap.containsKey(ch) || freqMap.get(ch) == 0) {
         return false;
       }
       freqMap.put(ch, freqMap.get(ch)-1);
      }
      return true;
*/
     if(s.length() != t.length())
     return false;
     int [] freq = new int[26];
     for(char ch : s.toCharArray()) freq[ch-'a']++;
     for(char ch : t.toCharArray()){
        if(--freq[ch-'a']<0)
        return false;
     }
     return true;
    }
}