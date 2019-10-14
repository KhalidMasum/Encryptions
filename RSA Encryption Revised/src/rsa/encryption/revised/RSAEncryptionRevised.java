/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rsa.encryption.revised;



/**
 *
 * @author Labnan
 */
public class RSAEncryptionRevised {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    /*                      // -----Uncomment this for key generation------
        KeyGeneration keygen = new KeyGeneration(191,193);                      //Contains two prime numbers as parameter
        keygen.makeEncryptKey();
        keygen.makeDecryptKey();
        System.out.println("Encryption Key is " +keygen.encryptKey);
        System.out.println("Decryption Key is " +keygen.decryptKey);
        System.out.println("The common key is "+keygen.commonkey);
     */
     
       
    /*                        //---Uncomment to encrypt a message---
        Cryptor encryptor = new Cryptor();
        encryptor.message= "A quick brown fox jumps over the lazy dog";         //Change the message based on necessity
        encryptor.commonKey= 36863 ;
        encryptor.encrypt(7);                                                   //Change the keys based on necessity
    */    
        
      
       
    /*                        //Uncomment to decrypt an encrypted message
        Cryptor decryptor = new Cryptor();
        decryptor.commonKey = 36863 ;
        decryptor.decrypt(10423);                                              ///Change the keys based on necessity. The message will be asked to enter
    */
                
        
        
        
    }
    
}
