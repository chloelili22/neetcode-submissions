class Solution {
    public boolean isPalindrome(String s) {
        if(s.length() == 0){
            return true;
        }
       // The java.lang.Character.isLetterOrDigit(char ch) is an 
       // inbuilt method in java which determines 
       // if the specified character is a letter or digit. 

        // using l pointer points to the left first string and r pointer points to the last char of the string
       int l = 0; 
       int r = s.length() - 1;
       // loop thru l and r until they meet
       while(l < r) {
        // increment l if the pointer points to a non-igit/char
        while(l < r && !Character.isLetterOrDigit(s.charAt(l))){
            l+=1; // equals l++
        }
        // decrement r if the pointer points to a non-digit/char
        while(r > l && !Character.isLetterOrDigit(s.charAt(r))){
            r-=1; // equals r--
        }

        // if both pointers point to l and r are same, return true
        if(Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))){
            return false;
        }
        l++;
        r--;
       }
       return true;
    }
}
