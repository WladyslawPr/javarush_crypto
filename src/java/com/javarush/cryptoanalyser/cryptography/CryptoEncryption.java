package com.javarush.cryptoanalyser.cryptography;

import java.util.Scanner;


public class CryptoEncryption {

    String message;
    int shiftKey;

    public void encrypt() {

        Scanner console = new Scanner(System.in);

        System.out.println("Please enter text to encrypt");
        message = console.nextLine();

        System.out.println("Please enter key");
        shiftKey = console.nextInt();

        String cipherText = "";


        for (int i = 0; i < message.length(); i++) {
            char chars = message.charAt(i);

            if (Character.isLetter(chars)) {
                if (Character.isLowerCase(chars)) {
                    char symbols = (char) ( chars + shiftKey );
                    if (symbols > 'z') {
                        cipherText += (char) ( symbols - ( 26 - shiftKey ) );

                    } else {
                        cipherText += symbols;
                    }
                } else if (Character.isUpperCase(chars)) {

                }
            } else {
                cipherText += chars;
            }
        }

        try {
            System.out.println("Encryption in progress");
            Thread.sleep(2500);
            System.out.println();
            System.out.println("Your ciphertext - " + cipherText );

        } catch(InterruptedException exception) {
            exception.printStackTrace();
        }
    }
}

