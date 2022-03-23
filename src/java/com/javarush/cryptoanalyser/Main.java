package com.javarush.cryptoanalyser;

import com.javarush.cryptoanalyser.cryptography.BruteForce;
import com.javarush.cryptoanalyser.cryptography.CryptoEncryption;
import com.javarush.cryptoanalyser.userinterface.Dialogue;

public class Main {

    public static void main(String[] args) {

        new Dialogue().start();
        new CryptoEncryption().encrypt();
        new Dialogue().startDialogueInDecryption();
        new BruteForce().compare();

    }

}
