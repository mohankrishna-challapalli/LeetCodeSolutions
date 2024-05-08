class Solution {
    public int lengthOfLastWord(String s) {
        // Trim the input string to remove leading and trailing spaces
        s = s.trim();
        
        // Find the last space in the trimmed string
        int lastSpaceIndex = s.lastIndexOf(' ');
        
        // If no space is found, the entire string is a single word
        if (lastSpaceIndex == -1) {
            return s.length();
        }
        
        // Return the length of the last word by subtracting the index of the last space
        // from the length of the trimmed string
        return s.length() - lastSpaceIndex - 1;
    }
}
