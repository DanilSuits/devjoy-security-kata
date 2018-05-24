package com.vocumsineratio.devjoy.example;

import com.vocumsineratio.devjoy.security.SecurityManager;

import java.io.IOException;

public class ConsoleDemonstration {
    public static void main(String[] args) throws IOException {
        SecurityManager.createUser();
    }
}
