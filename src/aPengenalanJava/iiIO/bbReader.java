package aPengenalanJava.iiIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class bbReader {
	
	public static void main(String[] args) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(".classpath"));
			String line;
			while ((line = reader.readLine())!=null) {
				System.out.println(line+"\n");
			}
			//selalu close saat selesai proses
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}