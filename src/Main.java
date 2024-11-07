import exceptions.WrongLoginException;
import exceptions.WrongPasswordException;

public class Main {
    public static void main(String[] args) {
        String[] logins = {"fwrkin", "jsdfjkbd123", "vov_vav"};
        String[] passwords = {"12345678", "megadeth_less_popular_than_metallica_but_like-their_solos_more", "sdf#12 fd"};
        String[] confirmPasswords = {"12345678", "pipupa", "sdf#12 fd"};
    }

    public static void isValidRegistration(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (!(login.length() <= 20 && login.matches("\\w+"))) {
            throw new WrongLoginException("choose another login");
        }

        if (password.length() > 20 && !login.matches("\\w+")) {
            throw new WrongPasswordException("choose another password");
        }

        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("yor passwords should be the same");
        }
    }
}