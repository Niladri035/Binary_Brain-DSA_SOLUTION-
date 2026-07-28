class Solution {
    // mapping from each digit to letters
    String[] mapping = new String[] {
            "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
    };

    List<String> res = new LinkedList<>();
    StringBuilder sb = new StringBuilder();

    public List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) {
            return res;
        }
        // start backtracking from digits[0]
        backtrack(digits, 0);
        return res;
    }

    // main function of backtracking algorithm
    void backtrack(String digits, int start) {
        if (sb.length() == digits.length()) {
            // reached the bottom of the backtracking tree
            res.add(sb.toString());
            return;
        }

        // backtracking algorithm framework
        int digit = digits.charAt(start) - '0';
        for (char c : mapping[digit].toCharArray()) {
            // make a choice
            sb.append(c);
            // recursively backtrack to the next level
            backtrack(digits, start + 1);
            // undo the choice
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}