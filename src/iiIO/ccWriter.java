package iiIO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ccWriter {

	public static void main(String[] args) {
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("newfile.txt"));
			writer.write("Baris 1\n");
			
			//nulis text ke file
			writer.flush();
			writer.write("Baris 2");

			//selalu close saat selesai proses
			//close juga termasuk flush
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
