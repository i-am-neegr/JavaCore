import exceptions.WrongLoginException;
import exceptions.WrongPasswordException;

public class Main {
    public static void main(String[] args) {
        String[] logins = {"fwrkin", "jsdfjkbd123", "vov_vaЖДЖ|v"};
        String[] passwords = {"12345678", "megadeth_less_popular_than_metallica_but_like-their_solos_84354more", "sdf#12 fd"};
        String[] confirmPasswords = {"12345678", "jfhdsjk", "sdf#12 fd"};

        for (int i = 0; i < 3; i++) {
            try {
                isValidRegistration(logins[i], passwords[i], confirmPasswords[i]);
            } catch (WrongLoginException | WrongPasswordException exception) {
                System.out.println(exception.getMessage());
                System.out.println(logins[i] + "___" + passwords[i] + "___" + confirmPasswords[i]);
            } catch (Exception exception) {
                System.out.println("неизвестная ошибка");
                System.out.println(exception.getMessage());
            } finally {
                System.out.println("проверка завершена");
            }
        }
    }

    public static void isValidRegistration(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (login.length() > 20 || !login.matches("\\w+")) {
            throw new WrongLoginException("choose another login");
        }

        if (password.length() > 20 || !login.matches("\\w+")) {
            throw new WrongPasswordException("choose another password");
        }

        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("yor passwords should be the same");
        }
    }
}