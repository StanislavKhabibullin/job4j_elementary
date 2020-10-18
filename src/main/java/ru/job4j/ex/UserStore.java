package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        boolean rsl = false;
        int k = 0;
        for (int i = 0; i < users.length; i++) {
            if (users[i].getUsername().equals(login)) {
                rsl = true;
                k = i;
            }
        }
        if (!rsl) {
            throw new UserNotFoundException("There is no such username in  massive");
        }
        return users[k];
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValid()) {
            throw new UserInvalidException(" useris not valid");
        } else if (user.getUsername().length() < 3) {
            throw new UserInvalidException("username is less than three elements");
        }
        return true;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentiev", true),
                new User("Tommy", false),
                new User("Alex", true)
        };
        try {
            User check = findUser(users, "Tommy");
            if (check != null) {
                validate(check);
            }
        } catch (UserInvalidException ee) {
            ee.printStackTrace();
        } catch (UserNotFoundException e) {
            e.printStackTrace();
        }

        try {
            User check = findUser(users, "Nik");
            if (check != null) {
                validate(check);
            }
        } catch (UserInvalidException ee) {
            ee.printStackTrace();
        } catch (UserNotFoundException e) {
            e.printStackTrace();
        }

    }
}
