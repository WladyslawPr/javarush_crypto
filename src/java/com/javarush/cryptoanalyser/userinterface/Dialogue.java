package com.javarush.cryptoanalyser.userinterface;


public class Dialogue {


    public void start () {

        try {
            System.out.println("Starting console application");
            Thread.sleep(2500);
            System.out.println("With this application you can\n** ciphertext **\n** Deciphering text with a key **\n** Brute Force Transcription **");
            System.out.println();
            Thread.sleep(2000);
        } catch(InterruptedException exception) {
            exception.printStackTrace();
        }


    }

}
