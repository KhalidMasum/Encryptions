# An RSA encryption works this way.....

The encryption method uses two different keys, one for public use, another is private. Public key is known by everyone,
which is used for encryption purposes. Therefore it is  called public key cryptography. However the private key is necessary for decription, therefore only the decriptors have this. This method of encryption has made it possible for us to use day to day encryption by everyone handled by a third party organization. Also usage of a bigger number with a complex calculation made it strong, unbreakable.


# How it is done:
The key's look like this:
Public key: (e,n) 
Private key: (d,n) 
People use the public key to encrypt their message.
## This way:
We take the position value of the letter, eg. position value of b is 2.
Then it goes through this formulla :
### encrypted letter = 2<sup>e</sup> mod n

Decriptors use the private key to decrypt the message.
## This way:
We take the encrypted position value and use the same formulla, but we use d, instead of e.
### decrypted letter = 2<sup>e</sup> mod n


# Want to be the key maker?

The steps to make the keys (e,n,d) is pretty simple.
## Step 1: Choose prime numbers
Take two prime numbers. The bigger, the better! Let them be p and q.

## Step 2: Find n

Multiply these two numbers. Hence we get one of the keys! It's the n from (e,n) and (d,n). 
### n=pq

## Step 3: 

We need to find how many numbers is coprime with the number p and q, and less than pq. This function helps us finding this number
### Number of coprimes ψ(n) = (p-1)(q-1)

## Step 4: Choose e

e is the encryption public key. It's the e used in the public key (e,n)
We have a lot of e's to choose from depending on how big p and q are!
Two conditions must be followed while choosing the number:
 i. {1<e<ψ(n)}
 ii. e is coprime with N and ψ(n)
 
 ## Step 5: Choose d
 d is the private key used for encryption. It's the e used in the public key (e,n).
 The following method is used to find and choose d.
 
 de mod ψ(n)=1
 d= Inverse of (e mod ψ(n))
 
 
 <p> Now jump into coding, start making the keys, then start spying >_> hurray X3!</p>
 
 
 
 
 





