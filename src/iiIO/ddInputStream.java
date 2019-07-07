package iiIO;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class ddInputStream {

	public static void main(String[] args) {
		try {
			URL url = new URL("http://www.google.com");
			URLConnection urlconn = url.openConnection();
			InputStream is = urlconn.getInputStream();
			int byteRead;
			do {
				byteRead = is.read();
				System.out.print((char) byteRead);
			} while (byteRead != -1);
			//byteRead adalah -1 artinya sudah tidak ada lagi data yang bisa dibaca / EOF
		} catch (MalformedURLException ex) {
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

}