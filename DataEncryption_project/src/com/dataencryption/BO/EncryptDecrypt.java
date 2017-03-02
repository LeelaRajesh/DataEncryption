package com.dataencryption.BO;

import java.security.Key;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

public class EncryptDecrypt {
	private static final String ALGO = "AES";
	private static final byte[] KeyValue = 
		new byte [] {'L','e','e','l','a','R',
		'a','j','e','s','h','S','a','y','a','n'};
	
	public Key generateKey(){
		Key key = new SecretKeySpec(KeyValue, ALGO);
		return key;
	}
	public String encrypt(String data) throws Exception{
		Key key = generateKey();
		Cipher c = Cipher.getInstance(ALGO);
		c.init(Cipher.ENCRYPT_MODE, key);
		byte [] encValue = c.doFinal(data.getBytes());
		String encryptedValue = new BASE64Encoder().encode(encValue);
		return encryptedValue;
	}
	
	public String decrypt(String encryptmessage) throws Exception{
		Key key = generateKey();
		Cipher c = Cipher.getInstance(ALGO);
		c.init(Cipher.DECRYPT_MODE, key);
		byte[] decodedValue = new BASE64Decoder().decodeBuffer(encryptmessage);
		byte[] decValue = c.doFinal(decodedValue);
		String decrptedValue = new String(decValue);
		return decrptedValue;
	}
}
