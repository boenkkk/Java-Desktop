import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;

public class tesEcnryp {
	
	public static void main(String[] args) throws NoSuchAlgorithmException {
		String plain = "p2apst123";
		MessageDigest md = MessageDigest.getInstance("MD5");
		byte[] encryptedPassword = md.digest(plain.getBytes());
		String encodedBytes = Base64.encode(encryptedPassword);
		String enc = (encodedBytes.replaceAll("[$=]",""));
		
		System.out.println("plain : "+plain);
		System.out.println("md : "+md);
		System.out.println("encryptedPassword : "+encryptedPassword);
		System.out.println("encodedBytes : "+encodedBytes);
		System.out.println("enc : "+enc);
	}
	
}
