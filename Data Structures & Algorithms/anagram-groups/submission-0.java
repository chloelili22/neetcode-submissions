class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // create a hashMap to store key as the count of each char in each string in strs
        HashMap <String, List<String>> res = new HashMap<>();

        // loop thru each string in the string array, and count the number of each char of the string
        // create an array to store the count of 26 char
        // loop thru each char in each string and count the occurances
        for (String i: strs) {
            int[] count = new int[26]; 
            /* 
            The Java string toCharArray() method converts the given string into a sequence of characters. 
            The returned array length is equal to the length of the string. 
            */
            for(char j: i.toCharArray()){
                count[j-'a']++; // j-'a' gets the index of each char from ASCII
            }

            // "abc" -> [1,1,1]
            String key = Arrays.toString(count);
            // add the key and value into hashmap
            if(!res.containsKey(key)){
                res.put(key, new ArrayList<>());
            }
            res.get(key).add(i);
        }

        return new ArrayList<>(res.values());
    }
}
