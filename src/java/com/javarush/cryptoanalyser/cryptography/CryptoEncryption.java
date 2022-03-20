package com.javarush.cryptoanalyser.cryptography;

import com.javarush.cryptoanalyser.userinterface.Dialogue;

import java.util.Scanner;


public class CryptoEncryption {

   String message;
   int shiftKey;

    public void encrypt() {
        System.out.println("Please enter text to encrypt.");
        message = new Scanner(System.in).nextLine();
        new Dialogue().startDialogueInEncryption();
        System.out.println("Please confirm your key again.");
        shiftKey = new Scanner(System.in).nextInt();

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
            System.out.println("Encryption in progress.");
            Thread.sleep(2500);
            System.out.println();
            System.out.println("Your cipher text - " + cipherText + "\n" );

        } catch(InterruptedException exception) {
            exception.printStackTrace();
        }
    }

}

