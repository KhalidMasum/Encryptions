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
public class KeyGeneration {

    int primeNumber1, primeNumber2;

    //  int commonKey = primeNumber1*primeNumber2;
    int encryptKey, decryptKey, commonkey;
    int numberofCoprimes;

    public KeyGeneration(int primeNumber1,int primeNumber2) {
        commonkey=primeNumber1*primeNumber2;
         numberofCoprimes = (primeNumber1 - 1) * (primeNumber2 - 1);
    }

    public KeyGeneration() {
    }
    

    

    void makeEncryptKey() {
        
        for (int i = 2; i < numberofCoprimes; i++) {
            if (checkCoprime(numberofCoprimes, i)) {
                 if(checkCoprime(commonkey,i))
                 {encryptKey = i;
                break;}
            }
        } 
    }
    void makeDecryptKey()
    {
        for(int i=0;;i++)
        {
         if  (((encryptKey*i)%numberofCoprimes)==1) 
         {
             decryptKey=i;
             break;
         }
        }
    }
    boolean checkCoprime(int number1, int number2) {
        for (int i = 2; i <= Math.min(number1, number2) ; i++) {
            if (((number1 % i) == 0) && ((number2 % i) == 0)) {
                return false;
            }
        }
        return true;
    }

}
