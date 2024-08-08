package Questions;

public class PalindromeNumber {

    public static void main(String[] args) {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        System.out.println(palindromeNumber.isPalindrome(1212));
    }

    public boolean isPalindrome(int x) {

        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int palindrome = 0;
        while (x > palindrome) {
            palindrome = palindrome * 10 + (x % 10);
            x /= 10;
        }
        return palindrome == x || palindrome / 10 == x;
    }
}
