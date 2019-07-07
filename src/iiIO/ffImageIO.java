package iiIO;

import java.io.*;
import java.net.*;
import javax.swing.*;
import javax.imageio.*;

public class ffImageIO {

	public static void main(String[] args) {
		try {
			URL url = new URL("https://www.google.com/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png");
			URLConnection urlconn = url.openConnection();
			InputStream is = urlconn.getInputStream();
			OutputStream os = new FileOutputStream("google.png");
			int byteRead;
			do {
				byteRead = is.read();
				os.write(byteRead);
			} while (byteRead != -1);
			os.flush();
			os.close();
			
			// menampilkan image
			Icon icon = new ImageIcon(ImageIO.read(new File("image.png")));
			JOptionPane.showMessageDialog(null, "ini gambar", "menampilkan gambar", JOptionPane.INFORMATION_MESSAGE, icon);
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

}