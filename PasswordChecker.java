import java.util.Scanner;

public class PasswordChecker {
    static String caesarCipher(String text, int shift) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) ('a'+(ch - 'a' + shift) % 26);
            } 
            else if (ch >= 'A' && ch <= 'Z') {
                ch = (char) ('A'+(ch - 'A' + shift) % 26);
            }
            result += ch;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String password = sc.nextLine();

        boolean digit = false;
        boolean special = false;

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (Character.isDigit(ch)) {
                digit = true;
            } 
            if (!Character.isLetterOrDigit(ch)) {
                special = true;
            }
        }
        System.out.println("Password checking: ");
        if (password.length()>= 8 && digit && special) {
            System.out.println("Password is strong.");
            String encryptedPassword = caesarCipher(password, 3);
            System.out.println("Caesar Cipher Password: " + encryptedPassword);
        } 
         else {
            System.out.println("Password is weak.");
            System.out.println("Password must be at least 8 characters long and contain at least one digit and one special character.");
        }
        sc.close();
    }
}
