package com.javarush.cryptoanalyser.userinterface;


import com.javarush.cryptoanalyser.cryptography.CryptoDecryption;

import java.util.Scanner;

public class Dialogue {


    public void start () {

        try {
            System.out.println("Starting console application.");
            Thread.sleep(2500);
            System.out.println("With this application you can\n** ciphertext with a key **\n** Deciphering text with a key **\n** Brute Force Transcription **");
            System.out.println();
            Thread.sleep(2000);
        } catch(InterruptedException exception) {
            exception.printStackTrace();
        }

    }

    public int startDialogueInEncryption() {
        try {
            while (true) {
                System.out.println("Please enter key.");
                int shiftKey = Integer.parseInt(new Scanner(System.in).nextLine());
                return shiftKey;
            }
        } catch ( NumberFormatException exception ) {
            //   exception.printStackTrace();
            System.out.println("Incorrect data! \nThe key must consist only of numbers.\nPlease try again.");
            return startDialogueInEncryption();
        }
    }



    public void startDialogueInDecryption () {
        try (Scanner console = new Scanner(System.in)) {
            Thread.sleep(2000);
            System.out.println("If you want to close application - please enter \"exit\"");
            Thread.sleep(1500);
            System.out.println("If you want to continue - please enter \"next\"");

                String message = console.nextLine(); // if user enter not up to date ?
                if (message.equalsIgnoreCase("exit")) {
                    console.close();
                    System.out.println("Application closed.");
                } else if (message.equalsIgnoreCase("next")){
                    new CryptoDecryption().decrypt();
                }
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }

    }

}
