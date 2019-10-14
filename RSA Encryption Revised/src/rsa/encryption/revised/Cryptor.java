/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rsa.encryption.revised;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Labnan
 */
public class Cryptor {

    static long commonKey;
    Scanner sc = new Scanner(System.in);
    long[] collectorArray;
    char[] charArray;
    String message;

    {//    void setMessage(String message) {
//        this.message = message;
//    }
    }
    void encrypt(long encryptionKey) {
        
        charArray = message.toCharArray();
        for (long encryptedCharacters : charArray) {
            encryptedCharacters = encryptALetter(encryptedCharacters, encryptionKey);
            System.out.print(encryptedCharacters + " ");
        }
        System.out.println("-3");

//message= new String (collectorArray);
    }

    void decrypt(long decryptionKey) {
        long plainLongOfCharacter, encryptedLong;
        do {
            encryptedLong = sc.nextLong();
            if(encryptedLong==-3) break;
            plainLongOfCharacter= decryptALetter(encryptedLong, decryptionKey); //plainDouble = ((Math.pow(encryptedDouble, decryptionKey) % commonKey));
            System.out.print((char)(plainLongOfCharacter));//////////////////////**+64
        } while (true);

    }

    long encryptALetter(long letter, long encryptionKey) {
        BigInteger bigLetter = BigInteger.valueOf((long) letter);
        bigLetter = bigLetter.pow((int) encryptionKey);
        bigLetter = bigLetter.mod(BigInteger.valueOf((long) commonKey)); 

        return bigLetter.longValue();
    }

    long decryptALetter(long encryptedLetter, long decryptionKey) {
        BigInteger bigLetter, bigEncryptedLetter;
        bigEncryptedLetter = BigInteger.valueOf((long) encryptedLetter);
        bigLetter = bigEncryptedLetter.pow((int) decryptionKey);
        bigLetter = bigLetter.mod(BigInteger.valueOf((long) commonKey)); 
        return bigLetter.longValue();
    }
}
