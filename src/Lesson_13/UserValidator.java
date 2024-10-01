package Lesson_13;

public class UserValidator {

    public static boolean validate(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {
        if (login.length() >= 20 || login.contains(" ")) {
            throw new WrongLoginException("Login должен быть меньше 20 символов и не содержать пробелы.");
        }

        if (password.length() >= 20 || password.contains(" ") || !password.matches(".*\\d.*")) {
            throw new WrongPasswordException("Password должен быть меньше 20 символов, не содержать пробелы и " +
                    "содержать хотя бы одну цифру.");
        }

        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Password и confirmPassword должны совпадать.");
        }

        return true;
    }

    public static class WrongLoginException extends Exception {
        public WrongLoginException() {
            super();
        }

        public WrongLoginException(String message) {
            super(message);
        }
    }

    public static class WrongPasswordException extends Exception {
        public WrongPasswordException() {
            super();
        }

        public WrongPasswordException(String message) {
            super(message);
        }
    }
}

