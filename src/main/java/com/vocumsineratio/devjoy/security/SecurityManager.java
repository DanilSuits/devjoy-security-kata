package com.vocumsineratio.devjoy.security;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.MessageFormat;

public class SecurityManager {
    public static void createUser() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a username");
        String username = reader.readLine();
        System.out.println("Enter your full name");
        String fullName = reader.readLine();
        System.out.println("Enter your password");
        String password = reader.readLine();
        System.out.println("Re-enter your password");
        String confirmPassword = reader.readLine();

        if (!password.equals(confirmPassword)) {
            System.out.println("The passwords don't match");
            return;
        }

        if (password.length() < 8) {
            System.out.println("Password must be at least 8 characters in length");
            return;
        }

        // Encrypt the password (just reverse it, should be secure)
        String encryptedPassword = (new StringBuilder(password)).reverse().toString();

        MessageFormat fmt = new MessageFormat("Saving Details for User ({0}, {1}, {2})\n");

        System.out.println(
                fmt.format(new Object[]{
                        username,
                        fullName,
                        encryptedPassword
                }));
    }
}
