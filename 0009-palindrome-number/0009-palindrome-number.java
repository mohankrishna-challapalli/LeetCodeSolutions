class Solution {
    public boolean isPalindrome(int x) {
        // Check if the input is negative. If it is, return false.
        if (x < 0) {
            return false;
        }

        // Reverse the input number.
        int reversedNumber = 0;
        int temp = x;
        while (temp > 0) {
            int remainder = temp % 10;
            reversedNumber = (reversedNumber * 10) + remainder;
            temp /= 10;
        }

        // Compare the original number with the reversed number.
        // If they are equal, return true. Otherwise, return false.
        return x == reversedNumber;
    }
}
