package core.test.common.files;

import java.util.Base64;

public class SecurePass {

	static byte[] actualByte= Base64.getDecoder().decode("c3lzdGVtMTIzKg=="); 
	static String actualString= new String(actualByte); 
	public static final String PAS = actualString;
	
	public static String encode(String plain) {
		return  Base64.getEncoder().encodeToString(plain.getBytes());
	}
	

}
