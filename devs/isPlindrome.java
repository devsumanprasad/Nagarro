class Solution {
    public boolean isPalindrome(int x) {

        String str = String.valueOf(x);
        StringBuilder sb = new StringBuilder(str);
        String rev = sb.reverse().toString();
        if(str.equals(rev))
            return true;
        return false;
        
    }
}
