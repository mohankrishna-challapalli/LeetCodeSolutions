class Solution {
  public boolean isPalindrome(int x) {
    if (x < 0 || (x % 10 == 0 && x != 0)) {
      return false;
    }
  
    int reversed = 0;
    while (x > reversed) {
      int lastDigit = x % 10;
      if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && lastDigit > 7)) {
        return false;
      }
      reversed = reversed * 10 + lastDigit;
      x /= 10;
    }
  
    // Handle palindromes with even number of digits
    return x == reversed || x == reversed / 10;
  }
}
