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
            System.out.println("To close application - please type \"exit\"");
            Thread.sleep(1500);
            System.out.println("To continue - please type \"next\"");

                String message = console.nextLine();
                if (message.equalsIgnoreCase("exit")) {
                    System.out.println("Application closed.");
                    console.close();
                } if (message.equalsIgnoreCase("next")){
                    new CryptoDecryption().decrypt();
                } if ( !message.equalsIgnoreCase("exit") && !message.equalsIgnoreCase("next")) {
                    System.out.println("Please try again");
                     startDialogueInDecryption();
                }
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }

}
