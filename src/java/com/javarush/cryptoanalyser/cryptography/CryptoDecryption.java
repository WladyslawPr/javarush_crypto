package com.javarush.cryptoanalyser.cryptography;

import java.util.Scanner;

public class CryptoDecryption extends CryptoEncryption {

    public void decrypt() {

        System.out.println("If you want to decrypt the text back - please enter the text in encrypted format");
        message = new Scanner(System.in).nextLine();
        System.out.println("You must also specify the key - which was specified during encryption");

        System.out.println("Please enter key");
        shiftKey = new Scanner(System.in).nextInt();

        String cipherText = "";

        for (int i = 0; i < message.length(); i++) {
            char chars = message.charAt(i);

            if (Character.isLetter(chars)) {
                if (Character.isLowerCase(chars)) {
                    char symbols = (char) ( chars - shiftKey );
                    if (symbols < 'a') {
                        cipherText += (char) ( chars + ( 26 - shiftKey ) );

                    } else {
                        cipherText += symbols;
                    }
                } else if (Character.isUpperCase(chars)) {
                    char symbols = (char) ( chars - shiftKey );
                    if (symbols < 'A') {
                        cipherText += (char) ( chars + ( 26 - shiftKey ) );

                    } else {
                        cipherText += symbols;
                    }
                }
            } else {
                cipherText += chars;
            }
        }

        try {
            System.out.println("Decryption in progress");
            Thread.sleep(2500);
            System.out.println();
            System.out.println("Your decryption text - " + cipherText);

        } catch ( InterruptedException exception ) {
            exception.printStackTrace();
        }

    }
}
