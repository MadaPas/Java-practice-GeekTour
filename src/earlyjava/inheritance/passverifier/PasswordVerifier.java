package earlyjava.inheritance.passverifier;

import javax.swing.JOptionPane;

public class PasswordVerifier {

    public static void main(String[] args) {
        boolean retry;
        do {
            String input = JOptionPane.showInputDialog("Enter a password.");
            PasswordCheck c = new PasswordCheck(input);
            if (c.checkPassword()) {
                System.out.println("Password meets requirements.");
                retry = false;
            } else {
                System.out.println("Password does not meet requirements. Try again.");
                retry = true;
            }
        } while (retry);
        System.exit(0);
    }
}