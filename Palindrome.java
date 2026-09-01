
class Palindrome {

    public static void main(String args[]) {
        String s = "tab is cat";
        System.out.print(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        if (s == null) {
            return false;
        }

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            char cLeft = s.charAt(left);
            char cRight = s.charAt(right);

            // If the character at 'left' is not alphanumeric, move right
            if (!Character.isLetterOrDigit(cLeft)) {
                left++;
            } // If the character at 'right' is not alphanumeric, move left
            else if (!Character.isLetterOrDigit(cRight)) {
                right--;
            } // Both are alphanumeric, compare them case-insensitively
            else {
                if (Character.toLowerCase(cLeft) != Character.toLowerCase(cRight)) {
                    return false;
                }
                left++;
                right--;
            }
        }

        return true;
    }
}
