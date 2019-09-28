##An RSA encryption works this way.....

Description:
The encryption method uses two different keys, one for public use, another is private. Public key is known by everyone,
which is used for encryption purposes. Therefore it is  called public key cryptography. However the private key is necessary for decription, therefore only the decriptors have this. This method of encryption has made it possible for us to use day to day encryption by everyone handled by a third party organization. Also usage of a bigger number with a complex calculation made it strong, unbreakable.


How it is done:
The key's look like this:
Public key: (e,n) 
Private key: (d,n)  

People use the public key to encrypt their message.
Decriptors use the private key to decrypt the message.

The steps to make e,n,d is pretty simple.
Step 1:
Take two prime numbers. The bigger, the better! Let them be p and q.

Step 2: 
Multiply these two numbers. Hence we get one of the keys! It's the n from (e,n) and (d,n). 
### n=pq
Step 3:
Let ψ(n) = (p-1)(q-1) which

