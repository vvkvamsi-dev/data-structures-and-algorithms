class Solution {
    public boolean isPalindrome(int x) {
        int original = x;
        int rev = 0;
        if(x < 0){
            return false;
        }
        while(x != 0){
            int digit = x % 10;
            rev = rev*10 + digit;
            x /= 10;
        }
        return rev == original;
    }
}

// Slightly more optimized O(log n/2) but as constants are dropped it is same as before
class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int reversedHalf = 0;

        while (x > reversedHalf) {
            int digit = x % 10;
            reversedHalf = reversedHalf * 10 + digit;
            x /= 10;
        }
        return x == reversedHalf || x == reversedHalf / 10;
    }
}