class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        HashMap <Character, Integer> newSet = new HashMap<Character, Integer>();
        // count the frequency of characters in s
        // string.toCharArray(): It returns a newly allocated character array.
        // converts the given string into a sequence of characters. The returned 
        // array length is equal to the length of the string.
        for (char i : s.toCharArray()){
            // HashSet.getOrDefault(): is used to get the value mapped with specified key. 
            // If no value is mapped with the provided key then the default value is returned
            newSet.put(i, newSet.getOrDefault(i, 0) + 1);
        }

        // decrease the frequency of existing characters from s in t
        for(char j : t.toCharArray()){
            newSet.put(j, newSet.getOrDefault(j, 0) - 1);
        }

        // if the value in HashMap is not 0; two strings do not match
        for (int k : newSet.values()){
            if(k != 0) {
                return false;
            }
        }
        return true;
    }
}
