class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty()){
            return true;
        }
        int start = 0;
        int last = s.length()-1;
        
        while(start<=last){
            char currentStart = s.charAt(start);
            char currentLast = s.charAt(last);
            if(!Character.isLetterOrDigit(currentStart)){
                start++;
            }
            else if(!Character.isLetterOrDigit(currentLast)){
                last--;
            }
            else{
                if(Character.toLowerCase(currentStart) != Character.toLowerCase(currentLast)){
                    return false;
                }
                start++;
                last--;
            }
        }
        return true;
    }
}