package aPengenalanJava.ddException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ffThrowsExceptionTest {
	public static void main(String[] args) throws FileNotFoundException, IOException{
		FileInputStream inputStream = new FileInputStream("file.txt");
		System.out.println("Kode setelah buka file");
	}
}