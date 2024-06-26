class Solution {
  public String longestCommonPrefix(String[] strs) {
    if (strs.length == 0) return ""; // Handle empty array

    String prefix = strs[0]; // Initialize prefix with the first string

    for (int i = 1; i < strs.length; i++) {
      while (strs[i].indexOf(prefix) != 0) { // Check if prefix is present at the beginning of current string
        prefix = prefix.substring(0, prefix.length() - 1); // Shorten the prefix if not
        if (prefix.isEmpty()) return ""; // If prefix becomes empty, return empty string
      }
    }

    return prefix;
  }
}
