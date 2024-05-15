public class Main {
    public static void main(String[] args) {
        String login = "Login123_";
        String password = "Password123_";
        String confirmPassword = "Password123_";
        try {
            validate(login, password, confirmPassword);
        } catch (WrongLoginException exception) {
            System.out.println("Попробуйте задать Логин заново!");
        } catch (WrongPasswordException exception) {
            System.out.println("Пароли не совпадают");
        }

    }

    public static void validate(String login, String password, String confirmPassword) {
        if (login.length() >= 20 || !login.matches("^[a-zA-Z0-9_]+$")) {
            throw new WrongLoginException();
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException();
        }

    }
}