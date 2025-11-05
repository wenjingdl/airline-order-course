package com.postion.airlineorderbackend;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class PasswordGenerator {

    public static void main(String[] args) {
        // PasswordEncoder
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

        // Input Password
        String rawPassword = "password";

        // Encoded Password (for database)
        String encodedPassword = passwordEncoder.encode(rawPassword);

        // Output Password
        System.out.println("Plaintext: " + rawPassword);
        System.out.println("Encoded Password (for database): " + encodedPassword);
    }
}
