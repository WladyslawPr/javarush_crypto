package com.javarush.cryptoanalyser.cryptography;

import java.util.Scanner;


public class CryptoEncryption {
    String message;
    int shiftKey;

    public void encrypt() {

        System.out.println("Please enter text to encrypt");
        message = new Scanner(System.in).nextLine();
        System.out.println("Please enter key");
        shiftKey = new Scanner(System.in).nextInt(); // if key is not number ? (InputMismatchException)

        String cipherText = "";

        for (int i = 0; i < message.length(); i++) {
            char chars = message.charAt(i);

            if (Character.isLetter(chars)) {
                if (Character.isLowerCase(chars)) {
                    char symbols = (char) ( chars + shiftKey );
                    if (symbols > 'z') {
                        cipherText += (char) ( chars - ( 26 - shiftKey ) );

                    } else {
                        cipherText += symbols;
                    }
                } else if (Character.isUpperCase(chars)) {
                    char symbols = (char) ( chars + shiftKey );
                    if (symbols > 'Z') {
                        cipherText += (char) ( chars - ( 26 - shiftKey ) );

                    } else {
                        cipherText += symbols;
                    }
                }
            } else {
                cipherText += chars;
            }
        }

        try {
            System.out.println("Encryption in progress");
            Thread.sleep(2500);
            System.out.println();
            System.out.println("Your ciphertext - " + cipherText + "\n" );

        } catch(InterruptedException exception) {
            exception.printStackTrace();
        }
    }
}

